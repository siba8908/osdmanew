package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sunjray.osdma.HRmodel.Payroll;

public class PayrollResultSetExtractor implements ResultSetExtractor<List<Payroll>> {

	@Override
	public List<Payroll> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Payroll>listpayroll=new ArrayList<Payroll>();
		
		while(rs.next())
		{
			Payroll payroll=new Payroll();
			payroll.setFirstName(rs.getString(1));
			/* System.out.println(rs.getString(1)); */
			payroll.setLastName(rs.getString(2));
			payroll.setEmployeeCode(rs.getString(3));
			payroll.setDesignation(rs.getString(4));
			payroll.setDepartment(rs.getString(5));
			payroll.setSalary(rs.getDouble(6));
			payroll.setEmployeeId(rs.getLong(7));
			/* System.out.println(rs.getDouble(6)); */
	        
			
			listpayroll.add(payroll);
		
		}
		return listpayroll;
	}

	

}
