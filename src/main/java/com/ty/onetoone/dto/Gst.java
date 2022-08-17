package com.ty.onetoone.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gst {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String gstNo;
	private String status;

	@OneToOne(mappedBy = "gst",fetch = FetchType.LAZY)
	private Company company;

	@Override
	public String toString() {
		return "\nGst [id=" + id + ", gstNo=" + gstNo + ", status=" + status + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
