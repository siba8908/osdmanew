package com.sunjray.osdma.AMrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.AMmodel.RaiseBill;

import com.sunjray.osdma.mapper.PayrollResultSetExtractor;
import com.sunjray.osdma.mapper.RaiseBillListRowMapper;
import com.sunjray.osdma.mapper.RaiseBillRowMapper;
import com.sunjray.osdma.util.QueryConstant;
@Repository
public class RaiseBillDAOImpl implements RaiseBillDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<RaiseBill> riseBill() {
		// TODO Auto-generated method stub
		
		return jdbcTemplate.query(QueryConstant.GET_SITENAME,  new RaiseBillRowMapper());
	}

	@Override
	public int saveBill(RaiseBill rBill) {
		// TODO Auto-generated method stub
		 return jdbcTemplate.update(QueryConstant.SAVE_BILL,rBill.getSiteCodeId(),rBill.getSiteDate(),rBill.getAmount(),rBill.getRemarks());
	}

	@Override
	public Iterable<RaiseBill> getBilllist() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(QueryConstant.GETBILL_LIST,  new RaiseBillListRowMapper());
	}

}
