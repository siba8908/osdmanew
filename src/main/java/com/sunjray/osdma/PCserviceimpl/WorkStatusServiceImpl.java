package com.sunjray.osdma.PCserviceimpl;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunjray.osdma.PCmodel.WorkStatus;
import com.sunjray.osdma.PCrepository.WorkStatusRepository;
import com.sunjray.osdma.PCservice.WorkStatusService;

@Service
public class WorkStatusServiceImpl implements WorkStatusService {

	@Resource
	WorkStatusRepository workStatusRepository;
	
	@Override
	public List<WorkStatus> findAll() {
		return workStatusRepository.findByOrderByStatusDateDesc();
	}

	@Override
	public WorkStatus updateDailyWorkStatus(WorkStatus updateWorkStatus) {
		Optional<WorkStatus> workStatus = workStatusRepository.findById(updateWorkStatus.getWorkStatusId());
		WorkStatus result = null;
		if(workStatus.isPresent()) {
			workStatus.get().setRemark(updateWorkStatus.getRemark());
			result = workStatusRepository.save(workStatus.get());
		}
		return result;
	}

}
