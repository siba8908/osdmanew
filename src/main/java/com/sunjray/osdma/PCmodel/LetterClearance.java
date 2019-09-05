package com.sunjray.osdma.PCmodel;

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
 * PcLetterClearance generated by Smruti
 */
@Entity
@Table(name = "t_os_pc_letter_clearance", catalog = "osdma")
public class LetterClearance implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "letter_clearance_id", unique = true, nullable = false)
	private Long letterClearanceId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "letter_type",  referencedColumnName = "letter_type_id")
	private LetterTypeMaster letterType;

	@ManyToOne
	@JoinColumn(name = "site_code", referencedColumnName = "sitecode_id")
	private Sitecode siteCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "submission_date", length = 19)
	private Date submissionDate;

	@Column(name = "letter_doc", length = 45)
	private String letterDoc;

	public LetterClearance() {
	}

	public Long getLetterClearanceId() {
		return letterClearanceId;
	}

	public void setLetterClearanceId(Long letterClearanceId) {
		this.letterClearanceId = letterClearanceId;
	}

	public LetterTypeMaster getLetterType() {
		return letterType;
	}

	public void setLetterType(LetterTypeMaster letterType) {
		this.letterType = letterType;
	}

	public Sitecode getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(Sitecode siteCode) {
		this.siteCode = siteCode;
	}

	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getLetterDoc() {
		return letterDoc;
	}

	public void setLetterDoc(String letterDoc) {
		this.letterDoc = letterDoc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((letterClearanceId == null) ? 0 : letterClearanceId.hashCode());
		result = prime * result + ((letterDoc == null) ? 0 : letterDoc.hashCode());
		result = prime * result + ((letterType == null) ? 0 : letterType.hashCode());
		result = prime * result + ((siteCode == null) ? 0 : siteCode.hashCode());
		result = prime * result + ((submissionDate == null) ? 0 : submissionDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LetterClearance other = (LetterClearance) obj;
		if (letterClearanceId == null) {
			if (other.letterClearanceId != null)
				return false;
		} else if (!letterClearanceId.equals(other.letterClearanceId))
			return false;
		if (letterDoc == null) {
			if (other.letterDoc != null)
				return false;
		} else if (!letterDoc.equals(other.letterDoc))
			return false;
		if (letterType == null) {
			if (other.letterType != null)
				return false;
		} else if (!letterType.equals(other.letterType))
			return false;
		if (siteCode == null) {
			if (other.siteCode != null)
				return false;
		} else if (!siteCode.equals(other.siteCode))
			return false;
		if (submissionDate == null) {
			if (other.submissionDate != null)
				return false;
		} else if (!submissionDate.equals(other.submissionDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LetterClearance [letterClearanceId=" + letterClearanceId + ", letterType=" + letterType + ", siteCode="
				+ siteCode + ", submissionDate=" + submissionDate + ", letterDoc=" + letterDoc + "]";
	}

}
