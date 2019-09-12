package com.sunjray.osdma.PMdaoImpl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sunjray.osdma.PMdao.PMReportDao;
import com.sunjray.osdma.dto.BudgetDto;
import com.sunjray.osdma.dto.ProjectStatusDto;
import com.sunjray.osdma.util.CommonUtil;

@Repository
public class PMReportDaoImpl implements PMReportDao {

	@PersistenceContext
	private EntityManager entityManager;

	private static final String FETCH_BUDGET_SITECODE_WISE_QUERY = "select site_code,ifnull((budget),0) as budget,ifnull(sum(actual_cost),0) as actualCost,(ifnull(sum(budget),0)-ifnull(sum(actual_cost),0)) as remaining from osdma.t_os_pm_team_task_map pttm,osdma.t_os_sitecode sc where pttm.sitecode_id=sc.sitecode_id and pttm.sitecode_id=";
	private static final String FETCH_BUDGET_TASK_WISE_QUERY = "select mt.task_name,ifnull((budget),0) as budget,ifnull(sum(actual_cost),0) as actualCost,(ifnull(sum(budget),0)-ifnull(sum(actual_cost),0)) as remaining from osdma.t_os_pm_team_task_map pttm,osdma.t_os_master_task mt where pttm.task_id=mt.task_id and pttm.task_id=";
	private static final String FETCH_BUDGET_PROJECT_WISE_QUERY = "select p.project_name,ifnull((budget),0) as budget,ifnull(sum(actual_cost),0) as actualCost,(ifnull(sum(budget),0)-ifnull(sum(actual_cost),0)) as remaining from osdma.t_os_pm_team_task_map pttm,osdma.t_os_project p where pttm.project_id=p.project_id and pttm.project_id=";
	private static final String FETCH_PROJECT_STATUS_SITECODE_WISE_QUERY = "select site_code,ifnull((budget),0) as budget,ifnull(sum(actual_cost),0) as actualCost,(ifnull(sum(budget),0)-ifnull(sum(actual_cost),0)) as remaining from osdma.t_os_pm_team_task_map pttm,osdma.t_os_sitecode sc where pttm.sitecode_id=sc.sitecode_id and pttm.sitecode_id=";
	private static final String FETCH_PROJECT_STATUS_TASK_WISE_QUERY = "select mt.task_name,ifnull((budget),0) as budget,ifnull(sum(actual_cost),0) as actualCost,(ifnull(sum(budget),0)-ifnull(sum(actual_cost),0)) as remaining from osdma.t_os_pm_team_task_map pttm,osdma.t_os_master_task mt where pttm.task_id=mt.task_id and pttm.task_id=";
	private static final String FETCH_PROJECT_STATUS_PROJECT_WISE_QUERY = "select p.project_name,ifnull((budget),0) as budget,ifnull(sum(actual_cost),0) as actualCost,(ifnull(sum(budget),0)-ifnull(sum(actual_cost),0)) as remaining from osdma.t_os_pm_team_task_map pttm,osdma.t_os_project p where pttm.project_id=p.project_id and pttm.project_id=";

	@SuppressWarnings("unchecked")
	@Override
	public List<BudgetDto> fetchBudgetBySiteCode(int sitecode) {
		List<Object[]> results = entityManager.createNativeQuery(FETCH_BUDGET_SITECODE_WISE_QUERY + sitecode)
				.getResultList();
		return setBudgetData(results);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BudgetDto> fetchBudgetByTask(int task) {
		List<Object[]> results = entityManager.createNativeQuery(FETCH_BUDGET_TASK_WISE_QUERY + task).getResultList();
		return setBudgetData(results);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BudgetDto> fetchBudgetByProject(int project) {
		List<Object[]> results = entityManager.createNativeQuery(FETCH_BUDGET_PROJECT_WISE_QUERY + project)
				.getResultList();
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

	@SuppressWarnings("unchecked")
	@Override
	public ProjectStatusDto fetchProjetStatusBySiteCode(int sitecode) {
		List<Object[]> results = entityManager.createNativeQuery(
				"SELECT (SELECT count(*) FROM osdma.t_os_pm_team_task_map where sitecode_id=" + sitecode
						+ " and task_status='COMPLETE')A,(SELECT count(*) FROM osdma.t_os_pm_team_task_map where sitecode_id="
						+ sitecode
						+ " and task_status='INPROGRESS')B,(SELECT count(*) FROM osdma.t_os_pm_team_task_map where sitecode_id="
						+ sitecode
						+ " and task_status='NOTSTARTED')C from osdma.t_os_pm_team_task_map where sitecode_id="
						+ sitecode + "")
				.getResultList();
		return setProjectStatusData(results);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ProjectStatusDto fetchProjetStatusByTask(int task) {
		List<Object[]> results = entityManager
				.createNativeQuery("SELECT (SELECT count(*) FROM osdma.t_os_pm_team_task_map where task_id=" + task
						+ " and task_status='COMPLETE')A,(SELECT count(*) FROM osdma.t_os_pm_team_task_map where task_id="
						+ task
						+ " and task_status='INPROGRESS')B,(SELECT count(*) FROM osdma.t_os_pm_team_task_map where task_id="
						+ task + " and task_status='NOTSTARTED')C from osdma.t_os_pm_team_task_map where task_id="
						+ task + "")
				.getResultList();
		return setProjectStatusData(results);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ProjectStatusDto fetchProjetStatusByProject(int project) {
		List<Object[]> results = entityManager.createNativeQuery(
				"SELECT (SELECT count(*) FROM osdma.t_os_pm_team_task_map where project_id=" + project
						+ " and task_status='COMPLETE')A,(SELECT count(*) FROM osdma.t_os_pm_team_task_map where project_id="
						+ project
						+ " and task_status='INPROGRESS')B,(SELECT count(*) FROM osdma.t_os_pm_team_task_map where project_id="
						+ project + " and task_status='NOTSTARTED')C from osdma.t_os_pm_team_task_map where project_id="
						+ project + "")
				.getResultList();
		return setProjectStatusData(results);
	}

	private ProjectStatusDto setProjectStatusData(List<Object[]> results) {
		ProjectStatusDto projectStatusDto = new ProjectStatusDto();
		projectStatusDto.setOnTrack(((BigInteger) results.get(0)[0]).intValue());
		projectStatusDto.setConcern(((BigInteger) results.get(0)[1]).intValue());
		projectStatusDto.setDelayed(((BigInteger) results.get(0)[2]).intValue());
		return projectStatusDto;
	}
}
