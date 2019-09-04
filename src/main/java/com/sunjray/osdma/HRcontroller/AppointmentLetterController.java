package com.sunjray.osdma.HRcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.HRservice.EmployeeOfferLetterService;


@Controller
@RequestMapping("hr")
public class AppointmentLetterController {
	@Autowired
	EmployeeOfferLetterService eos;
	@RequestMapping(value = "/appointmentLetter",method = RequestMethod.GET)
	public ModelAndView utilisationResources(HttpServletRequest request )
	
	{
		
		HttpSession session=request.getSession();  
        session.setAttribute("uname","Mamata");  
       
        return new ModelAndView("HR/hr_appointment_letter","ol", eos.getOfferLetterData());
	}

}
