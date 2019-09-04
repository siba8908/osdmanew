package com.sunjray.osdma.mapper;



	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.time.temporal.ChronoUnit;

	import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.HolidayList;


	public class HolidayRowMapper implements RowMapper<HolidayList> {

		@Override
		public HolidayList mapRow(ResultSet rs, int arg1) throws SQLException 
		{
			HolidayList holi = new HolidayList();
			// LeaveBalance leaveBalnce=new LeaveBalance();

			//holi.setId((rs).getLong(1));
			holi.setHoliday_date(rs.getString(1));
			holi.setHoliday_day(rs.getString(2));
			holi.setHoliday_events(rs.getString(3));
			//holi.setHoliday_doc(rs.getString(5));
			//holi.setCreated_date(rs.getString(6));
			
			//Plus 1 to consider CurrentDate
			/*empLeave.setNoOfDays(1+ChronoUnit.DAYS.between(empLeave.getFromdate().toLocalDate(),
					empLeave.getTodate().toLocalDate()));*/
			
			
			return holi;

		}

	}


