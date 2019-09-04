package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.Attendance;


public class AttendanceDayRowMapper implements RowMapper<Attendance> {

	@Override
	public Attendance mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Attendance atten=new Attendance();
		atten.setEmployeeCode(rs.getString("employee_code"));
		atten.setStatus(rs.getString("status"));
		atten.setAttendeeDate(rs.getString("attendee_date"));
		return atten;
	}

}
