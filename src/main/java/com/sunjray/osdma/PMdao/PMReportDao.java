package com.sunjray.osdma.PMdao;

import java.util.List;
import java.util.Map;

import com.sunjray.osdma.dto.BudgetDto;

public interface PMReportDao {

	List<BudgetDto> fetchBudgetTaskWise();

	List<BudgetDto> fetchBudgetSiteCodeWise();

	List<BudgetDto> fetchBudgetProjectWise();

	Map<String, Integer> fetchProjetProgressTaskWise();

	Map<String, Integer> fetchProjetProgressSiteCodeWise();

	Map<String, Integer> fetchProjetProgressProjectWise();

}
