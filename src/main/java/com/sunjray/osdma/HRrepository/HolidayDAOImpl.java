package com.sunjray.osdma.HRrepository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;

import com.sunjray.osdma.mapper.HolidayRowMapper;

import com.sunjray.osdma.HRmodel.HolidayList;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class HolidayDAOImpl implements HolidayDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private JdbcTemplate jt;

	/*
	 * @Override public int save(LeaveManagement leaveManagement) { // TODO
	 * Auto-generated method stub int count=0; //java.sql.Timestamp date = new
	 * java.sql.Timestamp(new java.util.Date().getTime());
	 * count=jt.update(QueryConstant.Insert_Leave,leaveManagement.getEmp_code(),
	 * leaveManagement.getFrom_date(),leaveManagement.getTo_date(),leaveManagement.
	 * getLeave_type()); return count; }
	 */

//	@Override
//	public void save(HolidayList list) {
//		// TODO Auto-generated method stub
//		//int count=0;
//		//java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
//	  jt.update(QueryConstant.Insert_Holiday,list.getId(),list.getHoliday_date(),list.getHoliday_day(),list.getHoliday_events(),list.getHoliday_doc(),list.getCreated_date());
//		
//	}

	@Override
	public Iterable<HolidayList> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(QueryConstant.DISPLAYALL_HOLIDAY_LIST, new HolidayRowMapper());
	}

	@Override
	public int save(HolidayList u) {
		// int count=0;
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		return jt.update(QueryConstant.Insert_Holiday, u.getHoliday_date(), u.getHoliday_day(), u.getHoliday_events());

	}

	/*
	 * @Override public HolidayList save(HashMap<Integer, HolidayList> u) { // TODO
	 * Auto-generated method stub return null; }
	 */

	/*
	 * @Override public int insert(LeaveManagement leaveManagement) { int count=0;
	 * java.sql.Timestamp date = new java.sql.Timestamp(new
	 * java.util.Date().getTime());
	 * count=jt.update(QueryConstant.CLINICALCHART_INSERT_QUERY,date,chart.getBedid(
	 * ),chart.getNoofdays(),chart.getPrepostot(),chart.getTemperature(),chart.
	 * getPulse(),chart.getResp(),chart.getBp(),chart.getBath(),chart.getBedmaking()
	 * ,chart.getSpecialnursingprocedure(),chart.getAllergy(),chart.getRemarks());
	 * return count; }
	 */
}