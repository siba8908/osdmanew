package com.sunjray.osdma.HRmodel;

import lombok.Data;

@Data
public class StateDetails {
	private Integer stateId;
	
	private String presentState;

  public Integer getStateId() {
    return stateId;
  }

  public void setStateId(Integer stateId) {
    this.stateId = stateId;
  }

  public String getPresentState() {
    return presentState;
  }

  public void setPresentState(String presentState) {
    this.presentState = presentState;
  }
	

}
