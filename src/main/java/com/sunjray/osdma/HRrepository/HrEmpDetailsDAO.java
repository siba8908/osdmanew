package com.sunjray.osdma.HRrepository;

import java.util.List;

import com.sunjray.osdma.HRmodel.SingleEmpDetails;
//import com.sunjray.osdma.HRmodel.User;

public interface HrEmpDetailsDAO {

	public int addemp(SingleEmpDetails empDetails);

	public List<SingleEmpDetails> getState();

	public List<SingleEmpDetails> getDist();

	//public int Addemp(User user);

}
