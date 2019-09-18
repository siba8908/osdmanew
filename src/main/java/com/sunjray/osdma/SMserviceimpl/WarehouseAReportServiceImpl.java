package com.sunjray.osdma.SMserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.SMdao.WarehouseAReportDao;
import com.sunjray.osdma.SMservice.WarehouseAReportService;
import com.sunjray.osdma.dto.ConsignmentMaterialDTO;
import com.sunjray.osdma.dto.WarehouseProductDTO;

@Service
public class WarehouseAReportServiceImpl implements WarehouseAReportService {

	@Autowired
	WarehouseAReportDao warehouseAReportDao;
	
	@Override
	public List<ConsignmentMaterialDTO> fetchAllMaterialsReport() {
		return warehouseAReportDao.fetchAllMaterialsReport();
	}

	@Override
	public List<WarehouseProductDTO> fetchAllStockOutProductsReport() {
		return warehouseAReportDao.fetchAllStockOutProductsReport();
	}

}
