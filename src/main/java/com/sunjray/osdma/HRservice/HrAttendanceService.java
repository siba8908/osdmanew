package com.sunjray.osdma.HRservice;

import java.util.List;

import com.sunjray.osdma.HRmodel.Attendance;
import com.sunjray.osdma.HRmodel.EmployeeDetails;

public interface HrAttendanceService {

	
	public List<EmployeeDetails> getempdetails();

	public  int postAtten(Attendance atn);

	public Iterable<Attendance> getAttendance();

	public Iterable<Attendance> getAttendanceMonth();

	

	

}
