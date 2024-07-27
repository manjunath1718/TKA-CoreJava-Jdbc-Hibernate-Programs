package com.tka.exception;

import java.util.Scanner;

public class ArraIndOBE {

	public static void main(String[] args) {
		int[] a=new int[2];

		try {
		    for(int i=0;i<5;i++) {
		    	System.out.println("enter Number");
		    	Scanner sc=new Scanner(System.in);
		    	int n=sc.nextInt();
		    	a[i]=n;
		    }			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
