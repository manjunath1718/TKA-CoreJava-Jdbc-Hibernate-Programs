package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class EmpTblCreate {
	@Id
	int id;
	
	String name;
	
	double salary;

	public EmpTblCreate() {
		System.out.println("zero param constructor");
	}

	public EmpTblCreate(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpTblCreate [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
