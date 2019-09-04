package com.sunjray.osdma.AMrepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.sunjray.osdma.AMmodel.AMDailyExpence;
import com.sunjray.osdma.mapper.DailyExtractor;
import com.sunjray.osdma.mapper.DailyMapper;
import com.sunjray.osdma.util.QueryConstant;
@Repository
public class AMDailyExpenceDAOImpl implements AMDailyExpenceDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<AMDailyExpence> dailyDetails() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(QueryConstant.DAILY_DETAILS, new DailyExtractor());
	}

	@Override
	public int addDetails(AMDailyExpence ex) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(QueryConstant.INSERT_VALUES, ex.getTransactionId(), ex.getAmount(), ex.getAccountHead(), ex.getTransctionPurpose(), ex.getPaymentType(), ex.getBankTransId(), ex.getRemarks());
	}

	@Override
	public Iterable<AMDailyExpence> getData() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(QueryConstant.GET_DATA, new DailyMapper());
	}

}