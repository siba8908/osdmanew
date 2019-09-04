package com.sunjray.osdma.AMmodel;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data

public class BudgetCost implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private ActualCost actCost;
	private ProjectBudget projBud;
	
}
