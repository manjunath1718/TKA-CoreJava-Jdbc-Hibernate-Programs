package com.tka.java8features.ananymousClass;
//Anonymous Class
public class Circle {
	
	public static void main(String[] args) {
				
		Shape s1=new Shape() {
			public void area() {
				System.out.println("Area "+PI*r*r);
			}
		};
		s1.area();
			
		
	}

}
