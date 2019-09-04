package com.sunjray.osdma.HRrepository;


import com.sunjray.osdma.HRmodel.LeaveManagement;


/*import com.sunjray.osdma.model.HolidayList;
import com.sunjray.osdma.model.LeaveManagement;
import com.sunjray.osdma.model.QAQCMaterialCod;
*/

	public interface LeaveManageDao {


		// public int insert(ClinicalChart chart);

	public int save(LeaveManagement leaveManagement, long leaveTaken);

	public Iterable<LeaveManagement> findAllLeave();

	public java.util.List<LeaveManagement> getleavedetails(LeaveManagement leave);

	public LeaveManagement findLeave(LeaveManagement leaveManagement);



	

		

	}

