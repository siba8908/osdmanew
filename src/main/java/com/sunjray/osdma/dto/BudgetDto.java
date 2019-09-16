package com.sunjray.osdma.dto;

public class BudgetDto {
	private String type;
	private double budget;
	private double actualCost;
	private double remaining;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getActualCost() {
		return actualCost;
	}

	public void setActualCost(double actualCost) {
		this.actualCost = actualCost;
	}

	public double getRemaining() {
		return remaining;
	}

	public void setRemaining(double remaining) {
		this.remaining = remaining;
	}

}
