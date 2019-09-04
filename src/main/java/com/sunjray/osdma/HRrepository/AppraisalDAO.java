package com.sunjray.osdma.HRrepository;

import com.sunjray.osdma.HRmodel.EmployeeBean;

public interface AppraisalDAO {

	EmployeeBean getAllDetailsByEmpId(Long employeeId);

}