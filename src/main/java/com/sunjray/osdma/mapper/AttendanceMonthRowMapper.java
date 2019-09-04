package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.Attendance;

public class AttendanceMonthRowMapper implements RowMapper<Attendance> {

	@Override
	public Attendance mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Attendance attn=new Attendance();
		
		attn.setEmployeeCode(rs.getString("employee_code"));
		attn.setStatus(rs.getString("status"));
		attn.setAttendeeDate(rs.getString("attendee_date"));
		return attn;
	}

}
