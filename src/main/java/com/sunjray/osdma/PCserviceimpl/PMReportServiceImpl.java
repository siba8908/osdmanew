package com.sunjray.osdma.PCserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.PCservice.PMReportService;
import com.sunjray.osdma.PMdao.PMReportDao;
import com.sunjray.osdma.dto.BudgetDto;
import com.sunjray.osdma.dto.ProjectStatusDto;

@Service
public class PMReportServiceImpl implements PMReportService {

	@Autowired
	private PMReportDao pMReportDao;

	@Override
	public List<BudgetDto> fetchBudgetBySiteCode(int sitecode) {
		return pMReportDao.fetchBudgetBySiteCode(sitecode);
	}

	@Override
	public List<BudgetDto> fetchBudgetByTask(int task) {
		return pMReportDao.fetchBudgetByTask(task);
	}

	@Override
	public List<BudgetDto> fetchBudgetByProject(int project) {
		return pMReportDao.fetchBudgetByProject(project);
	}

	@Override
	public ProjectStatusDto fetchProjetStatusBySiteCode(int sitecode) {
		return pMReportDao.fetchProjetStatusBySiteCode(sitecode);
	}

	@Override
	public ProjectStatusDto fetchProjetStatusByTask(int task) {
		return pMReportDao.fetchProjetStatusByTask(task);
	}

	@Override
	public ProjectStatusDto fetchProjetStatusByProject(int project) {
		return pMReportDao.fetchProjetStatusByProject(project);
	}

}
