package com.sunjray.osdma.AMrepository;

import java.util.List;

import com.sunjray.osdma.AMmodel.AMDailyExpence;

public interface AMDailyExpenceDAO {

	List<AMDailyExpence> dailyDetails();

	int addDetails(AMDailyExpence ex);

	Iterable<AMDailyExpence> getData();

}
