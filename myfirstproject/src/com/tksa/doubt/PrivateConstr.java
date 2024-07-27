package com.tksa.doubt;
class Demo{
	public Demo() {
		System.out.println("hi");
	}
	private  void display() {
		System.out.println("Demo class");
	}
}
public class PrivateConstr extends Demo{
	
	public PrivateConstr() {
		System.out.println("bye");
	}
	private  void display() {
		
		System.out.println("sub class");
	}
	
	public static void main(String[] args) {
		PrivateConstr p1=new PrivateConstr();
		
		p1.display();
	}

}
