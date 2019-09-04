package com.sunjray.osdma.AMmodel;

import java.io.Serializable;
import java.util.Date;

public class Consinment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6303835774538040204L;
	
	
	private Integer consignment_id;
	private  Integer consingement_no;
	private String airwaybill_no;
	private String status;
	private Date exp_arrival_date;
	private Date act_arrival_date;
	private Date updated_on;
	private Integer created_by;
	private Date created_on;
	private Integer modify_by;
	private Date modify_on;
	
	
	public Integer getConsignment_id() {
		return consignment_id;
	}
	public void setConsignment_id(Integer consignment_id) {
		this.consignment_id = consignment_id;
	}
	public Integer getConsingement_no() {
		return consingement_no;
	}
	public void setConsingement_no(Integer consingement_no) {
		this.consingement_no = consingement_no;
	}
	public String getAirwaybill_no() {
		return airwaybill_no;
	}
	public void setAirwaybill_no(String airwaybill_no) {
		this.airwaybill_no = airwaybill_no;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getExp_arrival_date() {
		return exp_arrival_date;
	}
	public void setExp_arrival_date(Date exp_arrival_date) {
		this.exp_arrival_date = exp_arrival_date;
	}
	public Date getAct_arrival_date() {
		return act_arrival_date;
	}
	public void setAct_arrival_date(Date act_arrival_date) {
		this.act_arrival_date = act_arrival_date;
	}
	public Date getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}
	public Integer getCreated_by() {
		return created_by;
	}
	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public Integer getModify_by() {
		return modify_by;
	}
	public void setModify_by(Integer modify_by) {
		this.modify_by = modify_by;
	}
	public Date getModify_on() {
		return modify_on;
	}
	public void setModify_on(Date modify_on) {
		this.modify_on = modify_on;
	}
	
	
	
	
	

}
