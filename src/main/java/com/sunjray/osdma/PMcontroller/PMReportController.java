package com.sunjray.osdma.PMcontroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCservice.PMReportService;
import com.sunjray.osdma.dto.BudgetDto;
import com.sunjray.osdma.dto.ProjectStatusDto;

@RestController
@RequestMapping("/pm")
public class PMReportController {
	@Resource
	PMReportService pMReportService;

	@PostMapping("/fetchBudgetBySiteCode/{sitecode}")
	public List<BudgetDto> fetchBudgetBySiteCode(@PathVariable int sitecode) {
		return pMReportService.fetchBudgetBySiteCode(sitecode);
	}

	@PostMapping("/fetchBudgetByTask/{task}")
	public List<BudgetDto> fetchBudgetByTask(@PathVariable int task) {
		return pMReportService.fetchBudgetByTask(task);
	}

	@PostMapping("/fetchBudgetByProject/{project}")
	public List<BudgetDto> fetchBudgetByProject(@PathVariable int project) {
		return pMReportService.fetchBudgetByProject(project);
	}

	@PostMapping("/fetchProjetStatusBySiteCode/{sitecode}")
	public ProjectStatusDto fetchProjetStatusBySiteCode(@PathVariable int sitecode) {
		return pMReportService.fetchProjetStatusBySiteCode(sitecode);
	}

	@PostMapping("/fetchProjetStatusByTask/{task}")
	public ProjectStatusDto fetchProjetStatusByTask(@PathVariable int task) {
		return pMReportService.fetchProjetStatusByTask(task);
	}

	@PostMapping("/fetchProjetStatusByProject/{project}")
	public ProjectStatusDto fetchProjetStatusByProject(@PathVariable int project) {
		return pMReportService.fetchProjetStatusByProject(project);
	}

}
