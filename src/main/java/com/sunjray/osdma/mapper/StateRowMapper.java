package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.SingleEmpDetails;

public class StateRowMapper implements RowMapper<SingleEmpDetails> {

	@Override
	public SingleEmpDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		SingleEmpDetails sed=null;
		sed=new SingleEmpDetails();
		sed.setState(rs.getInt(1));
		sed.setStateName(rs.getString(2));
		return sed;
	}

}
