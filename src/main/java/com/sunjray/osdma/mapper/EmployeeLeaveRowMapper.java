package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.Leave;

public class EmployeeLeaveRowMapper implements RowMapper<Leave> {

	@Override
	public Leave mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		Leave leave=new Leave();
		leave.setEmployeeCode(rs.getLong("employee_code"));
		leave.setLeaveType(rs.getString("leave_type"));
		leave.setPermitedLeave(rs.getLong("permited_leave"));
		leave.setLeaveTaken(rs.getLong("leave_taken"));
		leave.setAvaliableLeave(rs.getLong("permited_leave")-rs.getLong("leave_taken"));
		return leave;
	}

}
