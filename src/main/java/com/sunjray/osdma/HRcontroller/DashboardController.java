package com.sunjray.osdma.HRcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hr")

public class DashboardController {
	
	//DASHBOARD
	@RequestMapping(value= "/hr-dashboard",method=RequestMethod.GET)
	public ModelAndView dashboard(){
		return new ModelAndView ("HR/hr-dashboard");
	}
	
	//MANAGE_EMPLOYEE add--Employee
	@RequestMapping(value= "/hr-add-employee",method=RequestMethod.GET)
	public ModelAndView manageEmployee1(){
		return new ModelAndView ("HR/hr-add-employee");
	}
	
	//MANAGE_EMPLOYEE show-employee-details
	@RequestMapping(value= "/hr-show-employee-details",method=RequestMethod.GET)
	public ModelAndView manageEmployee2(){
		return new ModelAndView ("HR/hr-show-employee-details");														
	}
	
	//EMPLOYEE_APPRAISAL
	@RequestMapping(value= "/hr-appraisal",method=RequestMethod.GET) 
	public ModelAndView employeeAppraisal(){ 
		 return new ModelAndView ("HR/hr-appraisal");
	}
	
	//SALARY_MANAGEMENT
	@RequestMapping(value= "/hr-payroll-summary-sheet",method=RequestMethod.GET)
	public ModelAndView salaryManagement(){
		return new ModelAndView ("HR/hr-payroll-summary-sheet");
	}
	  
}