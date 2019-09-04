package com.sunjray.osdma.HRservice;

import java.util.HashMap;
import java.util.List;

import com.sunjray.osdma.HRmodel.HolidayList;


public interface HRHolidayService {

	public int holidayList(HolidayList list);

	public Iterable<HolidayList> getholiday();

//	public int LeaveManagement(LeaveManagement leaveManagement);

//	public HolidayList holidayList(HashMap<Integer, HolidayList> u);

	

	

	/* public HolidayList holidayList(HolidayList list); */

	
}
