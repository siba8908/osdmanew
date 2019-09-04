package com.sunjray.osdma.AMrepository;


import java.util.List;

import com.sunjray.osdma.AMmodel.RaiseRequest;
import com.sunjray.osdma.AMmodel.RaisedRequestReport;
import com.sunjray.osdma.AMmodel.ServProBill;
import com.sunjray.osdma.AMmodel.MasterSerProviderType;

public interface RaiseRequestDAO {
		   public List<MasterSerProviderType> fetchAllProviderType();
           public List<RaiseRequest> fetchAllServiceProviderAccountDetails(MasterSerProviderType masterSerProviderType);
           public int saveRaiseRequest(RaiseRequest AccounManager );
		  public Iterable<RaisedRequestReport> getRequest();
		  public List<ServProBill> ledgerTypeReport(MasterSerProviderType masterSerProviderType);
}
