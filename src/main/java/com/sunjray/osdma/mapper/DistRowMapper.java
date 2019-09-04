package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.SingleEmpDetails;

public class DistRowMapper implements RowMapper<SingleEmpDetails> {

	@Override
	public SingleEmpDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		SingleEmpDetails seed=null;
		seed=new SingleEmpDetails();
		seed.setDist(rs.getInt(1));
		seed.setDistName(rs.getString(2));
		return seed;
	}

}
