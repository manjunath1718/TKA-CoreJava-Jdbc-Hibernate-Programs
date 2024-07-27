package com.tka.test;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number");
		int no1=sc.nextInt();
		System.out.println("enter 2nd number");
		int no2=sc.nextInt();
		int sum=no1+no2;
		System.out.println("sum of 2 numbers "+sum);

	}

}
