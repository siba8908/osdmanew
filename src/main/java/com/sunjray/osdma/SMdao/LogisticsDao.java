package com.sunjray.osdma.SMdao;

import java.util.List;

import com.sunjray.osdma.dto.ConsignmentLogisticDTO;
import com.sunjray.osdma.dto.LogisticsReportDTO;

public interface LogisticsDao {

	List<ConsignmentLogisticDTO> findConsignmentLogisticStatus();

	List<ConsignmentLogisticDTO> findConsignmentTrackDetails();

	List<ConsignmentLogisticDTO> findConsignmentDashboardDetails();

	List<LogisticsReportDTO> getAllInTransitSummaryDetails();

}
