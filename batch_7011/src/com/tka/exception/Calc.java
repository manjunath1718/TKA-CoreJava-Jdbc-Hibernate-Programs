package com.tka.exception;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		try {
			System.out.println(n1/n2);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally Block");
		}
		

	}

}
