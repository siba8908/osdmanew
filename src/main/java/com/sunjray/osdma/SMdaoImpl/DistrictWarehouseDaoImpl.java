package com.sunjray.osdma.SMdaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sunjray.osdma.SMdao.DistrictWarehouseDao;
import com.sunjray.osdma.dto.WarehouseProductDTO;
import com.sunjray.osdma.dto.DwStockOutReportDTO;
import com.sunjray.osdma.util.CommonUtil;

@Repository
public class DistrictWarehouseDaoImpl implements DistrictWarehouseDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	private static final String FETCH_PRODUCT_LIST = "SELECT mp.product_name, qpc.product_code_gen, wbp.status, wbp.quantity FROM osdma.t_os_warhouseb_stock_out wbp left outer join osdma.t_os_qaqc_product_code qpc on wbp.product_code_id = qpc.productcode_id left outer join osdma.t_os_master_product mp on qpc.product_id = mp.product_id order by wbp.wh_b_stock_out_id desc";

	private static final String FETCH_STOCK_OUT_PRODUCT_LIST = "SELECT mp.product_name, qpc.product_code_gen, wbs.mat_request_id, wbs.quantity,wbs.wh_b_stock_out_id, wbs.stroge_location FROM osdma.t_os_warhouseb_stock_out wbs left outer join osdma.t_os_qaqc_product_code qpc on wbs.product_code_id = qpc.productcode_id left outer join osdma.t_os_master_product mp on qpc.product_id = mp.product_id order by wbs.mat_request_id desc";

	private static final String UPDATE_STORAGE_LOCATION = "update osdma.t_os_warhouseb_stock_out set stroge_location = ? where wh_b_stock_out_id = ?";
	
	private static final String FETCH_PRODUCT_REPORT_LIST = "SELECT mp.product_name, qpc.product_code_gen, wbp.stroge_location, wbp.quantity FROM osdma.t_os_warhouseb_stock_out wbp left outer join osdma.t_os_qaqc_product_code qpc on wbp.product_code_id = qpc.productcode_id left outer join osdma.t_os_master_product mp on qpc.product_id = mp.product_id where wbp.status ='RECIVED' order by wbp.wh_b_stock_out_id desc";

	private static final String FETCH_STOCK_OUT_REPORT_LIST = "SELECT pc.product_code_gen, mp.product_name, lsc.site_name as from_location, sc.site_name as to_location, ws.created_date, ws.quantity FROM osdma.t_os_dist_warhouse_stock_out ws left outer join osdma.t_os_am_consignment_logistic cl on ws.material_req_id = cl.mat_request_id left outer join osdma.t_os_qaqc_product_code pc on ws.product_code_id = pc.productcode_id left outer join osdma.t_os_sitecode sc on ws.site_id = sc.sitecode_id left outer join osdma.t_os_master_product mp on pc.product_id = mp.product_id left outer join osdma.t_os_sitecode lsc on cl.movement_location = lsc.sitecode_id order by ws.created_date desc";

	private static final String FETCH_STOCK_IN_PRODUCT_REPORT = "SELECT pc.product_code_gen, mp.product_name, pc.storage_location, pc.created_date FROM osdma.t_os_qaqc_product_code pc left outer join osdma.t_os_master_product mp on pc.product_id = mp.product_id order by pc.created_date";

	@SuppressWarnings("unchecked")
	@Override
	public List<WarehouseProductDTO> findAllProductList() {
		List<WarehouseProductDTO> productsList = new ArrayList<>();
		List<Object[]> results = entityManager.createNativeQuery(FETCH_PRODUCT_LIST).getResultList();

		results.stream().forEach(record -> {

			WarehouseProductDTO product = new WarehouseProductDTO();
			product.setProductName(CommonUtil.checkNullValue(record[0]));
			product.setProductCode(CommonUtil.checkNullValue(record[1]));
			product.setStatus(CommonUtil.checkNullValue(record[2]));
			product.setQuantity((Integer) record[3]);

			productsList.add(product);
		});
		return productsList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<WarehouseProductDTO> findStockOutProductList() {
		List<WarehouseProductDTO> productsList = new ArrayList<>();
		List<Object[]> results = entityManager.createNativeQuery(FETCH_STOCK_OUT_PRODUCT_LIST).getResultList();

		results.stream().forEach(record -> {

			WarehouseProductDTO product = new WarehouseProductDTO();
			product.setProductName(CommonUtil.checkNullValue(record[0]));
			product.setProductCode(CommonUtil.checkNullValue(record[1]));
			product.setRequestId((Integer)record[2]);
			product.setQuantity((Integer) record[3]);
			product.setStockOutId((Integer) record[4]);
			product.setStorageLocation(CommonUtil.checkNullValue(record[5]));
			
			productsList.add(product);
		});
		return productsList;
	}

	@Override
	@Transactional
	public Boolean addStorageLocation(WarehouseProductDTO productDTO) {
		int result = entityManager.createNativeQuery(UPDATE_STORAGE_LOCATION).setParameter(1, productDTO.getStorageLocation()).setParameter(2, productDTO.getStockOutId()).executeUpdate();
		return result == 1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<WarehouseProductDTO> getAllProductReportList() {
		List<WarehouseProductDTO> productsList = new ArrayList<>();
		List<Object[]> results = entityManager.createNativeQuery(FETCH_PRODUCT_REPORT_LIST).getResultList();

		results.stream().forEach(record -> {

			WarehouseProductDTO product = new WarehouseProductDTO();
			product.setProductName(CommonUtil.checkNullValue(record[0]));
			product.setProductCode(CommonUtil.checkNullValue(record[1]));
			product.setStorageLocation(CommonUtil.checkNullValue(record[2]));
			product.setQuantity((Integer) record[3]);

			productsList.add(product);
		});
		return productsList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DwStockOutReportDTO> getAllStockOutReportList() {
		List<DwStockOutReportDTO> stockOutList = new ArrayList<>();
		List<Object[]> results = entityManager.createNativeQuery(FETCH_STOCK_OUT_REPORT_LIST).getResultList();

		results.stream().forEach(record -> {

			DwStockOutReportDTO stockOut = new DwStockOutReportDTO();
			stockOut.setProductCode(CommonUtil.checkNullValue(record[0]));
			stockOut.setProductName(CommonUtil.checkNullValue(record[1]));
			stockOut.setFromLocation(CommonUtil.checkNullValue(record[2]));
			stockOut.setToLocation(CommonUtil.checkNullValue(record[3]));
			stockOut.setOutwardDate(CommonUtil.checkNullValue(record[4]));
			stockOut.setQuantity((Integer) record[5]);

			stockOutList.add(stockOut);
		});
		return stockOutList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<WarehouseProductDTO> getAllStockInProductsReport() {
		List<WarehouseProductDTO> productsList = new ArrayList<>();
		List<Object[]> results = entityManager.createNativeQuery(FETCH_STOCK_IN_PRODUCT_REPORT).getResultList();

		results.stream().forEach(record -> {

			WarehouseProductDTO product = new WarehouseProductDTO();
			
			product.setProductCode(CommonUtil.checkNullValue(record[0]));
			product.setProductName(CommonUtil.checkNullValue(record[1]));
			product.setStorageLocation(CommonUtil.checkNullValue(record[2]));
			product.setCreatedDate(CommonUtil.checkNullValue(record[3]));

			productsList.add(product);
		});
		return productsList;
	}
}
