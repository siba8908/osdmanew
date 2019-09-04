package com.sunjray.osdma.AMrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.AMmodel.AMDashboard;
import com.sunjray.osdma.AMmodel.MaterialPurchase;
import com.sunjray.osdma.mapper.ApprovedRowMapper;
import com.sunjray.osdma.mapper.ConsignmentExtractor;
import com.sunjray.osdma.mapper.DashboardExtractor;

import com.sunjray.osdma.util.QueryConstant;
@Repository
public class AMDashboardDAOImpl implements AMDashboardDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<AMDashboard> getAllDetails() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(QueryConstant.GET_ALL_DETAILS, new DashboardExtractor());
	}

	@Override
	public int paydashboard(AMDashboard d) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(QueryConstant.PAY_DASHBOARD, d.getDate(), d.getTransactionId(), d.getApprovedAmount());
	}

	@Override
	public Iterable<MaterialPurchase> getList() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(QueryConstant.GET_LIST, new ConsignmentExtractor());
	}
	
	@Override
	public Iterable<AMDashboard> getapprovedList() {
	
		return jdbcTemplate.query(QueryConstant.GET_ALL_APPROVED_LIST, new ApprovedRowMapper() );
	}

}