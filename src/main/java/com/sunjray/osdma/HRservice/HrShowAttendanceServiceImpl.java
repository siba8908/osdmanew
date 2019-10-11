package com.sunjray.osdma.HRservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.EmployeeAttendance;
import com.sunjray.osdma.HRrepository.HrShowAttendanceDAO;

@Service
public class HrShowAttendanceServiceImpl implements HrShowAttendanceService {

	@Autowired
	private HrShowAttendanceDAO hrShowAttendanceDAO;

	@Override
	public List<EmployeeAttendance> getAttendance(int month, int year) {
		return hrShowAttendanceDAO.getAttendance(month, year);
	}

}
