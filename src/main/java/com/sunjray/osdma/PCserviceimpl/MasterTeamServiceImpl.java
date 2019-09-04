package com.sunjray.osdma.PCserviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.sunjray.osdma.PCenumeration.Status;
import com.sunjray.osdma.PCmodel.MasterTeam;
import com.sunjray.osdma.PCmodel.PmTeamMember;
import com.sunjray.osdma.PCrepository.MasterTeamRepository;
import com.sunjray.osdma.PCrepository.PmTeamMemberRepository;
import com.sunjray.osdma.PCservice.MasterTeamService;
import com.sunjray.osdma.PMRepository.EmployeePersonalDetailsRepository;
import com.sunjray.osdma.dto.TeamMemberDTO;
import com.sunjray.osdma.util.CommonUtil;

@Service
public class MasterTeamServiceImpl implements MasterTeamService {
	
	@Resource
	MasterTeamRepository masterTeamRepository;
	
	@Resource
	PmTeamMemberRepository pmTeamMemberRepository;
	
	@Resource
	EmployeePersonalDetailsRepository employeePersonalDetailsRepository;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	private static final String FETCH_TEAM_MEMBERS_LIST = "select ed.first_name,ed.last_name,he.employee_code,dm.designation from osdma.t_os_pm_team_member tm left outer join osdma.t_os_hr_emp_personal_dtls ed on tm.employee_id = ed.employee_id left outer join osdma.t_os_hr_emp_add_employee he on ed.employee_id = he.employee_id left outer join osdma.t_os_master_designation dm on he.designation_id = dm.designation_id where tm.team_id = :teamId  order by dm.designation_id";

	

	@Override
	public MasterTeam createTeamWithMembers(TeamMemberDTO teamMemberDTO) {
		MasterTeam masterTeam = new MasterTeam();
		masterTeam.setTeamName(teamMemberDTO.getTeamName());
		MasterTeam result = masterTeamRepository.save(masterTeam);
		
		List<PmTeamMember> pmTeamMembers = new ArrayList<>();
		
		teamMemberDTO.getTeamMembersEmployeeId().forEach(employeeId -> {
			PmTeamMember pmTeamMember = new PmTeamMember();
			pmTeamMember.setMasterTeam(result);
			pmTeamMember.setEmployeePersonalDetails(employeePersonalDetailsRepository.findById(employeeId).get());
			pmTeamMember.setStatus(Status.ACCEPTED);
			
			pmTeamMembers.add(pmTeamMember);
		});
		
		pmTeamMemberRepository.saveAll(pmTeamMembers);
		return result;
		
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<TeamMemberDTO> findByMasterTeam(MasterTeam masterTeam) {
		List<TeamMemberDTO> teamMemberList = new ArrayList<>();
		List<Object[]> results = entityManager.createNativeQuery(FETCH_TEAM_MEMBERS_LIST).setParameter("teamId", masterTeam.getTeamId()).getResultList();

		results.stream().forEach(record -> {
			
			TeamMemberDTO teamMember = new TeamMemberDTO();
			teamMember.setFirstName(CommonUtil.checkNullValue(record[0]));
			teamMember.setLastName(CommonUtil.checkNullValue(record[1]));
			teamMember.setEmployeeCode(CommonUtil.checkNullValue(record[2]));
			teamMember.setDesignation(CommonUtil.checkNullValue(record[3]));
			 
			teamMemberList.add(teamMember);
		});
		return teamMemberList;
	}

}
