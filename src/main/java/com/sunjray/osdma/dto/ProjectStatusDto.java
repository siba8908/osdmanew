package com.sunjray.osdma.dto;

public class ProjectStatusDto {
	private int onTrack;
	private int concern;
	private int delayed;

	public int getOnTrack() {
		return onTrack;
	}

	public void setOnTrack(int onTrack) {
		this.onTrack = onTrack;
	}

	public int getConcern() {
		return concern;
	}

	public void setConcern(int concern) {
		this.concern = concern;
	}

	public int getDelayed() {
		return delayed;
	}

	public void setDelayed(int delayed) {
		this.delayed = delayed;
	}

}
