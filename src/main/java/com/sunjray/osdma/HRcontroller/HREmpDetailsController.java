package com.sunjray.osdma.HRcontroller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.HRmodel.SingleEmpDetails;
import com.sunjray.osdma.HRservice.HREmpDetailsService;
//import com.sunjray.osdma.HRservice.HRStatusSer;

@Controller

public class HREmpDetailsController {
	
	
	@Autowired
	private HREmpDetailsService hrempdetails;
	
	@RequestMapping(value= "/hr-employeeForm",method=RequestMethod.GET)
	public ModelAndView attendance(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("showState", hrempdetails.getState());
		mav.addObject("showDist", hrempdetails.getDist());
		 mav.setViewName ("HR/hr-employee-form");
		 return mav;
		
	}
	
	@RequestMapping(value ="/singleEmployee", method = RequestMethod.POST)
	public  @ResponseBody void addEmp(@RequestBody  SingleEmpDetails empDetails) {
		
		System.out.println("controller"+empDetails.getEmpEducation().size());
		//return hrempdetails.addemp(empDetails);
		
		
		hrempdetails.addemp(empDetails);
		/*for(int i=0;i<u.size();i++) {
			empDetails.setEducation(u.get(i).getEducation());
			System.out.println(u.get(i).getEducation());
			empDetails.setEducationUniversity(u.get(i).getEducationUniversity());
			hrempdetails.addemp(empDetails);
			
		}
		*/
		
		
		
	}
	

	/*
	 * @RequestMapping(value = "/postempdetails", method = RequestMethod.POST)
	 * public @ResponseBody SingleEmpDetails postemp(@RequestBody
	 * ArrayList<SingleEmpDetails> empdetails) { System.out.println("pragya?????");
	 * SingleEmpDetails sed=new SingleEmpDetails(); for(int i=0;
	 * SingleEmpDetails.size()>i; i++) {
	 * atn.setEmployeeCode(attendance.get(i).getEmployeeCode());
	 * atn.setAttendeeDate(attendance.get(i).getAttendeeDate());
	 * System.out.println(attendance.get(i).getAttendeeDate());
	 * atn.setAttendeeDay(attendance.get(i).getAttendeeDay());
	 * 
	 * atn.setStatus(attendance.get(i).getStatus());
	 * hrAttendanceService.postAtten(atn); }
	 * 
	 * 
	 * return atn;
	 * 
	 * }
	 */
	
	
	
	
}
