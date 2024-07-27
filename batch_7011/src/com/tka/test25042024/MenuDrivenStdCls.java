package com.tka.test25042024;

import java.util.Scanner;

public class MenuDrivenStdCls {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student[] s = new Student[5];
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1:Accept 5 Student Details");
			System.out.println("2:Display 5 Student Details");		
			System.out.println("3:Display Total Fees of 5 Students");
			System.out.println("4:Search for Perticular Student");
			System.out.println("5:Press 5 to Exit");
			System.out.println("---------------------------------------------");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				for(int i=0;i<s.length;i++) {
					System.out.println("Enter Student Id ");
					int studentId=sc.nextInt();
				  
				    System.out.println("Enter Student name ");
					String studentName=sc.next();
					
					System.out.println("Enter Student Fees ");
					double studentFees=sc.nextDouble();
					s[i]=new Student(studentId,studentName,studentFees);
				}
				System.out.println("Successfully Accepted 5 Student Details");
			   break;
			   
			case 2:
				for(int i=0;i<s.length;i++) {
					System.out.println(s[i].toString());
				}
				
			   break;
			   
			case 3:		double sum=0.0;		
				for(int i=0;i<s.length;i++) {
					sum=sum+s[i].getStudentFees();
				}
				System.out.println("Total Fees of 5 Student "+sum);
			   break;
			   
			case 4:
				System.out.println("Enter Name");
				String str=sc.next();
				boolean flag=false;
				for(int i=0;i<s.length;i++) {
					if(str.equals(s[i].getStudentName())) {
						flag=true;
						break;
					}	
				}
				if(flag) {
					System.out.println("Student found");
				}else {
					System.out.println("Student not found");
				}
				
			   break;
			   
			case 5:
				System.exit(0);
				
		    default:
				System.out.println("Invalid choice");
			}
		}

	}

}
