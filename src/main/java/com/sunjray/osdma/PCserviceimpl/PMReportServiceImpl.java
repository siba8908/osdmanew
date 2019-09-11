package com.sunjray.osdma.PCserviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.PCservice.PMReportService;
import com.sunjray.osdma.PMdao.PMReportDao;
import com.sunjray.osdma.dto.BudgetDto;

@Service
public class PMReportServiceImpl implements PMReportService {

	@Autowired
	private PMReportDao pMReportDao;

	@Override
	public List<BudgetDto> fetchBudget(int filterType) {
		if (filterType == 0) {
			return pMReportDao.fetchBudgetTaskWise();
		} else if (filterType == 1) {
			return pMReportDao.fetchBudgetSiteCodeWise();
		} else {
			return pMReportDao.fetchBudgetProjectWise();
		}
	}

	@Override
	public Map<String, Integer> fetchProjetProgress(int filterType) {
		if (filterType == 0) {
			return pMReportDao.fetchProjetProgressTaskWise();
		} else if (filterType == 1) {
			return pMReportDao.fetchProjetProgressSiteCodeWise();
		} else {
			return pMReportDao.fetchProjetProgressProjectWise();
		}
	}

}
