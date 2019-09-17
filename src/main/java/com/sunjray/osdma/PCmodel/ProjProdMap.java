package com.sunjray.osdma.PCmodel;
// Generated Jul 29, 2019 8:46:52 PM by Hibernate Tools 4.3.5.Final

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
 * ProjProdMap generated by hbm2java
 */
@Entity
@Table(name = "t_os_proj_prod_map", catalog = "osdma")
public class ProjProdMap implements java.io.Serializable {

	private Integer projProdMapId;
	private MasterProduct masterProduct;
	private MasterStationType masterStationType;
	private MasterWorkStage masterWorkStage;
	private Integer quantity;
	private Integer createdBy;
	private Date createdOn;
	private Integer modifyBy;
	private Date modifyOn;

	public ProjProdMap() {
	}

	public ProjProdMap(MasterProduct masterProduct, MasterStationType masterStationType,
			MasterWorkStage masterWorkStage, Integer quantity, Integer createdBy, Date createdOn, Integer modifyBy,
			Date modifyOn) {
		this.masterProduct = masterProduct;
		this.masterStationType = masterStationType;
		this.masterWorkStage = masterWorkStage;
		this.quantity = quantity;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifyBy = modifyBy;
		this.modifyOn = modifyOn;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "proj_prod_map_id", unique = true, nullable = false)
	public Integer getProjProdMapId() {
		return this.projProdMapId;
	}

	public void setProjProdMapId(Integer projProdMapId) {
		this.projProdMapId = projProdMapId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	public MasterProduct getMasterProduct() {
		return this.masterProduct;
	}

	public void setMasterProduct(MasterProduct masterProduct) {
		this.masterProduct = masterProduct;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "proj_type")
	public MasterStationType getMasterStationType() {
		return this.masterStationType;
	}

	public void setMasterStationType(MasterStationType masterStationType) {
		this.masterStationType = masterStationType;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "proj_stage")
	public MasterWorkStage getMasterWorkStage() {
		return this.masterWorkStage;
	}

	public void setMasterWorkStage(MasterWorkStage masterWorkStage) {
		this.masterWorkStage = masterWorkStage;
	}

	@Column(name = "quantity")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "created_by")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on", length = 19)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "modify_by")
	public Integer getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modify_on", length = 19)
	public Date getModifyOn() {
		return this.modifyOn;
	}

	public void setModifyOn(Date modifyOn) {
		this.modifyOn = modifyOn;
	}

}
