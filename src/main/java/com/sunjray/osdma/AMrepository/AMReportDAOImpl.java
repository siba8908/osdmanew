package com.sunjray.osdma.AMrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.AMmodel.ConsingementTrackP2A;
import com.sunjray.osdma.AMmodel.Consinment;
import com.sunjray.osdma.AMmodel.Expence;
import com.sunjray.osdma.AMmodel.ServProBill;
import com.sunjray.osdma.AMmodel.SiteCode;
import com.sunjray.osdma.mapper.ExpenceRowMapper;
import com.sunjray.osdma.mapper.LedgerListExtractor;
import com.sunjray.osdma.mapper.SiteCodeRowMapper;
import com.sunjray.osdma.mapper.Trackingc2pRowMapper;
import com.sunjray.osdma.mapper.Trackingp2aRowMapper;
import com.sunjray.osdma.util.QueryConstant;
@Repository
public class AMReportDAOImpl implements AMReportDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Iterable<ServProBill> getLedgerList() {
		return jdbcTemplate.query(QueryConstant.GET_LEDGER_LIST, new LedgerListExtractor());
	}

	@Override
	public Iterable<Consinment> getTrackingc2p() {
		return jdbcTemplate.query(QueryConstant.GET_TRACKING_C2P, new Trackingc2pRowMapper());
	}

	@Override
	public Iterable<ConsingementTrackP2A> getTrackingp2a() {
		return jdbcTemplate.query(QueryConstant.GET_TRACKING_P2A, new Trackingp2aRowMapper());
	}
	
	@Override
	public List<SiteCode> getAllSiteCode() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(QueryConstant.GET_ALL_SITE_CODE, new SiteCodeRowMapper());
	}

	@Override
	public Expence ExpencesReport(SiteCode sitecode) {
		// TODO Auto-generated method stub
		List<Expence> a=jdbcTemplate.query(QueryConstant.GET_EXPENCES_BY_SITECODE, new ExpenceRowMapper(),sitecode.getSiteCodeId());
			//return jdbcTemplate.query(QueryConstant.GET_EXPENCES_BY_SITECODE, new ExpenceRowMapper(),sitecode.getSiteCodeId());
		System.out.println("size::"+a.size());
		return a.get(0);
	}
}
