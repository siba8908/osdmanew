package com.sunjray.osdma.SMwarehouseBController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("wb")
public class WBIndexController {

	@RequestMapping(value = "/sm-warehouse-b-product-list", method = RequestMethod.GET)
	public String smWarehouseBProfuctList() {
		return "WAREHOUSE-B/sm-warehouse-b-product-list";
	}

	@RequestMapping(value = "/sm-warehouse-b-stocks", method = RequestMethod.GET)
	public String smWarehouseBStockIn() {
		return "WAREHOUSE-B/sm-warehouse-b-stocks";
	}

}
