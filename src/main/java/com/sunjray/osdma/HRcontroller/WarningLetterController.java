package com.sunjray.osdma.HRcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hr")
public class WarningLetterController {
	@RequestMapping(value="/warningLetter",method=RequestMethod.GET)
	public  ModelAndView  warningLetter()
	{
		
		return new ModelAndView("HR/hr_warning_letter");
	}

}
