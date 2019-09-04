package com.sunjray.osdma.HRmodel;



import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {

  /**
   * 
   * 
   */
  private static final long serialVersionUID = 6589129842329530954L;

  private Long              userId;
  private String            username;
  private String            pasword;
  private String            name;
  private String            sentStatus;
  private String            receivedStatus;
  private String            createdDate;
  private String            email;
  private String            status;
  private boolean           roleHR;
  private boolean           rolePC;
  private boolean           roleAM;
  private boolean           rolePM;
  private boolean           roleQA;
  private boolean           roleDW;
  private boolean           roleWB;
  private boolean           roleWA;
  private boolean           roleLOG;

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPasword() {
    return pasword;
  }

  public void setPasword(String pasword) {
    this.pasword = pasword;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSentStatus() {
    return sentStatus;
  }

  public void setSentStatus(String sentStatus) {
    this.sentStatus = sentStatus;
  }

  public String getReceivedStatus() {
    return receivedStatus;
  }

  public void setReceivedStatus(String receivedStatus) {
    this.receivedStatus = receivedStatus;
  }

  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public boolean isRoleHR() {
    return roleHR;
  }

  public void setRoleHR(boolean roleHR) {
    this.roleHR = roleHR;
  }

  public boolean isRolePC() {
    return rolePC;
  }

  public void setRolePC(boolean rolePC) {
    this.rolePC = rolePC;
  }

  public boolean isRoleAM() {
    return roleAM;
  }

  public void setRoleAM(boolean roleAM) {
    this.roleAM = roleAM;
  }

  public boolean isRoleQA() {
    return roleQA;
  }

  public void setRoleQA(boolean roleQA) {
    this.roleQA = roleQA;
  }

  public boolean isRoleDW() {
    return roleDW;
  }

  public void setRoleDW(boolean roleDW) {
    this.roleDW = roleDW;
  }

  public boolean isRoleWB() {
    return roleWB;
  }

  public void setRoleWB(boolean roleWB) {
    this.roleWB = roleWB;
  }

  public boolean isRoleWA() {
    return roleWA;
  }

  public void setRoleWA(boolean roleWA) {
    this.roleWA = roleWA;
  }

  public boolean isRoleLOG() {
    return roleLOG;
  }

  public void setRoleLOG(boolean roleLOG) {
    this.roleLOG = roleLOG;
  }

  public boolean isRolePM() {
    return rolePM;
  }

  public void setRolePM(boolean rolePM) {
    this.rolePM = rolePM;
  }
 
}
