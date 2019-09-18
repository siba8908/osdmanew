package com.sunjray.osdma.SMdao;

import java.util.List;

import com.sunjray.osdma.dto.ConsignmentMaterialDTO;
import com.sunjray.osdma.dto.WarehouseProductDTO;

public interface WarehouseAReportDao {

	List<ConsignmentMaterialDTO> fetchAllMaterialsReport();

	List<WarehouseProductDTO> fetchAllStockOutProductsReport();

}
