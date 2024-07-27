package com.tka.md;

public class ClsStr {
	static String s;
	public static void AcceptStr(String str) {
		s=str;
	}
	
	public static void DisplayStr() {
		System.out.println(s);
	}
	
	public static void compareStr(String str) {
		if(s.contentEquals(str)) {
			System.out.println("Both Strings are Same");
		}
		else {
			System.out.println("Both Strings are Different");
		}
	}
	
	public static void indexOfChar(char c) {
		System.out.println("index of "+c+" is "+s.indexOf(c));
	}
	public static void charAtPosition(int x) {
		System.out.println("Charcter at index no "+x+" is "+s.charAt(x));
	}
	

}
