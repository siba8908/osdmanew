package com.sunjray.osdma.AMservice;

import java.util.List;

import com.sunjray.osdma.AMmodel.BudgetCost;
import com.sunjray.osdma.AMmodel.ProjectBudget;
import com.sunjray.osdma.AMmodel.SiteCode;
import com.sunjray.osdma.qaqcModel.MaterialCode;

public interface ProjectBudgetService {

	

	List<SiteCode> getSiteCode();

	BudgetCost findAllproj(SiteCode sitecode);

}
