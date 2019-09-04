package com.sunjray.osdma.HRcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunjray.osdma.HRmodel.EmployeeBean;
import com.sunjray.osdma.HRservice.AppraisalService;

@Controller
@RequestMapping("hr")

public class AppraisalController {

	@Autowired
	private AppraisalService appraisalService;
	
	//SHOW ALL DETAILS OF EMPLOYEE 
	
	@RequestMapping(value= "/hr-appraisal_ajax", method=RequestMethod.POST)
	public @ResponseBody EmployeeBean getAllDetailsByEmpCode(@RequestBody EmployeeBean empBean) {	
		return appraisalService.fetchAllDetailsByEmpCode(empBean.getEmployeeId());		
	}
	
	
}
