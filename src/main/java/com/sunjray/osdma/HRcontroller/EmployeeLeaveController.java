package com.sunjray.osdma.HRcontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.HRmodel.Leave;
import com.sunjray.osdma.HRservice.EmployeeLeaveService;

@Controller
@RequestMapping("hr")
public class EmployeeLeaveController {

	@Autowired
   private EmployeeLeaveService leaveService;
	
	
	@RequestMapping(value= "/leave",method=RequestMethod.GET)
	public ModelAndView leave(){
		System.out.println("....LEAVE....");
		return new ModelAndView ("HR/hr-leave-balance-report");
	}
	
	@RequestMapping(value = "/get_all_details_ajax")
	public @ResponseBody Iterable<Leave> getLeave(HttpSession session) {
		System.out.println("ajax.....");

		return leaveService.getLeave( );
	}
	
	@RequestMapping(value= "/leave_report",method=RequestMethod.GET)
	public ModelAndView leaveReport(){
		System.out.println("....LEAVE_Report....");
		return new ModelAndView ("Reports/hr-leave-balance-report");
	}
	
}

