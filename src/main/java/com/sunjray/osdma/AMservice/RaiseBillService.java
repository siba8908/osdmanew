package com.sunjray.osdma.AMservice;

import java.util.List;

import com.sunjray.osdma.AMmodel.RaiseBill;



public interface RaiseBillService {

	List<RaiseBill> riseBill();

	int saveBill(RaiseBill rBill);

	Iterable<RaiseBill> getBilllist();

}
