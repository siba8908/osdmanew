package com.sunjray.osdma.PMdaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sunjray.osdma.PMdao.PMReportDao;
import com.sunjray.osdma.dto.BudgetDto;
import com.sunjray.osdma.util.CommonUtil;

@Repository
public class PMReportDaoImpl implements PMReportDao {

	@PersistenceContext
	private EntityManager entityManager;

	private static final String FETCH_BUDGET_SITECODE_WISE_QUERY = "select site_code,ifnull((budget),0) as budget,ifnull(sum(actual_cost),0) as actualCost,(ifnull(sum(budget),0)-ifnull(sum(actual_cost),0)) as remaining from osdma.t_os_pm_team_task_map pttm,osdma.t_os_sitecode sc where pttm.sitecode_id=sc.sitecode_id group by pttm.sitecode_id";
	private static final String FETCH_BUDGET_TASK_WISE_QUERY = "select mt.task_name,ifnull((budget),0) as budget,ifnull(sum(actual_cost),0) as actualCost,(ifnull(sum(budget),0)-ifnull(sum(actual_cost),0)) as remaining from osdma.t_os_pm_team_task_map pttm,osdma.t_os_master_task mt where pttm.task_id=mt.task_id group by pttm.task_id";
	private static final String FETCH_BUDGET_PROJECT_WISE_QUERY = "select p.project_name,ifnull((budget),0) as budget,ifnull(sum(actual_cost),0) as actualCost,(ifnull(sum(budget),0)-ifnull(sum(actual_cost),0)) as remaining from osdma.t_os_pm_team_task_map pttm,osdma.t_os_project p where pttm.project_id=p.project_id group by pttm.project_id";

	@SuppressWarnings("unchecked")
	@Override
	public List<BudgetDto> fetchBudgetTaskWise() {
		List<Object[]> results = entityManager.createNativeQuery(FETCH_BUDGET_TASK_WISE_QUERY).getResultList();
		return setBudgetData(results);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BudgetDto> fetchBudgetSiteCodeWise() {
		List<Object[]> results = entityManager.createNativeQuery(FETCH_BUDGET_SITECODE_WISE_QUERY).getResultList();
		return setBudgetData(results);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BudgetDto> fetchBudgetProjectWise() {
		List<Object[]> results = entityManager.createNativeQuery(FETCH_BUDGET_PROJECT_WISE_QUERY).getResultList();
		return setBudgetData(results);
	}

	private List<BudgetDto> setBudgetData(List<Object[]> results) {
		List<BudgetDto> budgetList = new ArrayList<>();
		results.stream().forEach(record -> {
			BudgetDto budgetDto = new BudgetDto();
			budgetDto.setType(CommonUtil.checkNullValue(record[0]));
			budgetDto.setBudget((Double) record[1]);
			budgetDto.setActualCost((Double) record[2]);
			budgetDto.setRemaining((Double) record[3]);
			budgetList.add(budgetDto);
		});
		return budgetList;
	}

	@Override
	public Map<String, Integer> fetchProjetProgressTaskWise() {
		return null;
	}

	@Override
	public Map<String, Integer> fetchProjetProgressSiteCodeWise() {
		return null;
	}

	@Override
	public Map<String, Integer> fetchProjetProgressProjectWise() {
		return null;
	}

}
