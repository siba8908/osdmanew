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
	
	@RequestMapping(value = "/sm-warehouse-b-stock-out", method = RequestMethod.GET)
	public String smWarehouseBStockOut() {
		return "WAREHOUSE-B/sm-warehouse-b-stock-out";
	}
	
	@RequestMapping(value = "/warehouse-b-products-report", method = RequestMethod.GET)
	public String smWarehouseBProductsReport() {
		return "WAREHOUSE-B/sm-wb-products-report";
	}
	
	@RequestMapping(value = "/warehouse-b-stock-in-report", method = RequestMethod.GET)
	public String smWarehouseBStockInReport() {
		return "WAREHOUSE-B/sm-wb-stock-in-report";
	}
	
	@RequestMapping(value = "/warehouse-b-stock-out-report", method = RequestMethod.GET)
	public String smWarehouseBStockOutReport() {
		return "WAREHOUSE-B/sm-wb-stock-out-report";
	}

}
