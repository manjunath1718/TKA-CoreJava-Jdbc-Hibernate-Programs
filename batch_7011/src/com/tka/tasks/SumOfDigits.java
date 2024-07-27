package com.tka.tasks;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		int sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		for(sum=0;n!=0;n=n/10) {
			sum=sum+n%10;
		}
		System.out.println("sum of digits "+sum);
		
	}

}
