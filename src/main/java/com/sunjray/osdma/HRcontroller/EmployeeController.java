package com.sunjray.osdma.HRcontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.sunjray.osdma.HRmodel.EmployeeList;
import com.sunjray.osdma.HRservice.EmployeeService;

@Controller
@RequestMapping("hr")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	

	/***************************** DispayEmployeeDetailsPage**************************/
	@RequestMapping(value= "/showemployee",method=RequestMethod.GET)
	public ModelAndView employee(){
		System.out.println("....EMPLOYEE....");
		return new ModelAndView ("HR/hr-show-employee-details");
	}
	

	/***************************** DisplayEmployeeList**************************/
	@RequestMapping(value = "/getemployee_list_ajax")
	public @ResponseBody Iterable<EmployeeList> getEmployeelist(HttpSession session) {
		System.out.println("...EMPLOYEELIST.....");

		return employeeService.getEmployeelist( );
	}
	
	/***************************** DispayEmployeeDetailsReport**************************/
	@RequestMapping(value= "/employee_summary_report",method=RequestMethod.GET)
	public ModelAndView employeeReport(){
		System.out.println("....REPORT....");
		return new ModelAndView ("Reports/hr-show-employee-details-report");
	}
	
	
	
}
