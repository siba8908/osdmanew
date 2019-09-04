package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.Attendance;
import com.sunjray.osdma.HRmodel.EmployeeDetails;

public class AttendanceRowMapper implements RowMapper<EmployeeDetails>{

	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		EmployeeDetails empDlts =null;
		empDlts=new EmployeeDetails(); 
		empDlts.setEmployee_code(rs.getString(3));
		//System.out.println(rs.getString(3));
		empDlts.setFirstName(rs.getString(1));
		//System.out.println(rs.getString(1));
		empDlts.setLastName(rs.getString(2));
		//System.out.println(rs.getString(2));
		empDlts.setFullName(rs.getString(1)+" "+rs.getString(2));
		empDlts.setDesignation(rs.getString(4));
		//System.out.println(rs.getString(4));
		return empDlts;
	}
	
	
	
	

}
