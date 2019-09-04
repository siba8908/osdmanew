package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sunjray.osdma.AMmodel.ProPersonalDtls;





public class ProPersonalDtlsResultSetExtractor implements ResultSetExtractor<List<ProPersonalDtls>> {
	public List<ProPersonalDtls> extractData(ResultSet rs) throws SQLException, DataAccessException{
		List<ProPersonalDtls> proPersonalDtlsList=new ArrayList<ProPersonalDtls>();
		while(rs.next())
		{
			ProPersonalDtls proPersonalDtlsObj=new ProPersonalDtls();
			proPersonalDtlsObj.setProviderId(rs.getInt(1));
			proPersonalDtlsObj.setProviderName(rs.getString(2));
			
			proPersonalDtlsList.add(proPersonalDtlsObj);
		}
		return proPersonalDtlsList;
	}


}
