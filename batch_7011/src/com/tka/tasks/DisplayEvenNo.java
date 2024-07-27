package com.tka.tasks;

import java.util.Scanner;

public class DisplayEvenNo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int evenNos=0;
		for(int i=1;i<=10;i++) {
			System.out.println("enter number");
			int n=sc.nextInt();
			if(n%2==0) {
				evenNos=evenNos+1;
			}
		}
		System.out.println("total even numbers are "+evenNos);
	}

}
