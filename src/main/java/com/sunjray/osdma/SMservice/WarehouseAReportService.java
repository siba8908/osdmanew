package com.sunjray.osdma.SMservice;

import java.util.List;

import com.sunjray.osdma.dto.ConsignmentMaterialDTO;
import com.sunjray.osdma.dto.WarehouseProductDTO;

public interface WarehouseAReportService {

	List<ConsignmentMaterialDTO> fetchAllMaterialsReport();

	List<WarehouseProductDTO> fetchAllStockOutProductsReport();

}
