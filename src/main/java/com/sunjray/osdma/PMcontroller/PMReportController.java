package com.sunjray.osdma.PMcontroller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCservice.PMReportService;
import com.sunjray.osdma.dto.BudgetDto;

@RestController
@RequestMapping("/pm")
public class PMReportController {
	@Resource
	PMReportService pMReportService;
	
	@PostMapping("/fetchBudget/{filterType}")
	public List<BudgetDto> fetchBudget(@PathVariable int filterType) {
		return pMReportService.fetchBudget(filterType);
	}
	
	@PostMapping("/fetchProjetProgress/{filterType}")
	public Map<String,Integer> fetchProjetProgress(@PathVariable int filterType) {
		return pMReportService.fetchProjetProgress(filterType);
	}
	
}
