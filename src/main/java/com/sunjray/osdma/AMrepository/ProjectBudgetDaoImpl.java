package com.sunjray.osdma.AMrepository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.AMmodel.ActualCost;
import com.sunjray.osdma.AMmodel.BudgetCost;
import com.sunjray.osdma.AMmodel.ProjectBudget;
import com.sunjray.osdma.AMmodel.SiteCode;
import com.sunjray.osdma.mapper.AMSiteCodeRowMapper;
import com.sunjray.osdma.mapper.ProjActualCostMapper;
import com.sunjray.osdma.mapper.ProjectBudgetRowMapper;
import com.sunjray.osdma.mapper.QaqcItemsMapper;
import com.sunjray.osdma.qaqcModel.QaqcItem;
import com.sunjray.osdma.util.QueryConstant;

@Repository("ProjectBudgetDao")
public class ProjectBudgetDaoImpl implements ProjectBudgetDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	

	 @Override
		public List<SiteCode> findAllSiteCode() {
			return jdbcTemplate.query(QueryConstant.DISPLAY_SiteCode,new AMSiteCodeRowMapper());
		}

	@Override
	public BudgetCost findAllproj(SiteCode sitecode) {
		
		BudgetCost b= new BudgetCost();
		
			// TODO Auto-generated method stub
		List<ProjectBudget> e=jdbcTemplate.query(QueryConstant.DISPLAY_Project_Budget, new ProjectBudgetRowMapper(),sitecode.getSiteCodeId());
		List<ActualCost> a=jdbcTemplate.query(QueryConstant.Actual_cost, new ProjActualCostMapper(),sitecode.getSiteCodeId());	
		//return jdbcTemplate.query(QueryConstant.GET_EXPENCES_BY_SITECODE, new ExpenceRowMapper(),sitecode.getSiteCodeId());
		System.out.println("size::"+a.size());
		
		b.setProjBud(e.get(0));
		b.setActCost(a.get(0));
		System.out.println("ARRAY"+b);
		return b;
		
	}
}
