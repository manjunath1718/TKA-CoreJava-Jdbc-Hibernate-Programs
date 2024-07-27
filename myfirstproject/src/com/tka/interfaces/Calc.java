package com.tka.interfaces;
class Calculator{
	public  Calculator sum(Calculator c) {
		System.out.println("hi");
		return new Calculator();
	}

}
class SciCalci extends Calculator{
	//CoVarrient return type
	@Override
	public  SciCalci sum(Calculator c) {
		System.out.println("bye");
		return new SciCalci() ;
	}
}
interface Alpha{
	int age=24;
	void disp();
}
interface Beta{
	int age=22;
	void disp();
}
public  class Calc implements Alpha,Beta{
	int age=36;
	@Override
	public void disp() {
		System.out.println("ffffffffffffffffffff");		
	}
	
	public static void main(String[] args) {
		Calc c=new Calc();
		System.out.println(c.age);
		
	}

	

}
