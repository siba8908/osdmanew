package com.sunjray.osdma.HRrepository;

import com.sunjray.osdma.HRmodel.HolidayList;

public interface HolidayDAO {

	Iterable<HolidayList> findAll();

	int save(HolidayList list);

}
