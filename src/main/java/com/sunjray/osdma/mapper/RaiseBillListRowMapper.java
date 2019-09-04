package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.AMmodel.RaiseBill;

public class RaiseBillListRowMapper implements RowMapper<RaiseBill> {

	@Override
	public RaiseBill mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		RaiseBill bill=new RaiseBill();
		bill.setSiteName(rs.getString("site_name"));
		bill.setSiteDate(rs.getDate("bill_date"));
		bill.setAmount(rs.getDouble("bill_amount"));
		return bill;
	}

}
