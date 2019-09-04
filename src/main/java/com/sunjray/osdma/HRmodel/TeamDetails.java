package com.sunjray.osdma.HRmodel;

import lombok.Data;

@Data
public class TeamDetails {
	private String teamName;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}
