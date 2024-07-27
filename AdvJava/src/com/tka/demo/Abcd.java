package com.tka.demo;

public class Abcd {

	public static void main(String[] args) {
		A a1=new A();
		B b1=a1.m1();
		C c1=b1.m1();
		D d1=c1.m1();
		System.out.println(d1.m1());
		
		System.out.println(new A().m1().m1().m1().m1());
		
		
		

	}

}
