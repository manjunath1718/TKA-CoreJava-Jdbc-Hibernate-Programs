package com.tka.tasks;

public class Area {

	public void areaOfRectangle() {
		
		int l=4,b=5;
		int  area=l*b;
		
		System.out.println("Area of Rectangle "+area);


	}

	public void areOfCircle() {
		
		int r=4;
		final double PI=3.14;
		double area=PI*r*r;

		System.out.println("Area Of circle "+area);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a1=new Area();
		a1.areaOfRectangle();
		a1.areOfCircle();

	}

}
