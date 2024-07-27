package com.tka.basic;

public class A {

	static int value=10;
	
	static {
		System.out.println("hi");
		value=value-- + --value;
	}
}
