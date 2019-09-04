package com.sunjray.osdma.HRservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.EmployeeList;
import com.sunjray.osdma.HRrepository.EmployeeDAO;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	@Override
	public Iterable<EmployeeList> getEmployeelist() {
		
		return employeeDAO.getEmployeelist();
	}

}
