package com.sunjray.osdma.PMmodel;
// Generated Aug 15, 2019 11:10:19 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TOsMasterDesignation generated by hbm2java
 */
@Entity
@Table(name = "t_os_master_designation", catalog = "osdma")
public class MasterDesignation implements java.io.Serializable {

	private Integer designationId;
	private String designation;

	public MasterDesignation() {
	}

	public MasterDesignation(String designation) {
		this.designation = designation;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "designation_id", unique = true, nullable = false)
	public Integer getDesignationId() {
		return this.designationId;
	}

	public void setDesignationId(Integer designationId) {
		this.designationId = designationId;
	}

	@Column(name = "designation", length = 45)
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}

