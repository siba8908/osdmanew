package com.sunjray.osdma.SMwarehouseAService;

import javax.validation.Valid;

import com.sunjray.osdma.SMwarehouseAModel.ServProBill;

public interface ServProBillService {

	void save(@Valid ServProBill servProBill);

}
