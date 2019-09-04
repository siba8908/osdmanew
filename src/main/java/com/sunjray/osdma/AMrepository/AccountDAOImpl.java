package com.sunjray.osdma.AMrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.AMmodel.Consinment;
import com.sunjray.osdma.mapper.AccountRowMapper;
import com.sunjray.osdma.mapper.ConsignmentRowMapper;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class AccountDAOImpl implements AccountDAO{
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int addConsinment(Consinment consinment) {

		return jdbcTemplate.update(QueryConstant.UPDATE_CONSINMENT,consinment.getConsingement_no(),consinment.getAirwaybill_no(),consinment.getStatus(),consinment.getExp_arrival_date(),consinment.getAct_arrival_date(),consinment.getUpdated_on());
	}

	@Override
	public List<Consinment> findAllMaterial() {
		return jdbcTemplate.query(QueryConstant.DISPLAYALL_TRACK_MATERIAL,new AccountRowMapper());
	}

	@Override
	public int updateTrack(Consinment consinment) {
		return jdbcTemplate.update(QueryConstant.UPDATE_TRACK_MATERIAL,consinment.getConsingement_no(),consinment.getAirwaybill_no(),consinment.getStatus(),consinment.getExp_arrival_date(),consinment.getAct_arrival_date(),consinment.getUpdated_on(),consinment.getConsignment_id());
	}

	@Override
	public List<Consinment> findAllConsignmentNo() {
		return jdbcTemplate.query(QueryConstant.DISPLAY_CONSIGNMENT_NO,new ConsignmentRowMapper());
	}

	@Override
	public void addmaterial(String item_name, String serial_no, Integer quantity,Integer consinment_id) {
		jdbcTemplate.update(QueryConstant.INSERT_MATERIAL,item_name,serial_no,quantity,consinment_id);	
		
	}
	

}
