package com.sunjray.osdma.HRservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.Leave;
import com.sunjray.osdma.HRrepository.EmployeeLeaveDAO;

@Service
public class EmployeeLeaveServiceImpl implements EmployeeLeaveService {

	 @Autowired
		private EmployeeLeaveDAO leaveDAO;
	    
		@Override
		public Iterable<Leave> getLeave() {
			Iterable<Leave>ur=null;
			ur=leaveDAO.findAllLeave();
			return ur;
		}
}
