package com.sunjray.osdma.SMdao;

import java.util.List;

import com.sunjray.osdma.dto.DistrictWarehouseProductDTO;
import com.sunjray.osdma.dto.DwStockOutReportDTO;

public interface DistrictWarehouseDao {

	List<DistrictWarehouseProductDTO> findAllProductList();

	List<DistrictWarehouseProductDTO> findStockOutProductList();

	Boolean addStorageLocation(DistrictWarehouseProductDTO productDTO);

	List<DistrictWarehouseProductDTO> getAllProductReportList();

	List<DwStockOutReportDTO> getAllStockOutReportList();

	List<DistrictWarehouseProductDTO> getAllStockInProductsReport();

}
