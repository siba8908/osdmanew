package com.sunjray.osdma.HRservice;

import com.sunjray.osdma.HRmodel.EmployeeBean;

public interface AppraisalService {

	EmployeeBean fetchAllDetailsByEmpCode(Long employeeId);

	
}
