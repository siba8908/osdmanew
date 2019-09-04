package com.sunjray.osdma.AMrepository;

import java.util.List;

import com.sunjray.osdma.AMmodel.BudgetCost;
import com.sunjray.osdma.AMmodel.ProjectBudget;
import com.sunjray.osdma.AMmodel.SiteCode;

public interface ProjectBudgetDao {

	BudgetCost findAllproj(SiteCode sitecode);

	List<SiteCode> findAllSiteCode();


}
