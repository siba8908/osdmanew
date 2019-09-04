package com.sunjray.osdma.AMcontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.AMmodel.ConsingementTrackP2A;
import com.sunjray.osdma.AMmodel.Consinment;
import com.sunjray.osdma.AMmodel.Expence;
import com.sunjray.osdma.AMmodel.ServProBill;
import com.sunjray.osdma.AMmodel.SiteCode;
import com.sunjray.osdma.AMservice.AMReportService;

@Controller
@RequestMapping("am")

public class AMReportController {
	@Autowired
	private AMReportService reportService;
	
	@RequestMapping(value= "/ledgerList_report",method=RequestMethod.GET)
	public ModelAndView ledgerListReport() {
		System.out.println("....Approved_Report....");
		return new ModelAndView ("Reports/am_ledgerList_account_report");
	}
	
	@RequestMapping(value = "/ledgerList_ajax")
	public @ResponseBody Iterable<ServProBill> getLedgerList(HttpSession session) {
		return reportService.getLedgerList();
	}
	
	@RequestMapping(value= "/materialOrderTracking_C2P_report",method=RequestMethod.GET)
	public ModelAndView meterialC2P() {
		return new ModelAndView ("Reports/am_material_tracking_c2p_report");
	}
	
	@RequestMapping(value = "/materialOrderTracking_C2P_report_ajax")
	public @ResponseBody Iterable<Consinment> getTrackingc2p(HttpSession session) {
		return reportService.getTrackingc2p();
	}
	
	@RequestMapping(value= "/materialOrderTracking_P2A_report",method=RequestMethod.GET)
	public ModelAndView materialP2A(){
		return new ModelAndView ("Reports/am_material_tracking_p2a_report");
	}
	
	@RequestMapping(value = "/materialOrderTracking_P2A_report_ajax")
	public @ResponseBody Iterable<ConsingementTrackP2A> getTrackingp2a(HttpSession session) {
		return reportService.getTrackingp2a();
	}
	
	@RequestMapping(value= "/budget_report",method=RequestMethod.GET)
	public ModelAndView budgetReport() {
		System.out.println("....Budget_Report....");
		ModelAndView mav=new ModelAndView();
		mav.addObject("siteCode", reportService.getAllSiteCode());
		mav.setViewName("Reports/am_expence_details_report");
		return mav;
	}
	
	@RequestMapping(value="/expences_report_ajax",method=RequestMethod.POST)
	public @ResponseBody Expence ExpencesReport(@RequestBody SiteCode sitecode) {
		System.out.println("ExpencesReport");
		return reportService.ExpencesReport(sitecode);
	}
}
