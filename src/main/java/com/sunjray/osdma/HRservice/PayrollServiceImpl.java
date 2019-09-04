package com.sunjray.osdma.HRservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.Deduction;
import com.sunjray.osdma.HRmodel.EmployeeBean;
import com.sunjray.osdma.HRmodel.Leave;
import com.sunjray.osdma.HRmodel.Payroll;

import com.sunjray.osdma.HRrepository.PayrollDAO;

@Service
public class PayrollServiceImpl implements PayrollService {
	@Autowired
	private PayrollDAO payrollDAO;
   
	@Override
	public List<Payroll> showPayroll() {
		List<Payroll> paybean= new ArrayList<Payroll>();
		paybean=payrollDAO.showPayroll();
	
		return paybean;
	}

	/*
	 * @Override public Deduction savePayroll() { System.out.println(); return
	 * payrollDAO.savePayroll(); }
	 */

	@Override
	public int savePayroll(Deduction d) {
		
		Double grossSalary=0.0;
		
			 grossSalary=((d.getSalary()+d.getBonus()+d.getWorkOnHolidays())-(d.getEsi()+d.getLoan()+d.getPf()+d.getTds()));
			System.out.println("TotalSalary::"+grossSalary);
		    d.setCaluSalary(grossSalary);
		   return payrollDAO.savePayroll(d);
	}

	@Override
	public Iterable<Deduction> getPayrolllist() {
		
		return payrollDAO.getPayrolllist();
	}

}
