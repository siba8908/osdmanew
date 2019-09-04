package com.sunjray.osdma.AMservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.AMmodel.BudgetCost;
import com.sunjray.osdma.AMmodel.ProjectBudget;
import com.sunjray.osdma.AMmodel.SiteCode;
import com.sunjray.osdma.AMrepository.ProjectBudgetDao;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcRepository.QAQCMaterialCodDao;
import com.sunjray.osdma.qaqcservice.QAQCMaterialCodService;


	
	@Service
	public class ProjectBudgetServiceImpl  implements ProjectBudgetService {
		
		 @Autowired
		   private ProjectBudgetDao projdao;
		 
		/*
		 * @Override public List<QAQCMaterialCod> showMaterial() { // TODO
		 * Auto-generated method stub return QAQCdao.showMaterial(); }
		 */
		
		

		@Override
		public List<SiteCode> getSiteCode() {
			// TODO Auto-generated method stub
			return projdao.findAllSiteCode();
		}

		@Override
		public BudgetCost findAllproj(SiteCode sitecode) {
		
			// TODO Auto-generated method stub
			List<BudgetCost> ex=new ArrayList<BudgetCost>();
			BudgetCost e=new BudgetCost();
			e= projdao.findAllproj(sitecode);
			/*
			 * Double ins=e.getInstalationBudget(); System.out.println(ins); Double
			 * total=e.getCivilBudget()+e.getElectricalBudget()+e.getHandovereBudget()+e.
			 * getInstalationBudget()+e.getPerformanceBudget()+e.getSiteSurveyBudget();
			 * System.out.println("total"+total); e.setTotal(total);
			 */
			
			return e;
		}

}
