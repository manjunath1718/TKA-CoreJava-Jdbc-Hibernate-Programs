package com.tka.tasks;

import java.util.Scanner;

public class Max {
	
	Scanner sc=new Scanner(System.in);
	
	public void check() {
		System.out.println("enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println(a+" is greater than "+b+" and "+c);
			}
			else {
				System.out.println(c+" is greater than "+b+" and "+a);
			}
		}
		else if(b>c){
			
			System.out.println(b+" is greater than "+c+" and "+a);
		}
		else {
			System.out.println(c+" is greater than "+b+" and "+a);
		}
	}
	
	public static void main(String[] args) {
		
		Max m1=new Max();
		m1.check();
		
	}

}
