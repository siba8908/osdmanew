package com.sunjray.osdma.AMservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.AMmodel.AMDailyExpence;
import com.sunjray.osdma.AMrepository.AMDailyExpenceDAO;
@Service
public class AMDailyExpenceServiceImpl implements AMDailyExpenceService {

	@Autowired
	private AMDailyExpenceDAO dailyDAO;
	@Override
	public List<AMDailyExpence> dailyDetails() {
		// TODO Auto-generated method stub
		return dailyDAO.dailyDetails();
	}
	@Override
	public int addDetails(AMDailyExpence ex) {
		// TODO Auto-generated method stub
		return dailyDAO.addDetails(ex);
	}
	@Override
	public Iterable<AMDailyExpence> getData() {
		// TODO Auto-generated method stub
		return dailyDAO.getData();
	}

}
