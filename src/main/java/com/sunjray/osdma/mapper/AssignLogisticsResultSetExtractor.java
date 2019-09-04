package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sunjray.osdma.AMmodel.AssignLogistics;
import com.sunjray.osdma.AMmodel.ConsingementTrackC2P;
import com.sunjray.osdma.AMmodel.ProPersonalDtls;



public class AssignLogisticsResultSetExtractor implements ResultSetExtractor<List<AssignLogistics>> {
	public List<AssignLogistics> extractData(ResultSet rs) throws SQLException, DataAccessException
	{
		List<AssignLogistics> assignLogisticsList=new ArrayList<AssignLogistics>() ;
	
		while(rs.next())
		{
			AssignLogistics assignLogisticsObj=new AssignLogistics();
			ConsingementTrackC2P ConsingementTrackC2PObj=new ConsingementTrackC2P();
			ProPersonalDtls proPersonalDtlsObj=new ProPersonalDtls();
			ConsingementTrackC2PObj.setConsignmentId(rs.getInt(1));
			ConsingementTrackC2PObj.setConsignmentNo(rs.getLong(2));
			System.out.println(rs.getInt(1));
			proPersonalDtlsObj.setProviderId(rs.getInt(3));
			proPersonalDtlsObj.setProviderName(rs.getString(4));
			assignLogisticsObj.setConsingementTrackC2P(ConsingementTrackC2PObj);
			assignLogisticsObj.setProPersonalDtls(proPersonalDtlsObj);
			assignLogisticsList.add(assignLogisticsObj);
		
		}
		return assignLogisticsList;
	}

}
