package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.AMmodel.AMDailyExpence;

public class DailyMapper implements RowMapper<AMDailyExpence> {

	@Override
	public AMDailyExpence mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		AMDailyExpence de = new AMDailyExpence();
		de.setTransactionDate(rs.getDate("transaction_date"));
		de.setAmount(rs.getDouble("amount"));
		de.setCashFlow(rs.getString("cash_inflow_outflow"));
		de.setPaymentType(rs.getString("payment_type"));
		return de;
	}

}
