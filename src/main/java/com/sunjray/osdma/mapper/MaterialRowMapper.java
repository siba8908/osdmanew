package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.qaqcModel.QaqcItem;

public class MaterialRowMapper implements RowMapper<QaqcItem> {
	@Override
	public QaqcItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		QaqcItem qac=new QaqcItem();		
		qac.setProductCode(rs.getString("product_code"));
		qac.setBarcode(rs.getString("barcode"));
		qac.setQuality(rs.getString("quality"));
		qac.setCreatedDate(rs.getDate("created_date"));
		qac.setCreatedBy(rs.getInt("created_by"));
		qac.setRemarks(rs.getString("remarks"));
		return qac;
	}

}
