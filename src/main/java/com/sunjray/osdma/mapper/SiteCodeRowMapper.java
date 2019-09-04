package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.AMmodel.SiteCode;

public class SiteCodeRowMapper implements RowMapper<SiteCode> {

	@Override
	public SiteCode mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		SiteCode s=new SiteCode();
		s.setSiteCode(rs.getString("site_code"));
		s.setSiteCodeId(rs.getInt("sitecode_id"));
		System.out.println(rs.getLong("sitecode_id"));
		return s;
	}

}
