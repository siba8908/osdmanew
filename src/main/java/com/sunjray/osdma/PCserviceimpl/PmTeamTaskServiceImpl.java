package com.sunjray.osdma.PCserviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.PCenumeration.Status;
import com.sunjray.osdma.PCmodel.MasterWorkStage;
import com.sunjray.osdma.PCmodel.PmTeamTaskMap;
import com.sunjray.osdma.PCmodel.Sitecode;
import com.sunjray.osdma.PCrepository.MasterWorkStageRepository;
import com.sunjray.osdma.PCrepository.PmTeamMemberRepository;
import com.sunjray.osdma.PCrepository.PmTeamTaskRepository;
import com.sunjray.osdma.PCrepository.SitecodeRepository;
import com.sunjray.osdma.PCservice.PmTeamTaskService;

@Service
public class PmTeamTaskServiceImpl implements PmTeamTaskService {
	@Autowired
	private PmTeamTaskRepository pmTeamTaskRepository;

	@Autowired
	private PmTeamMemberRepository pmTeamMemberRepository;
	
	@Autowired
	private MasterWorkStageRepository  masterWorkStageRepository;
	
	@Autowired
	private SitecodeRepository sitecodeRepository;
 
	@Override
	public void update(@Valid PmTeamTaskMap pmTeamTaskMap) {
		if (pmTeamTaskMap.getMasterTeam().getPmTeamMembers().stream().findFirst().get()
				.getStatus() == Status.ACCEPTED) {
			pmTeamMemberRepository.save(pmTeamTaskMap.getMasterTeam().getPmTeamMembers().stream().findFirst().get());
		} else {
			//MailUtil.sendMail("siba8908@gmail.com", "Task Rejected", "Dear User, "+pmTeamTaskMap.getMasterTask().getTaskName()+"is Rejected by PC");
			pmTeamMemberRepository.save(pmTeamTaskMap.getMasterTeam().getPmTeamMembers().stream().findFirst().get());
		}

	}

	@Override
	public List<Map<String,String>> getAllWorkStatus() {
		List<Sitecode> sitecodeList = sitecodeRepository.findAll();
		List<MasterWorkStage> masterWorkStageList = masterWorkStageRepository.findAll();
		List<PmTeamTaskMap> teamTaskMapList = pmTeamTaskRepository.findAll();
		List<Map<String,String>> completionTaskStatusList = new ArrayList<>();
		
		sitecodeList.forEach(sitecode ->{
			teamTaskMapList.forEach(teamTaskMap -> {
				if(teamTaskMap.getSitecode().getSitecodeId() == sitecode.getSitecodeId()) {
					Map<String,String> completionTaskStatus = new HashMap<>();
					masterWorkStageList.forEach(workStage ->{
						int totalTaskcount = 0;
						int totalCompletedTask = 0;
						if(teamTaskMap.getMasterTask().getMasterWorkStage().getStageId() == workStage.getStageId()) {
							if(teamTaskMap.getTaskStatus()==Status.COMPLETE) {
								totalCompletedTask++;
							}
							totalTaskcount++;
						}
						
						int completionPercentage = 0;
						if(totalTaskcount != 0) {
							completionPercentage = Math.round((totalCompletedTask*100)/totalTaskcount);
						} 
						completionTaskStatus.put(workStage.getStageName(), String.valueOf(completionPercentage));
					});
					
					int totalWorkStatus =  completionTaskStatus.values().stream().mapToInt(Integer::parseInt).sum();
					int totalWorkPercenteage = Math.round(totalWorkStatus/masterWorkStageList.size());
					
					completionTaskStatus.put("% of Work Completion", String.valueOf(totalWorkPercenteage));
					completionTaskStatus.put("Site Code", sitecode.getSiteCode());
					completionTaskStatusList.add(completionTaskStatus);
				}
			});
		});
		return completionTaskStatusList;
	}

}
