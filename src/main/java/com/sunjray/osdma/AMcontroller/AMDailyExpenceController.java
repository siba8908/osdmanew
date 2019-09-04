package com.sunjray.osdma.AMcontroller;

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
import com.sunjray.osdma.AMmodel.AMDailyExpence;
import com.sunjray.osdma.AMservice.AMDailyExpenceService;
import com.sunjray.osdma.constants.AppConstants;

@Controller
@RequestMapping("am")

public class AMDailyExpenceController {

	@Autowired
	private AMDailyExpenceService dailyService;
	@Autowired
	Gson gson;
	
	//DAILY EXPENCES
	
	@RequestMapping(value= "/am-daily-expence",method=RequestMethod.GET)
	public ModelAndView dailyDetails(){
		List<AMDailyExpence> ex=dailyService.dailyDetails();
		return new ModelAndView ("AM/am-today-expences","ex",ex);
	}

	//INSERT
	
	@RequestMapping(value= "/daily_expence_ajax",method=RequestMethod.POST)
	public  @ResponseBody String addDetails(@RequestBody List<AMDailyExpence> dailyExpence) {
		AMDailyExpence ex = new AMDailyExpence();
		List<AMDailyExpence> exe=dailyService.dailyDetails();
		try {
			for(int i=0;dailyExpence.size()>i;i++) {
				ex.setTransactionId(exe.get(i).getTransactionId());
				ex.setAmount(exe.get(i).getAmount());
				ex.setAccountHead(dailyExpence.get(i).getAccountHead());
				ex.setTransctionPurpose(dailyExpence.get(i).getTransctionPurpose());; 
				ex.setPaymentType(dailyExpence.get(i).getPaymentType()); 
				ex.setBankTransId(dailyExpence.get(i).getBankTransId()); 
				ex.setRemarks(dailyExpence.get(i).getRemarks()); 
				dailyService.addDetails(ex);
			}
			return gson.toJson(AppConstants.INSERTSUCESSMSG);
		}
		catch(Exception e) {
			return  gson.toJson(AppConstants.ERRORMSG);
		}	
	}
	
	//REPORT
	
	@RequestMapping(value= "/daily-report",method=RequestMethod.GET)
	public ModelAndView dailyReport(){
		return new ModelAndView ("Reports/am-daily-expence-report");
	}

	//SHOW
	
	@RequestMapping(value= "/daily_expence_list_ajax")
	public @ResponseBody Iterable<AMDailyExpence> getData(HttpSession session) {
		System.out.println("EXPENCES");
		return dailyService.getData();
	}
}