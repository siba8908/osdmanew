package com.sunjray.osdma.HRcontroller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;


import com.sunjray.osdma.HRservice.EmployeeOfferLetterService;

/**
 * priyanka
 * 7/11/2019
 * @author user
 *
 */
@Controller
@RequestMapping("hr")
public class ExperienceCertificateController {

	@Autowired
	EmployeeOfferLetterService eos;
	
	@RequestMapping(value="experienceCertificate",method=RequestMethod.GET)
	public  ModelAndView  experienceCertificate(HttpServletRequest request)
	{
		HttpSession session=request.getSession();  
        session.setAttribute("uname","Mamata");  
        return new ModelAndView("HR/hr_experience_certificate","ol", eos.getOfferLetterData());
		
	}
	
}
