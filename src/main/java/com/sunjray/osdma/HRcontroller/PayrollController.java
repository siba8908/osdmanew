package com.sunjray.osdma.HRcontroller;

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
import com.sunjray.osdma.HRmodel.Deduction;
import com.sunjray.osdma.HRmodel.Payroll;
import com.sunjray.osdma.HRservice.PayrollService;
import com.sunjray.osdma.constants.AppConstants;

@Controller
@RequestMapping("hr")
public class PayrollController {
	@Autowired
	private PayrollService payrollService;
	
	@Autowired
	private Gson gson;

	/***************************** PayrollDispay**************************/

	@RequestMapping(value = "/hr-payroll", method = RequestMethod.GET)
	public ModelAndView showPayroll() {
		
		/* System.out.println("-------------------BIBHU-----------------------"); */
		  List<Payroll> EmpPayroll=payrollService.showPayroll();
		  
		  System.out.println(EmpPayroll.size()); 
		  ModelAndView model=new ModelAndView("HR/hr-payroll", "EmpPayroll", EmpPayroll);
		 return model;
		

	}
	
	/*****************************InsertPayroll **************************/
	@RequestMapping(value="/save_payroll_ajax",method=RequestMethod.POST)
	public  @ResponseBody String savePayroll(@RequestBody ArrayList<Deduction > deduction ) 
	{
		System.out.println("SAVE PAYROLL");
		List<Payroll> paybean= new ArrayList<Payroll>();
		paybean =payrollService.showPayroll();
		Deduction d=new Deduction();
		try {
		for(int i=0;i<deduction.size();i++) {
			d.setBonus(deduction.get(i).getBonus());
			d.setWorkOnHolidays(deduction.get(i).getWorkOnHolidays());
			d.setPf(deduction.get(i).getPf());
			d.setEsi(deduction.get(i).getEsi());
			d.setLoan(deduction.get(i).getLoan());
			d.setTds(deduction.get(i).getTds());
			d.setEmployeeId(deduction.get(i).getEmployeeId());
			d.setSalary(paybean.get(i).getSalary());
			payrollService.savePayroll(d);
		}   
		return gson.toJson(AppConstants.INSERTSUCESSMSG);
		}
		catch(Exception e) {
			return gson.toJson(AppConstants.ERRORMSG);
		}
	
	}
	/***************************** PayrollSummarySheet **************************/
	@RequestMapping(value = "/payrollSheet", method = RequestMethod.GET)
	public ModelAndView payrollSheet() {  
		return new ModelAndView ("HR/hr-payroll-summary-sheet");
		
	}
	/***************************** PayrollList **************************/
	@RequestMapping(value = "/getpayroll_list_ajax")
	public @ResponseBody Iterable<Deduction> getPayrolllist(HttpSession session) {
		System.out.println("PAYROLL.....");

		return payrollService.getPayrolllist( );
	}
	/***************************** PayrollSummarySheetReport **************************/

	@RequestMapping(value = "/payrollSheetReport", method = RequestMethod.GET)
	public ModelAndView payrollSheetReport() {  
		return new ModelAndView ("Reports/hr-payroll-summary-sheet-report");
		
	}
	
}
