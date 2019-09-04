package com.sunjray.osdma.PMservice;

import java.util.List;

import com.sunjray.osdma.PCmodel.EmployeePersonalDetails;

public interface EmployeePersonalDetailsService {

	List<EmployeePersonalDetails> findByEmployeeDesignation(String desination);

}
