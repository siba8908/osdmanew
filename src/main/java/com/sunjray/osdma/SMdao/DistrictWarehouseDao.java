package com.sunjray.osdma.SMdao;

import java.util.List;

import com.sunjray.osdma.dto.DistrictWarehouseProductDTO;

public interface DistrictWarehouseDao {

	List<DistrictWarehouseProductDTO> findAllProductList();

	List<DistrictWarehouseProductDTO> findStockOutProductList();

	Boolean addStorageLocation(DistrictWarehouseProductDTO productDTO);

}
