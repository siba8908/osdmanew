package com.sunjray.osdma.AMmodel;

import java.io.Serializable;


import lombok.Data;
@Data
public class Expence implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String siteCode;
	private String stageName;
	private Double siteSurveyBudget;
	private Double civilBudget;
	private Double electricalBudget;
	private Double instalationBudget;
	private Double performanceBudget;
	private Double handovereBudget;
	private Double total;
	/* List<StageBudget> a; */
}
