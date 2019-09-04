package com.sunjray.osdma.HRservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.Appraisal;
import com.sunjray.osdma.HRmodel.EmployeeBean;
import com.sunjray.osdma.HRrepository.AppraisalDAO;


@Service
public class AppraisalServiceImpl implements AppraisalService{
	
	@Autowired
	private AppraisalDAO appraisalDAO;

	@Override
	public EmployeeBean fetchAllDetailsByEmpCode(Long employeeId) {
		// TODO Auto-generated method stub
		EmployeeBean empBean = null;
		empBean = appraisalDAO.getAllDetailsByEmpId(employeeId);
		return empBean;
	}	
	
}
