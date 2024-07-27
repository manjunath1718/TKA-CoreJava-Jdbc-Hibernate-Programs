package com.tka.tasks;

public class Employee {

	int empId;
	String empName;
	double empSal;

	public Employee(int id,String nm,double sal) {
		empId=id;
		empName=nm;
		empSal=sal;
	}
	
	public void display() {
		
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+empSal);
	}

	public static void main(String[] args) {

		Employee e1=new Employee(1,"raj",15000.00);
		e1.display();


	}

}
