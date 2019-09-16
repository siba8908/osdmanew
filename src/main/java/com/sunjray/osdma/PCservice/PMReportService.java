package com.sunjray.osdma.PCservice;

import java.util.List;

import com.sunjray.osdma.dto.BudgetDto;
import com.sunjray.osdma.dto.ProjectStatusDto;

public interface PMReportService {

	List<BudgetDto> fetchBudgetBySiteCode(int sitecode);

	List<BudgetDto> fetchBudgetByTask(int task);

	List<BudgetDto> fetchBudgetByProject(int project);

	ProjectStatusDto fetchProjetStatusBySiteCode(int sitecode);

	ProjectStatusDto fetchProjetStatusByTask(int task);

	ProjectStatusDto fetchProjetStatusByProject(int project);

}
