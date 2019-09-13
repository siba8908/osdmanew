package com.sunjray.osdma.SMmodel;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sunjray.osdma.PCenumeration.Status;
import com.sunjray.osdma.PCmodel.MasterProduct;

/**
 * QaqcMaterialCode generated by Smruti
 */
@Entity
@Table(name = "t_os_qaqc_product_code", catalog = "osdma")
public class QaqcProductCode implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "productcode_id", unique = true, nullable = false)
	private Integer ProductCodeId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private MasterProduct masterProduct;

	@Column(name = "product_code_gen", length = 45)
	private String productCode;

	@Column(name = "created_date", length = 19)
	private Date createdDate;

	@Column(name = "sim_provider", length = 45)
	private String simProvider;

	@Column(name = "phone_no")
	private Integer phoneNo;

	@Column(name = "imei_no", length = 45)
	private String imeiNo;

	@Enumerated(EnumType.STRING)
	@Column(name = "product_status", length = 45)
	private Status productStatus;

	@Column(name = "storage_location", length = 45)
	private String storageLocation;

	public Integer getProductCodeId() {
		return ProductCodeId;
	}

	public void setProductCodeId(Integer productCodeId) {
		ProductCodeId = productCodeId;
	}

	public MasterProduct getMasterProduct() {
		return masterProduct;
	}

	public void setMasterProduct(MasterProduct masterProduct) {
		this.masterProduct = masterProduct;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getSimProvider() {
		return simProvider;
	}

	public void setSimProvider(String simProvider) {
		this.simProvider = simProvider;
	}

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getImeiNo() {
		return imeiNo;
	}

	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
	}

	public Status getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(Status productStatus) {
		this.productStatus = productStatus;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

}
