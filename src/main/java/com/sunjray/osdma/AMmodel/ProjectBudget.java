package com.sunjray.osdma.AMmodel;
	
import java.io.Serializable;


import lombok.Data;

@Data
public class ProjectBudget implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	private ActualCost actCost;
	private String siteCode;
	private String stageName;
	private Double siteSurveyBudget;
	private Double civilBudget;
	private Double electricalBudget;
	private Double instalationBudget;
	private Double performanceBudget;
	private Double handovereBudget;
	private Double total;
	private int SiteCodeId; 
	private Double Budget; 
	
	}


