package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.sunjray.osdma.HRmodel.LeaveManagement;

public class LeaveTakenMapper implements RowMapper<LeaveManagement>  {

	@Override
	public LeaveManagement mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		LeaveManagement l =new LeaveManagement();
		l.setLeaveTaken(rs.getLong("leave_taken"));
		return l;
	}

}
