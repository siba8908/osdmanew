package com.sunjray.osdma.qaqcModel;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class MaterialCode implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Long materialCodeId;
	private String productId;
	private String componentId;
	private Integer itemId;
	private String createdDate;
	private String simProvider;
	private String phoneNo;
	private String imeiNo;
	private String workstatus;
	private Component component;
	private QaqcItem qaqcItem;
	
}

