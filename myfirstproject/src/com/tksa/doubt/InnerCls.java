package com.tksa.doubt;

public class InnerCls {
	
    class Innner{
		 void m() {
			System.out.println("hi");
			
		}
	}

	public static void main(String[] args) {
		
		InnerCls o=new InnerCls();
	//	InnerCls.Innner i=new InnerCls().new Innner();
	
	//	Innner i=new InnerCls().new Innner();
		InnerCls.Innner i= o.new Innner();
		i.m();

	}

}
