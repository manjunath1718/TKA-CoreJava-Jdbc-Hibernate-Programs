package com.tka.Inheritance;

public class Area extends Rectangle{

	 int area=length*breadth;
	 
	public static void main(String[] args) {
		
		Area a1=new Area();
		
		System.out.println("Area of Rectangle "+a1.area);

	}

}
