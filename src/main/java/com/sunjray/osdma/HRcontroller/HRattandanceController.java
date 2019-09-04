package com.sunjray.osdma.HRcontroller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.HRmodel.Attendance;
import com.sunjray.osdma.HRmodel.EmployeeDetails;
import com.sunjray.osdma.HRmodel.LeaveManagement;
import com.sunjray.osdma.HRservice.HrAttendanceService;




@Controller
 @RequestMapping("hr") 

public class HRattandanceController {
	
	
	@Autowired
	HrAttendanceService hrAttendanceService;
	
	@RequestMapping(value= "/attendance",method=RequestMethod.GET)
	public ModelAndView attendance(){
		List<EmployeeDetails> empdlts=null;
		empdlts=hrAttendanceService.getempdetails();
		return new ModelAndView ("HR/hr_attendance","empdlts",empdlts);
	}
	
	
	
	/*
	 * @RequestMapping(value= "/hr-attendance", method=RequestMethod.GET)
	 * public @ResponseBody List<EmployeeDetails> getempdetails() {
	 * //System.out.println("Emp Code:"+empDlts.getEmployee_code());
	 * List<EmployeeDetails> empdlts=null;
	 * empdlts=hrAttendanceService.getempdetails(); return empdlts; }
	 */
	
	
	
	@RequestMapping(value = "/postattendance", method = RequestMethod.POST)
	public @ResponseBody Attendance postAttendance(@RequestBody ArrayList<Attendance> attendance) {
		System.out.println("PPPPPPPPPPP?????");
		Attendance atn=new Attendance();
		for(int i=0; attendance.size()>i; i++) {
			atn.setEmployeeCode(attendance.get(i).getEmployeeCode());
			atn.setAttendeeDate(attendance.get(i).getAttendeeDate());
			System.out.println(attendance.get(i).getAttendeeDate());
			atn.setAttendeeDay(attendance.get(i).getAttendeeDay());
			atn.setStatus(attendance.get(i).getStatus());
			hrAttendanceService.postAtten(atn);
		}
		
	
		return atn;
		
	}
	
	@RequestMapping(value= "/attendance_report",method=RequestMethod.GET)
	public ModelAndView leaveReport(){
		System.out.println("....LEAVE_Report....");
		return new ModelAndView ("Reports/hr-daily-monthly-attendance-report");
	}
	
	@RequestMapping(value = "/getattendance_list_ajax", method = RequestMethod.GET)
	public @ResponseBody Iterable<Attendance> getAttendance(HttpSession session) {
		System.out.println("DAYS....");

		return hrAttendanceService.getAttendance();
	}
	
	@RequestMapping(value = "/getattendance_list_month_ajax", method = RequestMethod.GET)
	public @ResponseBody Iterable<Attendance> getAttendanceMonth(HttpSession session) {
		System.out.println("MONTH....");

		return hrAttendanceService.getAttendanceMonth();
	}
	  
	
}
