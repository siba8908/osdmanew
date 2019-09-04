package com.sunjray.osdma.HRrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.MasterDesignation;
import com.sunjray.osdma.mapper.EmployeeDesignationMapper;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class EmployeeDesignationDaoImpl implements EmployeeDesignationDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<MasterDesignation> getAllDesignations() {
		return jdbcTemplate.query(QueryConstant.GET_EMP_DESIGNATION, new EmployeeDesignationMapper());
		
	}

}
