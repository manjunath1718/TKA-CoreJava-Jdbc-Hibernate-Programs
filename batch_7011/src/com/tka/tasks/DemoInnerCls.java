package com.tka.tasks;

public class DemoInnerCls {

	 static class Inner{
		void display() {
			System.out.println("hi");
		}
	}
	public static void main(String[] args) {
		
		DemoInnerCls d1=new DemoInnerCls();
		
		DemoInnerCls.Inner i1= new DemoInnerCls.Inner();
		

	}

}
