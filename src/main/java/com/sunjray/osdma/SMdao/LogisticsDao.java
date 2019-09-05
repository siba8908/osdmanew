package com.sunjray.osdma.SMdao;

import java.util.List;

import com.sunjray.osdma.dto.ConsignmentLogisticDTO;

public interface LogisticsDao {

	List<ConsignmentLogisticDTO> findConsignmentLogisticStatus();

	List<ConsignmentLogisticDTO> findConsignmentTrackDetails();

	List<ConsignmentLogisticDTO> findConsignmentDashboardDetails();

}
