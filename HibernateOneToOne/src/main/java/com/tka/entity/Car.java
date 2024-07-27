package com.tka.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int cId;
	
	String cName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="aId")
	Accident a;
	

	public Accident getA() {
		return a;
	}

	public void setA(Accident a) {
		this.a = a;
	}

	

	public Car() {
		
	}

	public Car(int cId, String cName) {
		
		this.cId = cId;
		this.cName = cName;
	}

	public Car(String cName) {
		super();
		this.cName = cName;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	
	@Override
	public String toString() {
		return "Car [cId=" + cId + ", cName=" + cName + ", a=" + a + "]";
	}
	
	

	
	
	
	
}
