package com.sunjray.osdma.SMdao;

import java.util.List;

import com.sunjray.osdma.dto.WarehouseProductDTO;
import com.sunjray.osdma.dto.DwStockOutReportDTO;

public interface DistrictWarehouseDao {

	List<WarehouseProductDTO> findAllProductList();

	List<WarehouseProductDTO> findStockOutProductList();

	Boolean addStorageLocation(WarehouseProductDTO productDTO);

	List<WarehouseProductDTO> getAllProductReportList();

	List<DwStockOutReportDTO> getAllStockOutReportList();

	List<WarehouseProductDTO> getAllStockInProductsReport();

}
