package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blood {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bId;
	
	String bloodGroup;
	
	char rhFactor;

	public Blood() {
		
	}

	
	public Blood(String bloodGroup, char rhFactor) {
		super();
		this.bloodGroup = bloodGroup;
		this.rhFactor = rhFactor;
	}


	public Blood(int bId, String bloodGroup, char rhFactor) {
		
		this.bId = bId;
		this.bloodGroup = bloodGroup;
		this.rhFactor = rhFactor;
	}


	public int getbId() {
		return bId;
	}


	public void setbId(int bId) {
		this.bId = bId;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public char getRhFactor() {
		return rhFactor;
	}


	public void setRhFactor(char rhFactor) {
		this.rhFactor = rhFactor;
	}


	@Override
	public String toString() {
		return "Blood [bId=" + bId + ", bloodGroup=" + bloodGroup + ", rhFactor=" + rhFactor + "]";
	}
	
	

}
