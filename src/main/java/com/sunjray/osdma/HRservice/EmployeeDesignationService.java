package com.sunjray.osdma.HRservice;


import java.util.List;

import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.MasterDesignation;

@Service
public interface EmployeeDesignationService {

	List<MasterDesignation> getAllDesignation();
	
	

}
