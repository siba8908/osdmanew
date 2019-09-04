package com.sunjray.osdma.HRrepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.Deduction;
import com.sunjray.osdma.HRmodel.Payroll;
import com.sunjray.osdma.HRmodel.WorkingDays;
import com.sunjray.osdma.common.Days;
//import com.sunjray.osdma.mapper.LeaveRowMapper;
import com.sunjray.osdma.mapper.PayrollResultSetExtractor;
import com.sunjray.osdma.mapper.PayrollRowMapper;
import com.sunjray.osdma.mapper.WorkingDaysRowMapper;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class PayrollDAOImpl implements PayrollDAO 
{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Payroll> showPayroll() {
		List<Payroll>listpayroll=new ArrayList<Payroll>();
		Long total=(long) Days.calculateWorkingDay();
		//List<WorkingDays> listworkdays=new ArrayList<WorkingDays>();
		listpayroll=  jdbcTemplate.query(QueryConstant.GET_PAYROLL,  new PayrollResultSetExtractor());
		for(int i=0;i<listpayroll.size();i++) {
			
			listpayroll.get(i).setNoOfDays(workingDays(listpayroll.get(i).getEmployeeCode()));
			listpayroll.get(i).setTotalNoOfDays(total);
		}
		return listpayroll;
		 
	}
	
	
	  public long workingDays(String employeeCode) {
	  
	  WorkingDays workingDays= new WorkingDays(); int
	  totalday=Days.calculateWorkingDay();
	  
	  workingDays= jdbcTemplate.queryForObject(QueryConstant.GET_WORKING_DAYS, new
	  WorkingDaysRowMapper(), employeeCode); return
	  (totalday-workingDays.getCount()); }
	 
	@Override
	public int savePayroll(Deduction d) {
		
		return jdbcTemplate.update(QueryConstant.SAVE_PAYROLL,d.getEmployeeId(),d.getPf(),d.getEsi(),d.getLoan(),d.getTds(),d.getWorkOnHolidays(),d.getBonus(),d.getCaluSalary());
	}


	@Override
	public Iterable<Deduction> getPayrolllist() {
		
		return jdbcTemplate.query(QueryConstant.GET_PAYROLL_LIST,new PayrollRowMapper());
	}

	
//	@Override 
//	public Deduction savePayroll() {
//	  
//	  return jdbcTemplate.update(QueryConstant.SAVE_PAYROLL,); }

}
