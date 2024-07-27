package com.tka.md;

import java.util.Scanner;

public class MDOfStudent {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Student s = null;
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1:Accept Student Details");
			System.out.println("2:Display Student Details");
			System.out.println("3:Compare Student Name");
			System.out.println("4:Display Student Fees After Discount");
			System.out.println("5:Press 5 to Exit");
			System.out.println("---------------------------------------------");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter Student name ");
				String sName=sc.next();
				System.out.println("Enter Student Id ");
			    int sId=sc.nextInt();
				System.out.println("Enter Student Fees ");
				double sFees=sc.nextDouble();
				s=new Student(sName, sId, sFees);
				System.out.println("Successfully Accepted Student Details");
			   break;
			   
			case 2:
				System.out.println(s.toString());
			   break;
			   
			case 3:				
				System.out.println("Enter Name to Compare");
				String name=sc.next();
				boolean sameName=s.studentName.equals(name);
				if(sameName) {
					System.out.println("Entered name is Same as student name");
					System.out.println("sudent Name ==> "+s.studentName);
				}
				else {
					System.out.println("Both names are Different");
				}
			   break;
			   
			case 4:
				double fee=s.studentFees-s.studentFees*10.0/100;
				System.out.println("Student fees after Discount "+fee);
			   break;
			   
			case 5:
				System.exit(0);
				
		    default:
				System.out.println("Invalid choice");
			}
		}

	}

}
