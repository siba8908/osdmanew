package com.sunjray.osdma.SMController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dw")
public class SMIndexController {

	@RequestMapping("/sm-district-warehouse-dashboard")
	String smDashboard() {
		return "SM/sm-district-warehouse-dashboard";
	}

	@RequestMapping("/sm-district-warehouse-product-list")
	String smWarehouseProductList() {
		return "SM/sm-district-warehouse-product-list";
	}

	@RequestMapping("/sm-district-warehouse-stocks")
	String smWarehouseStocks() {
		return "SM/sm-district-warehouse-stocks";
	}

	@RequestMapping("/district-warehouse-product-list-report")
	String smWarehouseProductListReport() {
		return "SM/sm-dw-product-list-report";
	}

	@RequestMapping("/district-warehouse-stock-in-report")
	String smWarehouseStockInReport() {
		return "SM/sm-dw-stock-in-report";
	}

	@RequestMapping("/district-warehouse-stock-out-report")
	String smWarehouseStockOutReport() {
		return "SM/sm-dw-stock-out-report";
	}

}
