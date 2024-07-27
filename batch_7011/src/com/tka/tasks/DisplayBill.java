package com.tka.tasks;

import java.util.Scanner;

public class DisplayBill {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float totalBill=0;
		for(int i=1;i<=5;i++) {
			System.out.println("enter bill of customer number "+i);
			int n=sc.nextInt();
			totalBill=totalBill+n;
		}
		System.out.println("Total Bill of 5 customers "+totalBill);
		System.out.println("Average Bill "+totalBill/5);
	}

}
