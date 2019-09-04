package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sunjray.osdma.AMmodel.ConsingementTrackC2P;
import com.sunjray.osdma.AMmodel.MaterialPurchase;

public class ConsignmentExtractor implements ResultSetExtractor<List<MaterialPurchase>> {

	@Override
	public List<MaterialPurchase> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		List<MaterialPurchase> getList = new ArrayList<MaterialPurchase>();
		while(rs.next()) {
			MaterialPurchase mp= new MaterialPurchase();
			ConsingementTrackC2P cong = new ConsingementTrackC2P();
			cong.setConsignmentNo(rs.getLong("consignment_no"));
			mp.setMaterialId(rs.getInt("material_id"));
			mp.setItemName(rs.getString("item_name"));
			mp.setSerialNo(rs.getString("serial_no"));
			mp.setCong(cong);
			getList.add(mp);
		}
		return getList;
	}

}
