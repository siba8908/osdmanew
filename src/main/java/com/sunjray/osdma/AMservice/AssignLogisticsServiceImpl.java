package com.sunjray.osdma.AMservice;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.AMmodel.AssignLogistics;
import com.sunjray.osdma.AMmodel.ConsingementTrackC2P;
import com.sunjray.osdma.AMmodel.ProPersonalDtls;
import com.sunjray.osdma.AMrepository.AssignLogisticsDAO;
import com.sunjray.osdma.constants.AppConstants;

@Service
public class AssignLogisticsServiceImpl implements AssignLogisticsService {
	
	@Autowired
	private AssignLogisticsDAO assignLogisticsDAO;
	public String insertAssignLogistics(AssignLogistics assignLogistics)
	{
		int result=0;
		String message=null;
		try {
		result=assignLogisticsDAO.insertAssginLogistics(assignLogistics);
		if(result==1)
		{
			message=AppConstants.INSERTSUCESSMSG;;
		}
		}
		catch(EmptyResultDataAccessException e)
		{
			 message=AppConstants.ERRORMSG;
		}
		return message;
	}
	public List<AssignLogistics> getConsignmenetLogisticsData()
	{
		
	
		return assignLogisticsDAO.fetchConsignmenetLogisticsData();
	
	}
	public List<ConsingementTrackC2P> getConsignmentIdNo(){
		return assignLogisticsDAO.fetchConsignmentIdNo();
	}
	public List<ProPersonalDtls> getLogisticsIdName(){
		return assignLogisticsDAO.fetchLogisticsIdName();
	}
	


}
