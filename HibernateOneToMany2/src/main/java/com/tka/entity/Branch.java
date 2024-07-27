package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	int bId;
	
	String bName;
	
	String bCity;

	public Branch() {
		
	}

	public Branch(String bName, String bCity) {
		super();
		this.bName = bName;
		this.bCity = bCity;
	}

	public Branch(int bId, String bName, String bCity) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bCity = bCity;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbCity() {
		return bCity;
	}

	public void setbCity(String bCity) {
		this.bCity = bCity;
	}

	@Override
	public String toString() {
		return "Branch [bId=" + bId + ", bName=" + bName + ", bCity=" + bCity + "]";
	}

	
}
