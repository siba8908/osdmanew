package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.MasterDesignation;

public class EmployeeDesignationMapper implements RowMapper<MasterDesignation>{

	@Override
	public MasterDesignation mapRow(ResultSet rs, int rowNum) throws SQLException {
		MasterDesignation db=new MasterDesignation();
		db.setDesignationId(rs.getInt("designation_id"));
		db.setDesignationName(rs.getString("designation"));
		return db;
		
	}

}
