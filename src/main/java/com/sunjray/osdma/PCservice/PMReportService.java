package com.sunjray.osdma.PCservice;

import java.util.List;
import java.util.Map;

import com.sunjray.osdma.dto.BudgetDto;

public interface PMReportService {

	List<BudgetDto> fetchBudget(int filterType);

	Map<String, Integer> fetchProjetProgress(int filterType);

}
