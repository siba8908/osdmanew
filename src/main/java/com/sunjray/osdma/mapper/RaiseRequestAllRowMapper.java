package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.AMmodel.ProPersonalDtls;
import com.sunjray.osdma.AMmodel.RaiseRequest;
import com.sunjray.osdma.AMmodel.RaisedRequestReport;
import com.sunjray.osdma.AMmodel.ServProBill;
import com.sunjray.osdma.AMmodel.SiteCode;

public class RaiseRequestAllRowMapper implements RowMapper<RaisedRequestReport> {

	@Override
	public RaisedRequestReport mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		RaisedRequestReport raiseRequestReport= new RaisedRequestReport();
		
		
		/*
		 * RaiseRequest accountManagerObj=new RaiseRequest() ; ProPersonalDtls
		 * proPersonalDtlsObj=new ProPersonalDtls(); ServProBill servProBillObj=new
		 * ServProBill() ; SiteCode siteCodeObj=new SiteCode();
		 */
		
		raiseRequestReport.setProviderId(rs.getLong("provider_id"));
		raiseRequestReport.setBillNo(rs.getString("bill_no"));
		raiseRequestReport.setBillAmount(rs.getDouble("bill_amount"));
		raiseRequestReport.setBillDate(rs.getDate("bill_date"));
		raiseRequestReport.setSiteCode(rs.getString("site_code"));
		
		return raiseRequestReport;
		
		

	}

}
