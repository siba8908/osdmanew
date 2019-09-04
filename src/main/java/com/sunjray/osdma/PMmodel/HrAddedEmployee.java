package com.sunjray.osdma.PMmodel;

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

/**
 * HrAddedEmployee generated by Smruti
 */
@Entity
@Table(name = "t_os_hr_emp_add_employee", catalog = "osdma")
public class HrAddedEmployee implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "add_emp_id", unique = true, nullable = false)
	private Long addEmpId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "designation_id")
	private MasterDesignation designation;
	
	@Column(name = "salary", precision = 10)
	private Float salary;
	
	@Column(name = "department_id")
	private Integer departmentId;
	
	@Column(name = "joining_date", length = 19)
	private Date joiningDate;
	
	@Column(name = "created_date", length = 19)
	private Date createdDate;
	
	@Column(name = "employee_code", length = 100)
	private String employeeCode;
	
	@Column(name = "employee_id")
	private Long employeeId;

	public Long getAddEmpId() {
		return addEmpId;
	}

	public void setAddEmpId(Long addEmpId) {
		this.addEmpId = addEmpId;
	}

	public MasterDesignation getDesignation() {
		return designation;
	}

	public void setDesignation(MasterDesignation designation) {
		this.designation = designation;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	

}
