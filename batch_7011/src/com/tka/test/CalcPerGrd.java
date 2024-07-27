package com.tka.test;

import java.util.Scanner;

public class CalcPerGrd {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);

		System.out.println("enter marks of 1st subject out of 100");
		int marks1=sc.nextInt();
		System.out.println("enter marks of 2nd subject out of 100");
		int marks2=sc.nextInt();
		System.out.println("enter marks of 3rd subject out of 100");
		int marks3=sc.nextInt();
		int totalMarks=marks1+marks2+marks3;
		double percentage=(totalMarks/300)*100;
		
		if(percentage>90) {
			System.out.println("Grade: A");
		}
		else if(percentage>80 && percentage<=90 ) {
			System.out.println("Grade: B");
		}
		else if(percentage>60 && percentage<=80 ) {
			System.out.println("Grade: c");
		}
		else if(percentage>=35 && percentage<=60 ) {
			System.out.println("Just Pass");
		}
		else {
			System.out.println("Fail");
		}

		
	}

}
