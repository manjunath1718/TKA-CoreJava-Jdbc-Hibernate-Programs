package com.tka.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int pId;
	
	String pName;
	
	@OneToOne(cascade = CascadeType.ALL)
	Blood blood;

	public Person() {
		
	}

	public Person(String pName) {
		
		this.pName = pName;
	}

	public Person(int pId, String pName, Blood blood) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.blood = blood;
	}

	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Blood getBlood() {
		return blood;
	}

	public void setBlood(Blood blood) {
		this.blood = blood;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", blood=" + blood + "]";
	}

	
}
