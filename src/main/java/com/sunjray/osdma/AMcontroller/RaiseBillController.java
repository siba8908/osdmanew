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
import com.sunjray.osdma.AMmodel.RaiseBill;
import com.sunjray.osdma.AMservice.RaiseBillService;
import com.sunjray.osdma.constants.AppConstants;

@Controller
@RequestMapping("am")
public class RaiseBillController {
	@Autowired
    private RaiseBillService riseBill;
	@Autowired
	private Gson gson;
	
	/*****************************SaveBill Display **************************/
	@RequestMapping(value= "/am_raisebill",method=RequestMethod.GET)
	public ModelAndView riseBill(){
		System.out.println("....HR....");
		
		List<RaiseBill> Bill=riseBill.riseBill();
		return new ModelAndView ("AM/am-raise-bill","Bill",Bill);
	}
	
	/*****************************SaveBill **************************/
	@RequestMapping(value="/save_bill_ajax",method=RequestMethod.POST)
	public  @ResponseBody String saveBill(@RequestBody ArrayList<RaiseBill> bill ) 
	{
		System.out.println("SAVE Bill");
		RaiseBill rBill=new RaiseBill();
		try {
		for(int i=0;i<bill.size();i++) {
			rBill.setSiteCodeId(bill.get(i).getSiteCodeId());
			rBill.setSiteDate(bill.get(i).getSiteDate());
			rBill.setAmount(bill.get(i).getAmount());
			rBill.setRemarks(bill.get(i).getRemarks());
			riseBill.saveBill(rBill);
		}   
		
		return gson.toJson(AppConstants.INSERTSUCESSMSG);
		}
		catch(Exception e) {
			return gson.toJson(AppConstants.ERRORMSG);
		}
	}
	
	/*****************************GetBillList **************************/
	@RequestMapping(value = "/getrisebill_list_ajax")
	public @ResponseBody Iterable<RaiseBill> getBilllist(HttpSession session) {
		System.out.println("BILLLIST.......");

		return riseBill.getBilllist( );
	}


	/*****************************GetBillListReport**************************/
	@RequestMapping(value= "/bill_report",method=RequestMethod.GET)
	public ModelAndView dailyReport(){
		return new ModelAndView ("Reports/am-raise-bill-report");
	}
}
