package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.AMmodel.RaiseRequest;
import com.sunjray.osdma.AMmodel.ProPersonalDtls;
import com.sunjray.osdma.AMmodel.ServProBill;
import com.sunjray.osdma.AMmodel.SiteCode;





public class RaiseRequestRowMapper implements RowMapper<RaiseRequest>  {
	public RaiseRequest  mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		RaiseRequest accountManagerObj=new RaiseRequest() ;
		ProPersonalDtls proPersonalDtlsObj=new ProPersonalDtls();
		ServProBill servProBillObj=new ServProBill() ;
		SiteCode siteCodeObj=new SiteCode();
		
		proPersonalDtlsObj.setProviderId(rs.getInt(1));
		servProBillObj.setBillNo(rs.getString(2));
		servProBillObj.setBillAmount(rs.getDouble(3));
		servProBillObj.setBillDate(rs.getDate(4));
		siteCodeObj.setSiteCodeId(rs.getInt(5));
		accountManagerObj.setProPersonalDtls(proPersonalDtlsObj);
		accountManagerObj.setServProBill(servProBillObj);
		accountManagerObj.setSiteCode(siteCodeObj);
		return accountManagerObj;
	}

}
