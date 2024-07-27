package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int sId;

	String sName;

	public Subject() {
		
	}

	public Subject(String sName) {
		
		this.sName = sName;
	}

	public Subject(int sId, String sName) {
		
		this.sId = sId;
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "Subject [sId=" + sId + ", sName=" + sName + "]";
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}
	
	
	
}
