package com.tka.java8features.lambdaexp;

public class Sum {

	public static void main(String[] args) {
		
		Calculation c=(a,b)-> System.out.println("Sum="+(a+b));
		
		c.calc(5, 6);

	}

}
