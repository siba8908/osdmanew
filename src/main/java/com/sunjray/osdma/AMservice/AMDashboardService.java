package com.sunjray.osdma.AMservice;

import java.util.List;
import com.sunjray.osdma.AMmodel.AMDashboard;
import com.sunjray.osdma.AMmodel.MaterialPurchase;
public interface AMDashboardService {
	List<AMDashboard> getAllDetails();
	int paydashboard(AMDashboard d);
	Iterable<MaterialPurchase> getList();
	Iterable<AMDashboard> getapprovedList();
}
