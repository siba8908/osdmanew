package com.sunjray.osdma.SMdaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sunjray.osdma.SMdao.WarehouseAReportDao;
import com.sunjray.osdma.dto.ConsignmentMaterialDTO;
import com.sunjray.osdma.dto.WarehouseProductDTO;
import com.sunjray.osdma.util.CommonUtil;

@Repository
public class WarehouseAReportDaoImpl implements WarehouseAReportDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	private static final String FETCH_MATERIALS_LIST = "select ct.consingement_no, mm.master_material_name, cm.part_no, cm.quantity,sc.site_name  from osdma.t_os_am_consignment_materiallist cm left outer join osdma.t_os_master_materials mm on cm.material_type_id = mm.master_material_id left outer join osdma.t_os_am_consingement_track_c2p ct on cm.consignment_id = ct.consignment_id left outer join osdma.t_os_am_consignment_logistic cl on cm.consignment_id = cl.consignment_id left outer join osdma.t_os_sitecode sc on cl.movement_location = sc.sitecode_id order by cm.material_id desc";

	private static final String FETCH_STOCK_OUT_PRODUCT_REPORT = "SELECT pc.product_code_gen, mp.product_name, pc.storage_location, pc.created_date FROM osdma.t_os_qaqc_product_code pc left outer join osdma.t_os_master_product mp on pc.product_id = mp.product_id order by pc.created_date";

	@SuppressWarnings("unchecked")
	@Override
	public List<ConsignmentMaterialDTO> fetchAllMaterialsReport() {
		List<ConsignmentMaterialDTO> materialsList = new ArrayList<>();
		List<Object[]> results = entityManager.createNativeQuery(FETCH_MATERIALS_LIST).getResultList();

		results.stream().forEach(record -> {

			ConsignmentMaterialDTO material = new ConsignmentMaterialDTO();
			material.setConsignmentNo(CommonUtil.checkNullValue(record[0]));
			material.setMaterialName(CommonUtil.checkNullValue(record[1]));
			material.setPartNo(CommonUtil.checkNullValue(record[2]));
			material.setQuantity((Integer) record[3]);
			material.setLocation(CommonUtil.checkNullValue(record[4]));
			
			materialsList.add(material);
		});
		return materialsList;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<WarehouseProductDTO> fetchAllStockOutProductsReport() {
		List<WarehouseProductDTO> productsList = new ArrayList<>();
		List<Object[]> results = entityManager.createNativeQuery(FETCH_STOCK_OUT_PRODUCT_REPORT).getResultList();

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
