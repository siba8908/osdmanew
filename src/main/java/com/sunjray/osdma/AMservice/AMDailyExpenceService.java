package com.sunjray.osdma.AMservice;

import java.util.List;

import com.sunjray.osdma.AMmodel.AMDailyExpence;

public interface AMDailyExpenceService {

	List<AMDailyExpence> dailyDetails();

	int addDetails(AMDailyExpence ex);

	Iterable<AMDailyExpence> getData();

}
