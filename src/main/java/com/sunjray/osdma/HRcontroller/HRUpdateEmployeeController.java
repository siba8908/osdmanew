package com.sunjray.osdma.HRcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.HRservice.HRLeaveService;

@Controller
@RequestMapping("hr")
public class HRUpdateEmployeeController {
	
	@Autowired
	private HRLeaveService hrService;

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.GET)
	public ModelAndView hr_edit_employee() {
		System.out.println("....LOGIN....");
		return new ModelAndView("HR/hr-empolyee-edit-form");
	}

}
