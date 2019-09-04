package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.Payroll;
import com.sunjray.osdma.HRmodel.WorkingDays;

public class WorkingDaysRowMapper implements RowMapper<WorkingDays> {

	@Override
	public WorkingDays mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		WorkingDays workingdays=new WorkingDays();
		System.out.println("Leave::"+rs.getLong(1));
		workingdays.setCount(rs.getLong(1));
		return workingdays;
	}

	
}
