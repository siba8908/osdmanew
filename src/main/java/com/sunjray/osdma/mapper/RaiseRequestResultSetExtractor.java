package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sunjray.osdma.AMmodel.RaiseRequest;
import com.sunjray.osdma.AMmodel.ProPersonalDtls;
import com.sunjray.osdma.AMmodel.ServProBill;
import com.sunjray.osdma.AMmodel.SiteCode;



public class RaiseRequestResultSetExtractor implements ResultSetExtractor<List<RaiseRequest>> {
	public List<RaiseRequest> extractData(ResultSet rs) throws SQLException, DataAccessException
	{
		List<RaiseRequest> accountManagerList=new ArrayList<RaiseRequest>();
		RaiseRequest accountManagerObj=null;
		ProPersonalDtls proPersonalDtlsObj=null;
		ServProBill servProBillObj=null;
		SiteCode siteCodeObj=null;
		while(rs.next())
		{
			accountManagerObj=new RaiseRequest();
			proPersonalDtlsObj=new ProPersonalDtls();
			proPersonalDtlsObj.setProviderId(rs.getInt(1));
			proPersonalDtlsObj.setProviderName(rs.getString(6));
			
			accountManagerObj.setProPersonalDtls(proPersonalDtlsObj);
			
			
			servProBillObj=new ServProBill();
			servProBillObj.setBillNo(rs.getString(2));
			servProBillObj.setBillId(rs.getInt(8));
			
			
			servProBillObj.setBillAmount(rs.getDouble(3));
			servProBillObj.setBillDate(rs.getDate(4));
			accountManagerObj.setServProBill(servProBillObj);
			
			siteCodeObj=new SiteCode();
			siteCodeObj.setSiteCode(rs.getString(5));
			siteCodeObj.setSiteCodeId(rs.getInt(7));
			accountManagerObj.setSiteCode(siteCodeObj);
			
			
			accountManagerList.add(accountManagerObj);
		}
		return accountManagerList;
	}

}
