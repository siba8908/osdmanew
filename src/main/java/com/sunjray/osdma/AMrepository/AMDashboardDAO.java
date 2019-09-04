package com.sunjray.osdma.AMrepository;

import java.util.List;
import com.sunjray.osdma.AMmodel.AMDashboard;
import com.sunjray.osdma.AMmodel.MaterialPurchase;
public interface AMDashboardDAO {
	List<AMDashboard> getAllDetails();
	int paydashboard(AMDashboard d);
	Iterable<MaterialPurchase> getList();
	Iterable<AMDashboard> getapprovedList();

}
