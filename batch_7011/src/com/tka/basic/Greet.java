package com.tka.basic;

import java.util.Scanner;

public class Greet {
	String str;
	public void disp(String str) {
		this.str=str;
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Greet g1=new Greet();
		System.out.println("enter name");
		g1.disp(sc.nextLine());
		System.out.println("entered name");
		System.out.println("name "+g1.str);
		
		
		

	}

}
