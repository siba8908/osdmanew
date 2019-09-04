package com.sunjray.osdma.HRcontroller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.HRmodel.LeaveManagement;
import com.sunjray.osdma.HRservice.HRLeaveService;




@Controller
@RequestMapping("hr")
public class HRLeaveController {
	
	@Autowired
	private HRLeaveService hrService;

	@RequestMapping(value = "/leavemanagement", method = RequestMethod.GET)
	public ModelAndView hr_holiday_leave() {
		// System.out.println("....LOGIN....");
		return new ModelAndView("HR/leavemanagement");
	}
	
	@RequestMapping(value = "/LeaveManagement_ajax", method = RequestMethod.POST)
	public void leave(@RequestBody HashMap<Integer, LeaveManagement> u )
	{
		//System.out.println("JJJJJJJJJJJJJJJJJJJ");
		Integer lm=0;
		//String returnText = "";
		System.out.println(u.size());
		for(int i=0;i<u.size();i++) {
		System.out.println(u.get(i));
	    lm=hrService.LeaveManagement(u.get(i));
	    System.out.println(lm);
		}
		
		//return lm;
		
		
	}
	
	@RequestMapping(value = "/get_leave_details_ajax", method = RequestMethod.GET)
	public @ResponseBody Iterable<LeaveManagement> getLeave(HttpSession session) {
		System.out.println("ajax.....");

		return hrService.getLeave();
	}
	
	@RequestMapping(value= "/leave_detailsBydate_ajax", method = RequestMethod.GET)
	 public @ResponseBody Iterable<LeaveManagement> showatten(@RequestBody LeaveManagement leave) 
	 { 
		 System.out.println("LEAVE DATE");
		 System.out.println(leave.getFromDate());
		 //List<LeaveManagement> leave=null;
		 List<LeaveManagement> lea=hrService.getleavedetails(leave);
		 System.out.println(".....");
	     return lea; 
	 }
}
