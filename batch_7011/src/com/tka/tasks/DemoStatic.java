package com.tka.tasks;

public class DemoStatic {

	String name="raj";
	long accno=123456789l;
	static String bankName="SBI";
	
	public void displayDetails() {
		System.out.println("name "+name+"\nAccount no "+accno+"\nBank Name "+bankName);
	}
	public static void main(String[] args) {
		

		DemoStatic ds=new DemoStatic();
		ds.displayDetails();
	}

}
