package com.sunjray.osdma.SMserviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunjray.osdma.SMdao.LogisticsDao;
import com.sunjray.osdma.SMrepository.ConsignmentLogisticRepository;
import com.sunjray.osdma.SMservice.LogisticsService;
import com.sunjray.osdma.dto.ConsignmentLogisticDTO;
import com.sunjray.osdma.dto.LogisticsReportDTO;

@Service
public class LogisticsServiceImpl implements LogisticsService {
	
	@Resource
	ConsignmentLogisticRepository consignmentLogisticRepository;
	
	@Resource
	LogisticsDao  logisticsDao;

	@Override
	public List<ConsignmentLogisticDTO> findConsignmentLogisticStatus() {
		return logisticsDao.findConsignmentLogisticStatus();
	}

	@Override
	public List<ConsignmentLogisticDTO> findConsignmentTrackDetails() {
		return logisticsDao.findConsignmentTrackDetails();
	}

	@Override
	public List<ConsignmentLogisticDTO> findConsignmentDashboardDetails() {
		return logisticsDao.findConsignmentDashboardDetails();
	}

	@Override
	public List<LogisticsReportDTO> getAllInTransitSummaryDetails() {
		return logisticsDao.getAllInTransitSummaryDetails();
	}

}
