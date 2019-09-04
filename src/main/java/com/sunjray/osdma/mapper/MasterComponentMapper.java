package com.sunjray.osdma.mapper;
	
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.qaqcModel.Component;



		public class MasterComponentMapper implements RowMapper<Component> {

			@Override
			public Component mapRow(ResultSet rs, int arg1) throws SQLException 
			{
				Component qi = new Component();
				  qi.setComponentId(rs.getInt(1)); 
				  qi.setComponentName(rs.getString(2));
				  qi.setQuantity(rs.getString(3));
				  //qi.setProduct_id(rs.getInt(4));
				
				return qi;

			}


	}


