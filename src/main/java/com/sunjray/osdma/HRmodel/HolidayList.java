package com.sunjray.osdma.HRmodel;

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
import java.util.Date;
import java.util.Set;

import lombok.Data;
@Data
public class HolidayList implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Long id;
	private String holiday_date;
	private String holiday_day;
	private String 	holiday_events;
	private String holiday_doc;
	private String created_date;
	

}

