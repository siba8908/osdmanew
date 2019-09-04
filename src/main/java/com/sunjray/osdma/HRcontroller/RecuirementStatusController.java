package com.sunjray.osdma.HRcontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.HRmodel.User;
import com.sunjray.osdma.HRservice.RecuirementStatusService;





@Controller
@RequestMapping("hr")
public class RecuirementStatusController {
	
	@Autowired
	private RecuirementStatusService hrService;
	 User user=null;

	
	
	@RequestMapping(value= "/requirementstatus",method=RequestMethod.GET)
	public ModelAndView reqstatus(){
		
		return new ModelAndView ("HR/recruitment_status");
	}
	
	
	
	@RequestMapping(value = "/getuserList" ,method=RequestMethod.GET)
	public @ResponseBody Iterable<User> getUsers(HttpSession session) {
	

		return hrService.getUsers();
	}
	
	
	@RequestMapping(value = "/getempList" ,method=RequestMethod.GET)
	public @ResponseBody Iterable<User> getEmp(HttpSession session) {
		

		return hrService.getUsers();
	}

}
