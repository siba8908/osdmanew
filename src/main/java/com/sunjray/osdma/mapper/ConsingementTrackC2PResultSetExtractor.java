package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sunjray.osdma.AMmodel.ConsingementTrackC2P;



public class ConsingementTrackC2PResultSetExtractor implements ResultSetExtractor<List<ConsingementTrackC2P>> {
	@Override
	public List<ConsingementTrackC2P> extractData(ResultSet rs) throws SQLException, DataAccessException
	{
		List<ConsingementTrackC2P> consingementTrackC2PList=new ArrayList<ConsingementTrackC2P>();
		while(rs.next())
		{
			ConsingementTrackC2P consingementTrackC2P=new ConsingementTrackC2P();
			consingementTrackC2P.setConsignmentId(rs.getInt(1));
			consingementTrackC2P.setConsignmentNo(rs.getLong(2));
		
			consingementTrackC2PList.add(consingementTrackC2P);
		}
		return consingementTrackC2PList;
	}
	

}
