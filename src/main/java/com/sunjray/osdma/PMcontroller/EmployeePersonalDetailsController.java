package com.sunjray.osdma.PMcontroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.EmployeePersonalDetails;
import com.sunjray.osdma.PMservice.EmployeePersonalDetailsService;

@RestController
@RequestMapping("/pm")
public class EmployeePersonalDetailsController {
	
	@Resource
	EmployeePersonalDetailsService employeePersonalDetailsService;
	
	private static final String PROJECT_COORDINATOR = "PROJECT COORDINATOR";
	private static final String SITE_MANAGER = "SITE MANAGER";
	private static final String SITE_ENGINEER = "SITE ENGINEER";
	private static final String SITE_ASSISTANCE = "SITE ASSISTANCE";
	
	
	@GetMapping("/fetch-employees-as-project-coordinator")
	public List<EmployeePersonalDetails> fetchEmployeeAsProjectCoordinator() {
		return employeePersonalDetailsService.findByEmployeeDesignation(PROJECT_COORDINATOR);
	}
	
	@GetMapping("/fetch-employees-as-site-manager")
	public List<EmployeePersonalDetails> fetchEmployeeAsSiteManager() {
		return employeePersonalDetailsService.findByEmployeeDesignation(SITE_MANAGER);
	}
	
	@GetMapping("/fetch-employees-as-site-engineer")
	public List<EmployeePersonalDetails> fetchEmployeeAsSiteEngineer() {
		return employeePersonalDetailsService.findByEmployeeDesignation(SITE_ENGINEER);
	}
	
	@GetMapping("/fetch-employees-as-site-assistance")
	public List<EmployeePersonalDetails> fetchEmployeeAsSiteAssistance() {
		return employeePersonalDetailsService.findByEmployeeDesignation(SITE_ASSISTANCE);
	}

}
