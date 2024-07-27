package com.tka.app1;

import java.util.TreeSet;

public class LaunchApp1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(5);
		ts.add(25);
		ts.add(20);
		ts.add(50);
		ts.add(1);
		
		System.out.println(ts);
		
		for(Integer i:ts) {
			System.out.println(i);
		}

	}

}
