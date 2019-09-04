package com.sunjray.osdma.HRrepository;

import com.sunjray.osdma.HRmodel.EmployeeList;

public interface EmployeeDAO {

	Iterable<EmployeeList> getEmployeelist();

}
