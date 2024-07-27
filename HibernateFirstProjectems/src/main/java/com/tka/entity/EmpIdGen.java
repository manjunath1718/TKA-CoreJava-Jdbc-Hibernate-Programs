package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class EmpIdGen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	String name;

	double salary;

	
	public EmpIdGen(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}

	public EmpIdGen() {

	}

	public EmpIdGen(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	


}
