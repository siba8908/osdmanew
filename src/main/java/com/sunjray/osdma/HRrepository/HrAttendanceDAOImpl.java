package com.sunjray.osdma.HRrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.Attendance;
import com.sunjray.osdma.HRmodel.EmployeeDetails;
import com.sunjray.osdma.mapper.AttendanceDayRowMapper;
import com.sunjray.osdma.mapper.AttendanceMonthRowMapper;
import com.sunjray.osdma.mapper.AttendanceRowMapper;
import com.sunjray.osdma.util.QueryConstant;


@Repository
public class HrAttendanceDAOImpl implements HrAttendanceDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	
	@Override
	public List<EmployeeDetails> getempdetails() {
		
		List<EmployeeDetails> empdlts=null;
		empdlts=jdbcTemplate.query(QueryConstant.GET_EMP_DETAILS_ATTN, new AttendanceRowMapper());
		return empdlts;
	}


	@Override
	public int postAtten(Attendance attendance) {
		
		return jdbcTemplate.update(QueryConstant.Insert_Attendance, attendance.getEmployeeCode(),attendance.getAttendeeDate(),attendance.getAttendeeDay(),attendance.getStatus());
	}


	@Override
	public Iterable<Attendance> getAttendance() {
		
		return jdbcTemplate.query(QueryConstant.GET_EMP_ATTENDANCE_DAYS, new AttendanceDayRowMapper());
	}


	@Override
	public Iterable<Attendance> getAttendanceMonth() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(QueryConstant.GET_EMP_ATTENDANCE_MONTH, new AttendanceMonthRowMapper());
	}


	
}
	
