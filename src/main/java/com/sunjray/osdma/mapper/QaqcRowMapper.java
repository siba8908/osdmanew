package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;


import com.sunjray.osdma.AMmodel.MaterialPurchase;


public class QaqcRowMapper implements ResultSetExtractor<List<MaterialPurchase>> {


	@Override
	public List<MaterialPurchase> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<MaterialPurchase> mp = new ArrayList<MaterialPurchase>();
		
		while(rs.next())
		{
			MaterialPurchase material= new MaterialPurchase();
			material.setMaterialId(rs.getInt(1));
			material.setItemName(rs.getString(2));
			material.setQuantity(rs.getInt(3));
			mp.add(material);
		}
		
		return mp;
	}

}
