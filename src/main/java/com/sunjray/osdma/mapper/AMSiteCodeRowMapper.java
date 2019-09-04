package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.sunjray.osdma.AMmodel.SiteCode;

public class AMSiteCodeRowMapper implements RowMapper<SiteCode> {
	
	@Override
	public SiteCode mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		SiteCode Sc=null;
		Sc=new SiteCode();
		Sc.setSiteCodeId(rs.getInt(1));
		Sc.setSiteCode(rs.getString(2));
		
		return Sc;
	}

}
