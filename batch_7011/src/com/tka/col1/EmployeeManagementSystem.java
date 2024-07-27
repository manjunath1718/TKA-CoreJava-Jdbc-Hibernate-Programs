package com.tka.col1;

import java.util.ArrayList;

import java.util.Scanner;

class EmployeeManagementSystem {

	ArrayList<Employee> list=new ArrayList<Employee>();
	
	static int uniqueId;
    Scanner s=new Scanner(System.in);
	public  void addElement() {		
		System.out.println("Enter Employee Name");
		String name=s.next();
		
		String id="RCB"+ ++uniqueId;
		System.out.println("Employee unique Id to Identify "+name+" is => "+id);
		
		System.out.println("Enter Employee Salary");
		double sal=s.nextDouble();
		
		list.add(new Employee(id,name,sal));
	}
	public  void displayElements() {
		for(int i=0;i<list.size();i++) {		
			System.out.println(list.get(i));
		}
		
	}
	public  void removeElement() {
		System.out.println("Enter Employee Id to remove that employee details");
		String id=s.next();
		for(int i=0;i<list.size();i++) {
			if(id.equalsIgnoreCase(( list.get(i)).getEmployeeId())) {
				list.remove(i);
				System.out.println("Successfully removed Employee Details");
			}
		}	  
	}
	public  void searchElement() {
		System.out.println("Enter Employee Id OR Name to be searched");
		String str=s.next();
		boolean found=true;
		int x=0;
		for(int i=0;i<list.size();i++) {
			if(str.equalsIgnoreCase(( list.get(i)).getEmployeeId())) {
				System.out.println("Employee Id Matched with beloe Employee");
				System.out.println(list.get(i));
				found=false;
			}
			else if(str.equalsIgnoreCase(( list.get(i)).getEmployeeName())) {				
				if(x==0)
            	   System.out.println("Employees found with Name "+str);
				
				System.out.println(list.get(i));
				found=false;
				x++;
			}		
		}
		if(found) {
			System.out.println("Employee Not Found");
		}
		
	}
	
	
}
