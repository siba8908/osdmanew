package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.AMmodel.Expence;


public class ExpenceRowMapper implements RowMapper<Expence> {
	Expence e = new Expence();
	/* List<StageBudget> list = new ArrayList<StageBudget>(); */

	@Override
	public Expence mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		
		/* e.setStageName(rs.getString("stage_name")); */
		
		  e.setSiteCode(rs.getString("site_code"));
		 
		System.out.println("Expencesa  "+rs.getString("stage_name"));
		String stage=rs.getString("stage_name");
		/*while (rs.next()) {*/
		/*
		 * System.out.println("..................."); StageBudget s=new StageBudget();
		 * s.setStageName(rs.getString("stage_name"));
		 * s.setBudget(rs.getDouble("budget")); list.add(s);
		 * System.out.println("..................."+list.size());
		 */
		/*
		 * }
		 */
		//e.setA(list);
		
		if (stage.equals("CIVIL")) {
			/* StageBudget s = new StageBudget(); */
			System.out.println("civil");
			e.setCivilBudget(rs.getDouble("budget"));
		} else if (stage.equals("SITE SURVEY")) {
			System.out.println("SiteSurvey");
			e.setSiteSurveyBudget(rs.getDouble("budget"));
		} else if (stage.equals("ELECTRICAL")) {
			System.out.println("electrical");
			e.setElectricalBudget(rs.getDouble("budget"));
		} else if (stage.equals("INSTALATION")) {
			System.out.println("InstalationBudget");
			e.setInstalationBudget(rs.getDouble("budget"));
		} else if (stage.equals("PERFORMANCE")) {
			System.out.println("PerformanceBudget");
			e.setPerformanceBudget(rs.getDouble("budget"));
		}

		else {
			System.out.println("HandovereBudget");
			e.setHandovereBudget(rs.getDouble("budget"));
		}

		return e;
	}

}
