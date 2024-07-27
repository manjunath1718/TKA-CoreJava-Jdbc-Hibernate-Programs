package com.tka.tasks;

import java.util.Scanner;

public class CountOfEvenAndOdd {
	
	public static void main(String[] args) {
		int CountEven=0,CountOdd=0;
		int lastDigit=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		for(int i=n;n!=0;n=n/10) {
			lastDigit=n%10;
			if(lastDigit%2==0  && lastDigit!=0) {
				CountEven++;
			}
			else if(lastDigit!=0){
				CountOdd++;
			}			
		}
		System.out.println("Count of even digits "+CountEven);
		System.out.println("Count of odd digits "+CountOdd);
	}

}
