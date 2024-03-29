package com.sunjray.osdma.SMwarehouseAModel;
// Generated Aug 15, 2019 11:10:19 AM by Hibernate Tools 4.3.5.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TOsAmConsignmentLogistic generated by hbm2java
 */
@Entity
@Table(name = "t_os_am_consignment_logistic", catalog = "osdma")
public class AmConsignmentLogistic implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer logAsignmentId;
	private AmConsingementTrackC2p TOsAmConsingementTrackC2p;
	private SerProPersonalDtls TOsSerProPersonalDtls;
	private String vechileNo;
	private String lrNo;
	private String ewayBilNo;
	private Date expArrival;
	private String status;
	private Date actualArrival;
	private Date updatedOn;
	private Date createdOn;
	private String createdBy;

	public AmConsignmentLogistic() {
	}

	public AmConsignmentLogistic(AmConsingementTrackC2p TOsAmConsingementTrackC2p,
			SerProPersonalDtls TOsSerProPersonalDtls, String vechileNo, String lrNo, String ewayBilNo, Date expArrival,
			String status, Date actualArrival, Date updatedOn, Date createdOn, String createdBy) {
		this.TOsAmConsingementTrackC2p = TOsAmConsingementTrackC2p;
		this.TOsSerProPersonalDtls = TOsSerProPersonalDtls;
		this.vechileNo = vechileNo;
		this.lrNo = lrNo;
		this.ewayBilNo = ewayBilNo;
		this.expArrival = expArrival;
		this.status = status;
		this.actualArrival = actualArrival;
		this.updatedOn = updatedOn;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "log_asignment_id", unique = true, nullable = false)
	public Integer getLogAsignmentId() {
		return this.logAsignmentId;
	}

	public void setLogAsignmentId(Integer logAsignmentId) {
		this.logAsignmentId = logAsignmentId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "consignment_id")
	public AmConsingementTrackC2p getTOsAmConsingementTrackC2p() {
		return this.TOsAmConsingementTrackC2p;
	}

	public void setTOsAmConsingementTrackC2p(AmConsingementTrackC2p TOsAmConsingementTrackC2p) {
		this.TOsAmConsingementTrackC2p = TOsAmConsingementTrackC2p;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "logistic_id")
	public SerProPersonalDtls getTOsSerProPersonalDtls() {
		return this.TOsSerProPersonalDtls;
	}

	public void setTOsSerProPersonalDtls(SerProPersonalDtls TOsSerProPersonalDtls) {
		this.TOsSerProPersonalDtls = TOsSerProPersonalDtls;
	}

	@Column(name = "vechile_no", length = 45)
	public String getVechileNo() {
		return this.vechileNo;
	}

	public void setVechileNo(String vechileNo) {
		this.vechileNo = vechileNo;
	}

	@Column(name = "lr_no", length = 45)
	public String getLrNo() {
		return this.lrNo;
	}

	public void setLrNo(String lrNo) {
		this.lrNo = lrNo;
	}

	@Column(name = "eway_bil_no", length = 45)
	public String getEwayBilNo() {
		return this.ewayBilNo;
	}

	public void setEwayBilNo(String ewayBilNo) {
		this.ewayBilNo = ewayBilNo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "exp_arrival", length = 19)
	public Date getExpArrival() {
		return this.expArrival;
	}

	public void setExpArrival(Date expArrival) {
		this.expArrival = expArrival;
	}

	@Column(name = "status", length = 10)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "actual_arrival", length = 19)
	public Date getActualArrival() {
		return this.actualArrival;
	}

	public void setActualArrival(Date actualArrival) {
		this.actualArrival = actualArrival;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_on", length = 19)
	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on", length = 19)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "created_by", length = 45)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
