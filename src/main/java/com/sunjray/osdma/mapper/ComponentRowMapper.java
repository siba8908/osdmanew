package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.qaqcModel.Component;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcModel.QaqcItem;



public class ComponentRowMapper implements RowMapper<MaterialCode> {

	@Override
	public MaterialCode mapRow(ResultSet rs, int num) throws SQLException {
		
		MaterialCode mc=null;
		mc=new MaterialCode();
		Component com = new Component();
		mc.setMaterialCodeId(rs.getLong(1));
		mc.setItemId(rs.getInt(2));
		com.setComponentName(rs.getString(3));
		mc.setComponent(com);
		QaqcItem qi=new QaqcItem();
		qi.setProductCode(rs.getString(4));
		mc.setQaqcItem(qi);
		return mc;
	}

}
