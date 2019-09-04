package com.sunjray.osdma.AMcontroller;



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

import com.google.gson.Gson;

import com.sunjray.osdma.AMmodel.RaiseRequest;
import com.sunjray.osdma.AMmodel.RaisedRequestReport;
import com.sunjray.osdma.AMmodel.ServProBill;
import com.sunjray.osdma.AMmodel.MasterSerProviderType;
import com.sunjray.osdma.AMmodel.RaiseBill;
import com.sunjray.osdma.AMservice.RaiseRequestService;
import com.sunjray.osdma.HRmodel.Leave;

@Controller
@RequestMapping("am")
public class RaiseRequestController {
	@Autowired
	Gson gson;
	@Autowired
	private RaiseRequestService accountManagerService;
	
	@RequestMapping(value="raiseRequest",method=RequestMethod.GET)
	public ModelAndView raiseRequest()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("providerDetails", accountManagerService.getAllProviderType());
		mav.setViewName("AM/am_raise_request");
		return mav;
	}
	
	@RequestMapping(value="account_Manager_ajax",method=RequestMethod.POST)
	public @ResponseBody List<RaiseRequest> serviceProviderRequest(@RequestBody MasterSerProviderType masterSerProviderType)
	{
		System.out.println("AccountManager......");
		List<RaiseRequest> accountManagerObj=null;
		accountManagerObj=accountManagerService.getAllServiceProviderAccountDetails(masterSerProviderType);
		return accountManagerObj;
	}
	
	@RequestMapping(value="raiseRequest_ajax",method=RequestMethod.POST)
	public @ResponseBody String saveRaiseRequest(@RequestBody RaiseRequest accountManager) 
	{
		String message=null;
	
		message=accountManagerService.saveRaiseRequest(accountManager);
		return gson.toJson(message);
		
	}
	
	//Report
	@RequestMapping(value= "/raise_request_report",method=RequestMethod.GET)
	public ModelAndView raiseReport(){
		System.out.println("....RAISE_Report....");
		return new ModelAndView ("Reports/am_raise_request-report");
	}
	
	@RequestMapping(value = "/get_all_request_ajax")
	public @ResponseBody Iterable<RaisedRequestReport> getRequest(HttpSession session) {
		System.out.println("ajax.....");

		return accountManagerService.getRequest();
	}
	
	//Report
	
	@RequestMapping(value="ledger_report",method=RequestMethod.GET)
	public ModelAndView ledgerReport()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("providerDetails", accountManagerService.getAllProviderType());
		mav.setViewName("Reports/am_ledger_account_report");
		return mav;
	}
	
	@RequestMapping(value="ledger_report_ajax",method=RequestMethod.POST)
	public @ResponseBody List<ServProBill>ledgerTypeReport(@RequestBody MasterSerProviderType masterSerProviderType)
	{
		System.out.println("ledgerTypeReport");
		return accountManagerService.ledgerTypeReport(masterSerProviderType);
	}
}
