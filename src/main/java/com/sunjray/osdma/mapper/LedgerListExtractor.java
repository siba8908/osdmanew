package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sunjray.osdma.AMmodel.ProPersonalDtls;
import com.sunjray.osdma.AMmodel.ServProBill;

public class LedgerListExtractor implements ResultSetExtractor<List<ServProBill>> {

	public List<ServProBill> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<ServProBill> getLedgerList = new ArrayList<ServProBill>();
		while (rs.next()) {
			ServProBill sp = new ServProBill();
			ProPersonalDtls pro = new ProPersonalDtls();
			pro.setProviderName(rs.getString("provider_name"));
			sp.setBillDate(rs.getDate("bill_date"));
			sp.setBillAmount(rs.getDouble("bill_amount"));
			sp.setPaymentDate(rs.getDate("payment_date"));
			sp.setPaymentAmount(rs.getDouble("paid_amount"));
			sp.setPro(pro);
			getLedgerList.add(sp);
		}
		return getLedgerList;
	}

}
