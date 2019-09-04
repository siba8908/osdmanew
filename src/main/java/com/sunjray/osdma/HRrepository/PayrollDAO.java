package com.sunjray.osdma.HRrepository;

import java.util.List;

import com.sunjray.osdma.HRmodel.Deduction;
import com.sunjray.osdma.HRmodel.EmployeeBean;
import com.sunjray.osdma.HRmodel.Payroll;

public interface PayrollDAO {

	List<Payroll> showPayroll();

	int savePayroll(Deduction d);

	Iterable<Deduction> getPayrolllist();
}
