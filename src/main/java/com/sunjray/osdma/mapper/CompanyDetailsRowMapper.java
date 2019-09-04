package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.CompanyDetails;


public class CompanyDetailsRowMapper implements RowMapper<CompanyDetails>  {
	public CompanyDetails mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		CompanyDetails companyDetailsObj=new CompanyDetails() ;
		System.out.println("CompanyDetails...Start");
		companyDetailsObj.setCompanyName(rs.getString(1));
		System.out.println(rs.getString(1));
		System.out.println("CompanyDetails...end");
		return companyDetailsObj;
	}

}
