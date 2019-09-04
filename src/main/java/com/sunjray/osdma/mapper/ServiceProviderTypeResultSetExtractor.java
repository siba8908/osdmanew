package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sunjray.osdma.AMmodel.MasterSerProviderType;

public class ServiceProviderTypeResultSetExtractor implements ResultSetExtractor<List<MasterSerProviderType>>{

	MasterSerProviderType masterSerProviderTypeObj=null;
	@Override
	
	public List<MasterSerProviderType> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<MasterSerProviderType> masterSerProviderTypeList=new ArrayList<MasterSerProviderType>();
		while(rs.next())
		{
			masterSerProviderTypeObj=new MasterSerProviderType();
			masterSerProviderTypeObj.setServiceProviderId(rs.getInt("service_provider_id"));
			masterSerProviderTypeObj.setServiceProviderType(rs.getString("service_provider_type"));
			masterSerProviderTypeList.add(masterSerProviderTypeObj);
		}
		// TODO Auto-generated method stub
		return masterSerProviderTypeList;
	}

}
