package com.tka.basic;
import java.util.*;
public class EvenOrOdd {
	
	public void check() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" is Even Number");
		}
		else {
			System.out.println(n+" is Odd Number");
		}
		
	}	
	public static void main(String[] args) {
		
		EvenOrOdd eo1=new EvenOrOdd();
		eo1.check();
		
	}

}
