package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.EmployeeList;

public class EmployeeListRowMapper implements  RowMapper<EmployeeList> {

	@Override
	public EmployeeList mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		EmployeeList list =new EmployeeList();
		list.setEmployeeCode(rs.getString("employee_code"));
		list.setFullName(rs.getString("first_name")+ rs.getString("last_name"));
		list.setDesignation(rs.getString("designation"));
		
		list.setDepartmentName(rs.getString("department_name"));
		list.setJoiningDate(rs.getDate("joining_date"));
		list.setSalary(rs.getDouble("salary"));
		list.setContactNo(rs.getLong("contact_no"));
		list.setEmail(rs.getString("email"));
		System.out.println("Email::"+rs.getString("email"));
		return list;
	}

	

	
		

	

}
