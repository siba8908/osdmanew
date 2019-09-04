package com.sunjray.osdma.AMservice;



import java.util.List;

import com.sunjray.osdma.AMmodel.RaiseRequest;
import com.sunjray.osdma.AMmodel.RaisedRequestReport;
import com.sunjray.osdma.AMmodel.ServProBill;
import com.sunjray.osdma.HRmodel.Leave;
import com.sunjray.osdma.AMmodel.MasterSerProviderType;

public interface RaiseRequestService {
	public List<MasterSerProviderType> getAllProviderType();
	 public List<RaiseRequest> getAllServiceProviderAccountDetails(MasterSerProviderType masterSerProviderType);
	 public String saveRaiseRequest(RaiseRequest AccounManager );
	public Iterable<RaisedRequestReport> getRequest();
	public List<ServProBill> ledgerTypeReport(MasterSerProviderType masterSerProviderType);
}
