package com.sunjray.osdma.SMdaoImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sunjray.osdma.SMdao.LogisticsDao;
import com.sunjray.osdma.dto.ConsignmentLogisticDTO;
import com.sunjray.osdma.util.CommonUtil;

@Repository
public class LogisticsDaoImpl implements LogisticsDao {

	@PersistenceContext
	private EntityManager entityManager;

	private static final String FETCH_LOGISTICS_STATUS_LIST = "SELECT cl.consignment_id, ct.consingement_no, cl.vechile_no, cl.lr_no, cl.eway_bil_no, cl.status ,cl.pickup_date  FROM osdma.t_os_am_consignment_logistic cl left outer join osdma.t_os_am_consingement_track_c2p ct on cl.consignment_id = ct.consignment_id order by cl.consignment_id desc";

	private static final String FETCH_LOGISTICS_DASHBOARD_DETAILS_LIST = "SELECT cl.consignment_id, ct.consingement_no, group_concat(cm.item_name) as item_name , sum(ifnull(cm.quantity,0)) as quantity , cl.status  FROM osdma.t_os_am_consignment_logistic cl left outer join osdma.t_os_am_consingement_track_c2p ct on cl.consignment_id = ct.consignment_id left outer join osdma.t_os_am_consignment_materiallist cm on ct.consignment_id = cm.consinment_id group by cl.consignment_id order by cl.consignment_id desc";

	private static final String FETCH_LOGISTICS_TRACK_DETAILS_LIST = "SELECT cl.consignment_id, ct.consingement_no, group_concat(cm.item_name) as item_name , sum(ifnull(cm.quantity,0)) as quantity , cl.status, cl.vechile_no, cl.lr_no, cl.eway_bil_no,cl.exp_arrival, cl.actual_arrival FROM osdma.t_os_am_consignment_logistic cl left outer join osdma.t_os_am_consingement_track_c2p ct on cl.consignment_id = ct.consignment_id left outer join osdma.t_os_am_consignment_materiallist cm on ct.consignment_id = cm.consinment_id group by cl.consignment_id order by cl.consignment_id desc";

	@SuppressWarnings("unchecked")
	@Override
	public List<ConsignmentLogisticDTO> findConsignmentLogisticStatus() {
		List<ConsignmentLogisticDTO> consignmentLogisticList = new ArrayList<>();
		List<Object[]> results = entityManager.createNativeQuery(FETCH_LOGISTICS_STATUS_LIST).getResultList();

		results.stream().forEach(record -> {

			ConsignmentLogisticDTO consignmentLogistic = new ConsignmentLogisticDTO();
			consignmentLogistic.setConsignmentId((Integer) record[0]);
			consignmentLogistic.setConsignmentNo((Integer) record[1]);
			consignmentLogistic.setVechileNo(CommonUtil.checkNullValue(record[2]));
			consignmentLogistic.setLrNo(CommonUtil.checkNullValue(record[3]));
			consignmentLogistic.setEwayBilNo(CommonUtil.checkNullValue(record[4]));
			consignmentLogistic.setStatus(CommonUtil.checkNullValue(record[5]));
			consignmentLogistic.setPickupDate(CommonUtil.convertToDD_MM_YYYY(record[6]));

			consignmentLogisticList.add(consignmentLogistic);
		});
		return consignmentLogisticList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ConsignmentLogisticDTO> findConsignmentTrackDetails() {
		List<ConsignmentLogisticDTO> consignmentLogisticList = new ArrayList<>();
		List<Object[]> results = entityManager.createNativeQuery(FETCH_LOGISTICS_TRACK_DETAILS_LIST).getResultList();

		results.stream().forEach(record -> {

			ConsignmentLogisticDTO consignmentLogistic = new ConsignmentLogisticDTO();
			consignmentLogistic.setConsignmentId((Integer) record[0]);
			consignmentLogistic.setConsignmentNo((Integer) record[1]);
			consignmentLogistic.setItemNames(CommonUtil.checkNullValue(record[2]));
			consignmentLogistic.setQuantity(((BigDecimal) record[3]).intValue());
			consignmentLogistic.setStatus(CommonUtil.checkNullValue(record[4]));
			consignmentLogistic.setVechileNo(CommonUtil.checkNullValue(record[5]));
			consignmentLogistic.setLrNo(CommonUtil.checkNullValue(record[6]));
			consignmentLogistic.setEwayBilNo(CommonUtil.checkNullValue(record[7]));
			consignmentLogistic.setExpArrival(CommonUtil.convertToDD_MM_YYYY(record[8]));
			consignmentLogistic.setActualArrival(CommonUtil.convertToDD_MM_YYYY(record[9]));

			consignmentLogisticList.add(consignmentLogistic);
		});
		return consignmentLogisticList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ConsignmentLogisticDTO> findConsignmentDashboardDetails() {
		List<ConsignmentLogisticDTO> consignmentLogisticList = new ArrayList<>();
		List<Object[]> results = entityManager.createNativeQuery(FETCH_LOGISTICS_DASHBOARD_DETAILS_LIST)
				.getResultList();

		results.stream().forEach(record -> {

			ConsignmentLogisticDTO consignmentLogistic = new ConsignmentLogisticDTO();
			consignmentLogistic.setConsignmentId((Integer) record[0]);
			consignmentLogistic.setConsignmentNo((Integer) record[1]);
			consignmentLogistic.setItemNames(CommonUtil.checkNullValue(record[2]));
			consignmentLogistic.setQuantity(((BigDecimal) record[3]).intValue());
			consignmentLogistic.setStatus(CommonUtil.checkNullValue(record[4]));

			consignmentLogisticList.add(consignmentLogistic);
		});
		return consignmentLogisticList;
	}

}
