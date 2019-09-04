package com.sunjray.osdma.AMcontroller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.AMmodel.BudgetCost;
import com.sunjray.osdma.AMmodel.ProjectBudget;
import com.sunjray.osdma.AMmodel.SiteCode;
import com.sunjray.osdma.AMservice.AccountService;
import com.sunjray.osdma.AMservice.ProjectBudgetService;
import com.sunjray.osdma.qaqcModel.MaterialCode;

@Controller
@RequestMapping("am")
public class AMProjectBudgetController {
	
	@Autowired
	private ProjectBudgetService projService;
	
	@RequestMapping(value= "/ProjectBudget",method=RequestMethod.GET)
	public ModelAndView ProjectBudgetPage(){
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("showSiteCode", projService.getSiteCode());
		 mav.setViewName("AM/am-projectBudget");
		 return mav;
		
	}
	


	@RequestMapping(value="/ProjBudget_ajax",method=RequestMethod.POST)
	public @ResponseBody BudgetCost findAllproj(@RequestBody SiteCode sitecode)
	{
		System.out.println("ExpencesReport");
		return projService.findAllproj(sitecode);
	}
}

