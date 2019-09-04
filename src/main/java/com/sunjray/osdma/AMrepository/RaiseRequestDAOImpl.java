package com.sunjray.osdma.AMrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.mapper.RaiseRequestRowMapper;
import com.sunjray.osdma.mapper.LedgerExtractor;
import com.sunjray.osdma.mapper.RaiseRequestAllRowMapper;
import com.sunjray.osdma.mapper.RaiseRequestResultSetExtractor;
import com.sunjray.osdma.mapper.ServiceProviderTypeResultSetExtractor;
import com.sunjray.osdma.AMmodel.RaiseRequest;
import com.sunjray.osdma.AMmodel.RaisedRequestReport;
import com.sunjray.osdma.AMmodel.ServProBill;
import com.sunjray.osdma.AMmodel.MasterSerProviderType;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class RaiseRequestDAOImpl implements RaiseRequestDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<RaiseRequest> fetchAllServiceProviderAccountDetails(MasterSerProviderType masterSerProviderType) {
		List<RaiseRequest> accountManagerList = null;
		accountManagerList = jdbcTemplate.query(QueryConstant.GET_ACCOUNTMANAGEMENT_DETAILS,
				new RaiseRequestResultSetExtractor(), masterSerProviderType.getServiceProviderId());
		return accountManagerList;
	}

	public int saveRaiseRequest(RaiseRequest accounManager) {
		System.out.println("saveRaiseRequestDAOIMPL...Start");
		int result = 0;
		RaiseRequest accountManagerObj = null;
		accountManagerObj = jdbcTemplate.queryForObject(QueryConstant.GET_ONE_BILLDETAILS_By_BILL_ID,
				new RaiseRequestRowMapper(), accounManager.getServProBill().getBillId());
		result = jdbcTemplate.update(QueryConstant.SET_PM_FUND_REQUEST,
				accountManagerObj.getProPersonalDtls().getProviderId(), accountManagerObj.getServProBill().getBillNo(),
				accountManagerObj.getServProBill().getBillAmount(), accountManagerObj.getServProBill().getBillDate(),
				accountManagerObj.getSiteCode().getSiteCodeId(), accounManager.getPmFundRequest().getPurpose());
		result = jdbcTemplate.update(QueryConstant.SET_BILL_STATUS, accounManager.getServProBill().getBillId());
		System.out.println("saveRaiseRequestDAOIMPL...END");
		return result;
	}

	public List<MasterSerProviderType> fetchAllProviderType() {
		List<MasterSerProviderType> masterSerProviderTypeList = null;
		masterSerProviderTypeList = jdbcTemplate.query(QueryConstant.GET_PROVIDER_TYPE_AND_ID,
				new ServiceProviderTypeResultSetExtractor());
		return masterSerProviderTypeList;
	}

	@Override
	public Iterable<RaisedRequestReport> getRequest() {
		return jdbcTemplate.query(QueryConstant.GET_ALL_RAISE_REQUEST,
				new RaiseRequestAllRowMapper());
	}

	@Override
	public List<ServProBill> ledgerTypeReport(MasterSerProviderType masterSerProviderType) {
		System.out.println("type"+masterSerProviderType.getServiceProviderId());
		return jdbcTemplate.query(QueryConstant.GET_LEDGER_BY_TYPE,new LedgerExtractor(),masterSerProviderType.getServiceProviderId());
	}

}
