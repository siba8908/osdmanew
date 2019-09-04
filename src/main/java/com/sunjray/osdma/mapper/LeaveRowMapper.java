package com.sunjray.osdma.mapper;

	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.time.temporal.ChronoUnit;

	import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.LeaveManagement;

	public class LeaveRowMapper implements RowMapper<LeaveManagement> {

		@Override
		public LeaveManagement mapRow(ResultSet rs, int arg1) throws SQLException 
		{
			LeaveManagement empLeave = new LeaveManagement();
			// LeaveBalance leaveBalnce=new LeaveBalance();

			empLeave.setEmployeeCode("code:"+rs.getString(1));
		//System.out.println(rs.getString(1));
		//empLeave.setFrom_date(rs.getString(2)); 
		//empLeave.setTo_date(rs.getString(3));
		
			empLeave.setLeaveType(rs.getString(2));
			//System.out.println("Date:"+rs.getString(2));
			//Plus 1 to consider CurrentDate
			/*empLeave.setNoOfDays(1+ChronoUnit.DAYS.between(empLeave.getFromdate().toLocalDate(),
					empLeave.getTodate().toLocalDate()));*/
			
			
			return empLeave;

		}
		

	}

