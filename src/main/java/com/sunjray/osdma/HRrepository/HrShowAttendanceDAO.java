package com.sunjray.osdma.HRrepository;

import java.util.List;

import com.sunjray.osdma.HRmodel.EmployeeAttendance;

public interface HrShowAttendanceDAO {

	List<EmployeeAttendance> getAttendance(int month, int year);

}
