package com.tka.java8features.lambdaexp;

public class MainClsOfmsg {

	public static void main(String[] args) {
		Message m=(str)->{
			System.out.println(str);
		};

		m.msg("hello");
	}

}
