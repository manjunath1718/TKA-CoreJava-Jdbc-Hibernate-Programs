package com.tka.demo;

public class B {

	C m1(){

		m2();
		return new C();

	}

	void m2(){
		System.out.println("Class B m2()");
	}

}
