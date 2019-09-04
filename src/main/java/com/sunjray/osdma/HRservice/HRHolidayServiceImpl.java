package com.sunjray.osdma.HRservice;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunjray.osdma.HRmodel.HolidayList;
import com.sunjray.osdma.HRrepository.HolidayDAO;


@Service

public class HRHolidayServiceImpl implements HRHolidayService {

   @Autowired
   private HolidayDAO adao;
   
	/*
	 * @Override public HolidayList holidayList(HolidayList list) { // TODO
	 * Auto-generated method stub return adao.save(list); }
	 */

@Override
public Iterable<HolidayList> getholiday() {
	Iterable<HolidayList>u=null;
	u=adao.findAll();
	return u;
}

	@Override
	public int holidayList(HolidayList list) {
	
		return adao.save(list);
	}

//	@Override public void holidayList(HolidayList u) { 
//	   adao.save(u);
//	   }

	



	/*
	 * @Override public String LeaveManagement(
	 * com.nucigent.osdma.model.LeaveManagement leaveManagement) {
	 * 
	 * return adao.save(leaveManagement); }
	 */


	/*
	 * @Override public int LeaveManagement(LeaveManagement leaveManagement) { //
	 * use DAO return adao.save(leaveManagement);
	 * 
	 * 
	 * }
	 */

	/*
	 * @Override public HolidayList holidayList(HashMap<Integer, HolidayList> u) {
	 * // TODO Auto-generated method stub return adao.save(u); }
	 */


}





	/*
	 * @Override public HolidayList holidayList(HolidayList list) { // TODO
	 * Auto-generated method stub return hrRepository.save(list); }
	 */

