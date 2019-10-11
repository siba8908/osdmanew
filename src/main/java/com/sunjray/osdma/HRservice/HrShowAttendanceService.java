package com.sunjray.osdma.HRservice;

import java.util.List;

import com.sunjray.osdma.HRmodel.EmployeeAttendance;

public interface HrShowAttendanceService {

	List<EmployeeAttendance> getAttendance(int month, int year);

}
