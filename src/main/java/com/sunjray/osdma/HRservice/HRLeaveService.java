package com.sunjray.osdma.HRservice;

import java.util.List;

public interface HRLeaveService {

	public int LeaveManagement(com.sunjray.osdma.HRmodel.LeaveManagement leaveManagement);

	public Iterable<com.sunjray.osdma.HRmodel.LeaveManagement> getLeave();

	public List<com.sunjray.osdma.HRmodel.LeaveManagement> getleavedetails(
			com.sunjray.osdma.HRmodel.LeaveManagement leave);
	
	
}


	