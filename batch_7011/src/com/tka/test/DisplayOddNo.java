package com.tka.test;

import java.util.Scanner;

public class DisplayOddNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int sum=0;
		for(int i=1;i<=10;i++) {
			System.out.println("Enter number "+i);
			n=sc.nextInt();
			if(n%2!=0) {
				sum=sum+n;
			}
			
		}
		System.out.println("Sum of Odd Numbers "+sum);

	}

}
