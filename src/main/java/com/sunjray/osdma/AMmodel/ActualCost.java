
	
	package com.sunjray.osdma.AMmodel;
	
	import java.io.Serializable;

	import lombok.Data;

	@Data
	public class ActualCost implements Serializable  {
		
		private static final long serialVersionUID = 1L;
		private String siteCode;
		private int SiteCodeId;  
		private Double siteSurveyActualCost;
		private Double civilActualCost;
		private Double electricalActualCost;
		private Double instalationActualCost;
		private Double performanceActualCost;
		private Double handovereActualCost;
		private Double ActualCost; 
		
		}





