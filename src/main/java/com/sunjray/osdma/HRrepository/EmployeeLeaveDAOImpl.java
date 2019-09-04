package com.sunjray.osdma.HRrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.Leave;
import com.sunjray.osdma.mapper.EmployeeLeaveRowMapper;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class EmployeeLeaveDAOImpl implements EmployeeLeaveDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Iterable<Leave> findAllLeave() {
		
		 return jdbcTemplate.query(QueryConstant.DISPLAY_ALL_LEAVE,new EmployeeLeaveRowMapper());
	}
	
}
