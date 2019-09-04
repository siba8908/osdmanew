package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.EmployeeBean;

public class AppraisalRowMapper implements RowMapper<EmployeeBean>{

	@Override
	public EmployeeBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		EmployeeBean empBean =new EmployeeBean();
		empBean.setFirstName(rs.getString("first_name"));
		empBean.setLastName(rs.getString("last_name"));
		empBean.setEmpName(rs.getString("first_name") +" "+ rs.getString("last_name"));
		empBean.setEmployeeCode(rs.getString("employee_code"));
		empBean.setDesignation(rs.getString("designation"));
		empBean.setDepartmentName(rs.getString("department_name"));
		empBean.setJoiningDate(rs.getString("joining_date"));
		empBean.setSalary(rs.getDouble("salary"));
		return empBean;
	}

}
