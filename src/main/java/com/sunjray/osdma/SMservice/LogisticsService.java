package com.sunjray.osdma.SMservice;

import java.util.List;

import com.sunjray.osdma.dto.ConsignmentLogisticDTO;

public interface LogisticsService {

	List<ConsignmentLogisticDTO> findConsignmentLogisticStatus();

	List<ConsignmentLogisticDTO> findConsignmentTrackDetails();

	List<ConsignmentLogisticDTO> findConsignmentDashboardDetails();

}
