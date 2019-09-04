package com.sunjray.osdma.HRservice;

import java.util.List;

import com.sunjray.osdma.HRmodel.SingleEmpDetails;
//import com.sunjray.osdma.HRmodel.User;

public interface HREmpDetailsService {

	//public int addemp(SingleEmpDetails empDetails);

	public int addemp(SingleEmpDetails empDetails);

	public List<SingleEmpDetails> getState();
	
	public List<SingleEmpDetails> getDist();
	
	

}
