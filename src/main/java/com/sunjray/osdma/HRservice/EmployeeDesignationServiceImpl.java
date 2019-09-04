package com.sunjray.osdma.HRservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.MasterDesignation;
import com.sunjray.osdma.HRrepository.EmployeeDesignationDao;

@Service
public class EmployeeDesignationServiceImpl implements EmployeeDesignationService {
@Autowired
EmployeeDesignationDao empDesignation;

	@Override
	public List<MasterDesignation> getAllDesignation() {
		return empDesignation.getAllDesignations();
		
		
	}

}
