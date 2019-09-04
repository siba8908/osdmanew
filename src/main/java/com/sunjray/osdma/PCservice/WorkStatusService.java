package com.sunjray.osdma.PCservice;

import java.util.List;

import com.sunjray.osdma.PCmodel.WorkStatus;

public interface WorkStatusService {

	List<WorkStatus> findAll();

	WorkStatus updateDailyWorkStatus(WorkStatus updateWorkStatus);

}
