package com.sunjray.osdma.PCrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunjray.osdma.PCmodel.EmployeePersonalDetails;
import com.sunjray.osdma.PCmodel.MasterTeam;
import com.sunjray.osdma.PCmodel.PmTeamMember;

public interface PmTeamMemberRepository extends JpaRepository<PmTeamMember, Long> {

	List<PmTeamMember> findByMasterTeam(MasterTeam masterTeam);

	PmTeamMember findByAssignmentIdAndEmployeePersonalDetails(Long assignmentId,
			EmployeePersonalDetails employeePersonalDetails);

}
