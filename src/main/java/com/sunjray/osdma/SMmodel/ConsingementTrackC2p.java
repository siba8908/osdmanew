package com.sunjray.osdma.SMmodel;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TOsAmConsingementTrackC2p generated by smruti
 */
@Entity
@Table(name = "t_os_am_consingement_track_c2p", catalog = "osdma")
public class ConsingementTrackC2p implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long consignmentId;
	private Long consingementNo;
	private String airwaybillNo;
	private String status;
	private Date expArrivalDate;
	private Date actArrivalDate;
	private Date updatedOn;
	private Long createdBy;
	private Date createdOn;
	private Long modifyBy;
	private Date modifyOn;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "consignment_id", unique = true, nullable = false)
	public Long getConsignmentId() {
		return this.consignmentId;
	}

	public void setConsignmentId(Long consignmentId) {
		this.consignmentId = consignmentId;
	}

	@Column(name = "consingement_no")
	public Long getConsingementNo() {
		return this.consingementNo;
	}

	public void setConsingementNo(Long consingementNo) {
		this.consingementNo = consingementNo;
	}

	@Column(name = "airwaybill_no", length = 45)
	public String getAirwaybillNo() {
		return this.airwaybillNo;
	}

	public void setAirwaybillNo(String airwaybillNo) {
		this.airwaybillNo = airwaybillNo;
	}

	@Column(name = "status", length = 11)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "exp_arrival_date", length = 19)
	public Date getExpArrivalDate() {
		return this.expArrivalDate;
	}

	public void setExpArrivalDate(Date expArrivalDate) {
		this.expArrivalDate = expArrivalDate;
	}

	@Column(name = "act_arrival_date", length = 19)
	public Date getActArrivalDate() {
		return this.actArrivalDate;
	}

	public void setActArrivalDate(Date actArrivalDate) {
		this.actArrivalDate = actArrivalDate;
	}

	@Column(name = "updated_on", length = 19)
	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Column(name = "created_by")
	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "created_on", length = 19)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "modify_by")
	public Long getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Long modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "modify_on", length = 19)
	public Date getModifyOn() {
		return this.modifyOn;
	}

	public void setModifyOn(Date modifyOn) {
		this.modifyOn = modifyOn;
	}

}