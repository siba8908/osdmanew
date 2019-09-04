package com.sunjray.osdma.HRrepository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.sunjray.osdma.HRmodel.LeaveManagement;
import com.sunjray.osdma.mapper.LeaveManageRowMapper;
import com.sunjray.osdma.mapper.LeaveRowMapper;
import com.sunjray.osdma.mapper.LeaveTakenMapper;
import com.sunjray.osdma.util.QueryConstant;

@Repository("LeaveManageDao")
public class LeaveMangeDaoImpl implements LeaveManageDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private JdbcTemplate jt;
	
	
	
	  @Override public int save(LeaveManagement leaveManagement,long leaveTaken) { 
		 // TODO Auto-generated method stub 
	 int count=0; 
	 java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
	  count=jt.update(QueryConstant.Insert_Leave,leaveManagement.getEmployeeCode(),leaveManagement.getFromDate(),leaveManagement.getToDate(),leaveManagement.getLeaveType()); 
	   
	  jt.update(QueryConstant.UPDATE_LEAVE,leaveTaken,leaveManagement.getEmployeeCode(),leaveManagement.getLeaveType());
	  
	  return count;
	  }
	 
	  @Override
		public Iterable<LeaveManagement> findAllLeave() {
			
			 return jdbcTemplate.query(QueryConstant.GET_LEAVEMANG,new LeaveManageRowMapper());
		}

	  @Override
		public List<LeaveManagement> getleavedetails(LeaveManagement leave) {
			// TODO Auto-generated method stub
			System.out.println("---------getleavedetails-----------$$$$$$$$$$$$$$$$$$$");
			
	         //SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
		
//		  try {
//		  
//		  SimpleDateFormat parser = new SimpleDateFormat(" MM dd yyyy");
//		  Date thedate = parser.parse(leave.getFromDate()); 
//		  SimpleDateFormat formatter = new  SimpleDateFormat("MM/dd/yyyy"); 
//		  String Reformatted =formatter.format(thedate);
//		  
//		  //Date date = sdf.parse(leave.getFrom_date());
//		  
//		  //System.out.println(Reformatted); 
//		  } 
//		  catch (ParseException e) { // TODO
//		  e.printStackTrace(); 
//		  }
//		 
			 return jdbcTemplate.query(QueryConstant.DISPLAY_LEAVE,new LeaveRowMapper(),leave.getFromDate(),leave.getToDate());
		}

	@Override
	public LeaveManagement findLeave(LeaveManagement leaveManagement) {
	
		System.out.println("EmployeeDAOCode::"+leaveManagement.getEmployeeCode());
		System.out.println("EmployeeDAOType::"+leaveManagement.getLeaveType());
		LeaveManagement i=jdbcTemplate.queryForObject(QueryConstant.FIND_LEAVETAKEN,new LeaveTakenMapper(),leaveManagement.getEmployeeCode(),leaveManagement.getLeaveType());
	
		System.out.println("DQWPIOP:"+i.getLeaveTaken());
		
	  return i;
	}	
	  
	  
}
