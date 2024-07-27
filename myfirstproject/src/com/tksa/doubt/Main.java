package com.tksa.doubt;

class A {

static int value = 10;

static { value = value-- + --value; }

}

class B extends A {

static { 
	System.out.println("hi");
	value = --value - value--; 
	}

static void dis() {
	System.out.println(value);
}

}

public class Main {

	public static void main(String[] args) {
		
		System.out.println(B.value);
		B.dis();


	}

}
