package com.tka.col1;

import java.util.Scanner;

class MainClsOfEmp {
	
	public static void main(String[] args) {
		EmployeeManagementSystem ems=new EmployeeManagementSystem();
		while(true) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("==================================================");
			System.out.println("1:Add Element");
			System.out.println("2:Display Element");
			System.out.println("3:Remove Element");
			System.out.println("4:Search Element");
			System.out.println("5:Press 5 to Exit");
			System.out.println("==================================================");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			  case 1:
				  ems.addElement();
				  break;
			  case 2: 
				  ems.displayElements();
				  break;
			  case 3:
				  ems.removeElement();
				  break;	
			  case 4:
				  ems.searchElement();
				  break;	
			  case 5:
				  System.exit(0);	
			  default : 
				System.out.println("Invalid Choice.Please Enter Valid Choice");
			}
		}

	}

}
