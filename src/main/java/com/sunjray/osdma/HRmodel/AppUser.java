package com.sunjray.osdma.HRmodel;



import java.io.Serializable;

import lombok.Data;

@Data
public class AppUser implements Serializable {

  /**
   * 
   * 
   */
  private static final long serialVersionUID = 6589129842329530954L;

  private Long              user_id;
  private String            username;
  private String            password;
  private String            name;
  private String            sent_status;
  private String            received_status;
  private String            created_date;
  private String            email;
  private String            status;

  public Long getUser_id() {
    return user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSent_status() {
    return sent_status;
  }

  public void setSent_status(String sent_status) {
    this.sent_status = sent_status;
  }

  public String getReceived_status() {
    return received_status;
  }

  public void setReceived_status(String received_status) {
    this.received_status = received_status;
  }

  public String getCreated_date() {
    return created_date;
  }

  public void setCreated_date(String created_date) {
    this.created_date = created_date;
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



}
