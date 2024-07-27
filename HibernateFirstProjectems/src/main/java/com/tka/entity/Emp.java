package com.tka.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Emp {
	
	@Id
	@Column(name="eId")
	int id;
	
	@Column(name="eName")
	String name;
	
	@Column(name="eSalary")
	double salary;

	public Emp() {
		System.out.println("zero Param constructor");
	}

	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	@Override
	public String toString() {
		return "Emp [Id=" + id + ", Name=" + name + ", Salary=" + salary + "]";
	}
	
	
	
	
	
	

}
