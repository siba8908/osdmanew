package com.sunjray.osdma.HRrepository;

import java.util.List;

import com.sunjray.osdma.HRmodel.Attendance;
import com.sunjray.osdma.HRmodel.EmployeeDetails;

public interface HrAttendanceDAO {
	
	List<EmployeeDetails> getempdetails();

	int postAtten(Attendance attendance);

	Iterable<Attendance> getAttendance();

	Iterable<Attendance> getAttendanceMonth();

	


}
