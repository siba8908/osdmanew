package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.qaqcModel.QaqcItem;

	 
public class QaqcItemsMapper implements RowMapper<QaqcItem> {

	@Override
	public QaqcItem mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		QaqcItem qi = new QaqcItem();
		qi.setItemId(rs.getInt(1)); 
		  qi.setProductCode(rs.getString(2));
		
		return qi;

	}



	}
