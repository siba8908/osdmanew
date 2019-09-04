package com.sunjray.osdma.PMserviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunjray.osdma.PCmodel.EmployeePersonalDetails;
import com.sunjray.osdma.PMRepository.EmployeePersonalDetailsRepository;
import com.sunjray.osdma.PMservice.EmployeePersonalDetailsService;

@Service
public class EmployeePersonalDetailsServiceImpl implements EmployeePersonalDetailsService {
	
	@Resource
	EmployeePersonalDetailsRepository employeePersonalDetailsRepository;

	@Override
	public List<EmployeePersonalDetails> findByEmployeeDesignation(String desination) {
		return employeePersonalDetailsRepository.findByEmployeeDesignation(desination);
	}

}
