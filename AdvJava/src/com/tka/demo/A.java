package com.tka.demo;

public class A {

	B m1(){
		
		m2();
		return new B();
		
	}
	
	void m2(){
		System.out.println("Class A m2()");
	}
}
