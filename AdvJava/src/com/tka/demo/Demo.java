package com.tka.demo;

public class Demo {
	//m1() returns object of A1 class
	A1 m1(){
		
		A1 a1=new A1();
		
		a1.m2();
		
		return a1;
	}
	void m2() {
		System.out.println(" method m2 of Demo");
	}

}
