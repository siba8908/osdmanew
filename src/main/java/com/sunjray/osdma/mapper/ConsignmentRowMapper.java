package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sunjray.osdma.AMmodel.Consinment;


public class ConsignmentRowMapper implements ResultSetExtractor<List<Consinment>> {

	@Override
	public List<Consinment> extractData(ResultSet rs) throws SQLException, DataAccessException {

		List<Consinment> con=new ArrayList<Consinment>();

       while(rs.next())
       {
    	   Consinment c = new Consinment();
    	   c.setConsignment_id(rs.getInt(1));
    	   c.setConsingement_no(rs.getInt(2));
    	   c.setAirwaybill_no(rs.getString(3));
    	   c.setStatus(rs.getString(4));
    	   c.setExp_arrival_date(rs.getDate(5));
    	   c.setAct_arrival_date(rs.getDate(6));
    	   c.setUpdated_on(rs.getDate(7));
    	   con.add(c);
       }
		return con;
	}






}
