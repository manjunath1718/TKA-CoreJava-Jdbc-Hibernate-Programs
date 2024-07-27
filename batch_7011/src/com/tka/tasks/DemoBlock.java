package com.tka.tasks;

public class DemoBlock {

	static int n=1;
	static {
		n=3;
		System.out.println("n "+n);
	}
	
	{
		n=4;
		System.out.println("n "+n);
	}
	
	public void demo() {
		{
			System.out.println("hi");
		}
	}
	public static void main(String[] args) {
		

		DemoBlock db=new DemoBlock();
	}

}
