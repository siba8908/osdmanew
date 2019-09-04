package com.sunjray.osdma.HRservice;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.Attendance;
import com.sunjray.osdma.HRmodel.EmployeeDetails;
import com.sunjray.osdma.HRrepository.HrAttendanceDAO;


@Service
public class HrAttendanceServiceImpl implements HrAttendanceService {

	@Autowired
	private HrAttendanceDAO hrAttendanceDAO;
	
	@Override
	public List <EmployeeDetails> getempdetails() {
		// TODO Auto-generated method stub
		List <EmployeeDetails> empDetails = null;
		empDetails = hrAttendanceDAO.getempdetails();
		return empDetails;
	}

	@Override
	public int postAtten(Attendance attendance) {
	
		return hrAttendanceDAO.postAtten(attendance);
	}

	@Override
	public Iterable<Attendance> getAttendance() {
		// TODO Auto-generated method stub
		return hrAttendanceDAO.getAttendance();
	}

	@Override
	public Iterable<Attendance> getAttendanceMonth() {
		// TODO Auto-generated method stub
		return hrAttendanceDAO.getAttendanceMonth();
	}

	
	

}
