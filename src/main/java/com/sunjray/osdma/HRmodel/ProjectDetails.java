package com.sunjray.osdma.HRmodel;

import lombok.Data;

@Data
public class ProjectDetails {
	private String projectName;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
