package com.tksa.doubt;
class Alpha{
	public static void display() {
		System.out.println("hi");
	}
}
public class StaticMeth extends Alpha {

	public static void display() {
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		Alpha s1=new StaticMeth();
		s1.display();//hi
	}
}
