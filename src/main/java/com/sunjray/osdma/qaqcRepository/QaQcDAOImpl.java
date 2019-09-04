package com.sunjray.osdma.qaqcRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.AMmodel.MaterialPurchase;
import com.sunjray.osdma.mapper.ComponentRowMapper;
import com.sunjray.osdma.mapper.QaqcRowMapper;
import com.sunjray.osdma.mapper.RejectListRowMapper;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcModel.QaqcItem;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class QaQcDAOImpl implements QaQcDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<MaterialPurchase> getItem() {
		return jdbcTemplate.query(QueryConstant.DISPLAYALL_ITEM,new QaqcRowMapper());
	}

	@Override
	public int addItems(QaqcItem qaqcItem) {
		return jdbcTemplate.update(QueryConstant.INSERT_ITEMS_DETAILS,qaqcItem.getProductCode(),qaqcItem.getBarcode(),qaqcItem.getQuality(),qaqcItem.getRemarks(),qaqcItem.getMaterialId());
	}

	@Override
	public List<MaterialCode> getComponent() {
		return jdbcTemplate.query(QueryConstant.DISPLAY_COMPONENT_ITEM,new ComponentRowMapper());
	}

	@Override
	public int getProduct(QaqcItem qaqcItem) {
		return jdbcTemplate.update(QueryConstant.UPDATE_PRODUCT,qaqcItem.getProductCode(),qaqcItem.getItemId());
	}

	@Override
	public Iterable<QaqcItem> getRejectList() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(QueryConstant.SHOW_REJECT_LIST, new RejectListRowMapper());
	}

}
