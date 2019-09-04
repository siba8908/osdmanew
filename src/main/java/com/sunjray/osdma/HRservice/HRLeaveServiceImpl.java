package com.sunjray.osdma.HRservice;

import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sunjray.osdma.HRmodel.LeaveManagement;
import com.sunjray.osdma.HRrepository.LeaveManageDao;

@Service
public class HRLeaveServiceImpl implements HRLeaveService {
	
	 @Autowired
	   private LeaveManageDao adao;
	
	@Override
	public int LeaveManagement(LeaveManagement leaveManagement) {
	
		
	LeaveManagement leave=adao.findLeave(leaveManagement);
	long leaveTaken = leave.getLeaveTaken();
	System.out.println("BEforeLeave:"+leaveTaken);
	 leaveTaken=1+leaveTaken+ChronoUnit.DAYS.between(leaveManagement.getFromDate().toLocalDate(),leaveManagement.getToDate().toLocalDate());
		
	System.out.println("leaveTaken::"+leaveTaken);
		
	      return adao.save(leaveManagement,leaveTaken);


	}
	
	@Override
	public Iterable<LeaveManagement> getLeave() {
		// TODO Auto-generated method stub
		Iterable<LeaveManagement>ur=null;
		ur=adao.findAllLeave();
		return ur;
	}
	
	@Override
	public List<com.sunjray.osdma.HRmodel.LeaveManagement> getleavedetails(
			com.sunjray.osdma.HRmodel.LeaveManagement leave) {
		// TODO Auto-generated method stub
		return adao.getleavedetails(leave);
	}


}
