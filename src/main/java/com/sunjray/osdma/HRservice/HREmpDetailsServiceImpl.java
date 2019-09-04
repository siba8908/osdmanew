package com.sunjray.osdma.HRservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.SingleEmpDetails;
import com.sunjray.osdma.HRrepository.HrEmpDetailsDAO;

@Service

public class HREmpDetailsServiceImpl implements HREmpDetailsService {
	
	@Autowired
	private HrEmpDetailsDAO hrempDetailsDAO;
	
	

	@Override
	
	public int addemp(SingleEmpDetails empDetails) {
		// TODO Auto-generated method stub
		return hrempDetailsDAO.addemp(empDetails) ;
	}



	@Override
	public List<SingleEmpDetails> getState() {
		
		return hrempDetailsDAO.getState();
	}



	@Override
	public List<SingleEmpDetails> getDist() {
		// TODO Auto-generated method stub
		return hrempDetailsDAO.getDist();
	}

}
