package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accident {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int accId;
	
	String accPlace;

	public Accident() {
		
	}

	public Accident(String accPlace) {
		
		this.accPlace = accPlace;
	}

	public Accident(int accId, String accPlace) {
		super();
		this.accId = accId;
		this.accPlace = accPlace;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccPlace() {
		return accPlace;
	}

	public void setAccPlace(String accPlace) {
		this.accPlace = accPlace;
	}

	@Override
	public String toString() {
		return "Accident [accId=" + accId + ", accPlace=" + accPlace + "]";
	}
	
	

}
