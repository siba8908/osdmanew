package com.sunjray.osdma.HRcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.HRmodel.OfferLetterData;
import com.sunjray.osdma.HRservice.CompanyDetailsService;
import com.sunjray.osdma.HRservice.EmployeeOfferLetterService;



@Controller
@RequestMapping("/hr")
public class OfferLetterController 
{
	@Autowired
	EmployeeOfferLetterService eos;
	/*
	 * @Autowired EmployeeDesignationService eds;
	 */
	
	@Autowired
	CompanyDetailsService cds;
	
	//Load view page for offer letter
	
	@RequestMapping(value = "/empOfferLetter",method = RequestMethod.GET)
	public ModelAndView utilisationResources(HttpServletRequest request,Authentication auth )
	
	{
		System.out.println("Author");
		HttpSession session=request.getSession();  
        session.setAttribute("uname","Mamata");  
        
        OfferLetterData ol=new OfferLetterData();
        ol=   eos.getOfferLetterData();
	
		return new ModelAndView("HR/hr-offer-letter","ol",ol);
		
	}
	
	@RequestMapping(value = "/sendOfferLetter_ajax",method = RequestMethod.POST)
	public void getEmployeeOfferLetterData(@RequestBody OfferLetterData employeeOfferLetterData )
	
	{
		//System.out.println(employeeOfferLetterData.getEmpCode());
		//eos.submitOfferLetter();
		
	}
}
