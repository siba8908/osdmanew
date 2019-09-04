package com.sunjray.osdma.AMrepository;

import java.util.List;

import com.sunjray.osdma.AMmodel.RaiseBill;

public interface RaiseBillDAO {

	List<RaiseBill> riseBill();

	int saveBill(RaiseBill rBill);

	Iterable<RaiseBill> getBilllist();

}
