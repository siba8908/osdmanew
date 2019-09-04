

	package com.sunjray.osdma.mapper;

	import java.sql.ResultSet;
	import java.sql.SQLException;

	import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.AMmodel.ActualCost;
import com.sunjray.osdma.AMmodel.BudgetCost;
import com.sunjray.osdma.AMmodel.ProjectBudget;


	public class ProjActualCostMapper implements RowMapper<ActualCost> {
		
		//BudgetCost b = new BudgetCost();
		ProjectBudget e = new ProjectBudget();
		ActualCost a = new ActualCost();
		
		
		/* List<StageBudget> list = new ArrayList<StageBudget>(); */

		@Override
		public ActualCost mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			
			
			  e.setSiteCode(rs.getString("site_code"));
			 
			System.out.println("Cost  "+rs.getString("stage_name"));
			String stage=rs.getString("stage_name");
			
			
			if (stage.equals("CIVIL")) {
				/* StageBudget s = new StageBudget(); */
				System.out.println("civil");
				a.setCivilActualCost(rs.getDouble("actual_cost"));
			} else if (stage.equals("SITE SURVEY")) {
				System.out.println("SiteSurvey");
				a.setSiteSurveyActualCost(rs.getDouble("actual_cost"));
			} else if (stage.equals("ELECTRICAL")) {
				System.out.println("electrical");
				a.setElectricalActualCost(rs.getDouble("actual_cost"));
			} else if (stage.equals("INSTALATION")) {
				System.out.println("InstalationBudget");
				a.setInstalationActualCost(rs.getDouble("actual_cost"));
			} else if (stage.equals("PERFORMANCE")) {
				System.out.println("PerformanceBudget");
				a.setPerformanceActualCost(rs.getDouble("actual_cost"));
			}

			else {
				System.out.println("HandovereBudget");
				a.setHandovereActualCost(rs.getDouble("actual_cost"));
			}
			//b.setActCost(a);
           //System.out.println(e);
			return a;
		}

		/*
		 * @Override public ProjectBudget mapRow(ResultSet rs, int arg1) throws
		 * SQLException { ProjectBudget pb = new ProjectBudget();
		 * pb.setSiteCode(rs.getString(1)); pb.setBudget(rs.getDouble(2));
		 * pb.setStageName(rs.getString(3));
		 * 
		 * 
		 * return pb;
		 * 
		 * }
		 */

	}

