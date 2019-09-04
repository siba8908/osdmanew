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
import com.sunjray.osdma.AMmodel.AMDashboard;
import com.sunjray.osdma.AMmodel.MaterialPurchase;
import com.sunjray.osdma.AMservice.AMDashboardService;

@Controller
@RequestMapping("am")
public class AMDashboardController {
	@Autowired
	private AMDashboardService dashboardService;

	//LOAD DASHBOARD
	@RequestMapping(value= "/am-dashboard",method=RequestMethod.GET)
	public ModelAndView getAllDetails(){
		List<AMDashboard> dashboard=dashboardService.getAllDetails();
		return new	ModelAndView ("AM/am-Dashboard","dashboard",dashboard);
	}

	//PAY
	@RequestMapping(value= "/dashboard_ajax",method=RequestMethod.POST)
	public  @ResponseBody AMDashboard paydashboard(@RequestBody List<AMDashboard> dashboard) {		
		System.out.println("dashboard");
		AMDashboard d = new AMDashboard();
		for(int i=0;dashboard.size()>i;i++) {	
			d.setDate(dashboard.get(i).getDate());
			d.setApprovedAmount(dashboard.get(i).getApprovedAmount());
			System.out.println("Date:"+dashboard.get(i).getDate());
			dashboardService.paydashboard(d);
		}	
		return 	d;		
	}
	//REPORT
	
	@RequestMapping(value= "/consignmentwise-report",method=RequestMethod.GET)
	public ModelAndView consignmentwiseReport(){
		return new ModelAndView ("Reports/am-consignmentwise-report");
	}

	//SHOW
	
	@RequestMapping(value= "/consignmentwise_ajax")
	public @ResponseBody Iterable<MaterialPurchase> getList(HttpSession session) {
		System.out.println("EXPENCES");
		return dashboardService.getList();
	}
	
	@RequestMapping(value= "/approval_report",method=RequestMethod.GET)
	public ModelAndView raiseReport(){
		System.out.println("....Approved_Report....");
		return new ModelAndView ("Reports/am-approvalList-report");
	}
	
	@RequestMapping(value = "/get_all_approvedList_ajax")
	public @ResponseBody Iterable<AMDashboard> getRequest(HttpSession session) {
		System.out.println("ajax.....");

		return dashboardService.getapprovedList();
	}
}
