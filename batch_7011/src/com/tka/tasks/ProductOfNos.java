package com.tka.tasks;

import java.util.Scanner;

public class ProductOfNos {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int product=1;
		for(int i=1;i<=5;i++) {
			System.out.println("enter number");
			int n=sc.nextInt();
			product=product*n;
		}
		System.out.println("product="+product);
	}

}
