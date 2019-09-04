package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.qaqcModel.Component;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcModel.QaqcItem;

public class RejectListRowMapper implements RowMapper<QaqcItem> {

	@Override
	public QaqcItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		QaqcItem qac=new QaqcItem();		
		qac.setProductCode(rs.getString("product_code"));
		System.out.println(rs.getString("product_code"));
		qac.setBarcode(rs.getString("barcode"));
		qac.setRemarks(rs.getString("remarks"));
		return qac;
	}

}
