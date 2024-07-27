package com.tka.demo;

public class C {

	D m1(){

		m2();
		return new D();

	}

	void m2(){
		System.out.println("Class C m2()");
	}

}
