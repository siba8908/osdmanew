package com.sunjray.osdma.HRservice;

import java.util.List;

import com.sunjray.osdma.HRmodel.Deduction;


import com.sunjray.osdma.HRmodel.Payroll;

public interface PayrollService {


	public List<Payroll> showPayroll();

	public int savePayroll(Deduction d);

	public Iterable<Deduction> getPayrolllist();

}
