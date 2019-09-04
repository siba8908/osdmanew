package com.sunjray.osdma.AMservice;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.AMmodel.RaiseRequest;
import com.sunjray.osdma.AMmodel.RaisedRequestReport;
import com.sunjray.osdma.AMmodel.ServProBill;
import com.sunjray.osdma.AMmodel.MasterSerProviderType;
import com.sunjray.osdma.AMrepository.RaiseRequestDAO;
import com.sunjray.osdma.constants.AppConstants;

@Service
public class RaiseRequestServiceImpl implements RaiseRequestService {
	
	@Autowired
	private RaiseRequestDAO accountManagerDAO;
	 public List<RaiseRequest> getAllServiceProviderAccountDetails(MasterSerProviderType masterSerProviderType)
	 {
		 List<RaiseRequest> accountManagerList=null;
		 System.out.println("Bussiness logic started...");
		 accountManagerList= accountManagerDAO.fetchAllServiceProviderAccountDetails(masterSerProviderType);
		 System.out.println("Bussiness logic End...");
		 return accountManagerList;
	 }
	 public String saveRaiseRequest(RaiseRequest accounManager )
	 {
		 System.out.println("saveRaiseRequestBusiness Logic Start ...");
		 int result=0;
		 String message=null;
		 try {
		 result=accountManagerDAO.saveRaiseRequest(accounManager);
		 if(result==1)
		 {
			 message= AppConstants.INSERTSUCESSMSG;
		 }
		
		 }
		 catch(EmptyResultDataAccessException e)
		 {
			 message=AppConstants.ERRORMSG;
		 }
		 System.out.println("saveRaiseRequestBusiness Logic end ...");
		 return message ;
	 }
	 public List<MasterSerProviderType> getAllProviderType()
	 {
		 return accountManagerDAO.fetchAllProviderType();
	 }
	@Override
	public Iterable<RaisedRequestReport> getRequest() {
		return accountManagerDAO.getRequest();
	}
	@Override
	public List<ServProBill> ledgerTypeReport(MasterSerProviderType masterSerProviderType) {
	
		return accountManagerDAO.ledgerTypeReport(masterSerProviderType);
	}

}
