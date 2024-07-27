package com.myfirstproject.program;

import java.util.Scanner;

public class PrimeNo {
	
	public static void checkPrimeNos(int n) {
		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println("number is not prime number");
			}
			else {
				System.out.println("number is prime number");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		PrimeNo.checkPrimeNos(n);

	}

}
