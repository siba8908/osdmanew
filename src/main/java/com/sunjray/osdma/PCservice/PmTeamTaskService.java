package com.sunjray.osdma.PCservice;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.sunjray.osdma.PCmodel.PmTeamTaskMap;

public interface PmTeamTaskService {

	void update(@Valid PmTeamTaskMap pmTeamTaskMap);

	List<Map<String, String>> getAllWorkStatus();

}
