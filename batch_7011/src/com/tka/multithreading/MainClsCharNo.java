package com.tka.multithreading;

public class MainClsCharNo {

	public static void main(String[] args) {
		
		CharFromStr c1=new CharFromStr();
		Thread t1=new Thread(c1);
		
		DigitFromNo d1=new DigitFromNo();
		Thread t2=new Thread(d1);
		
		
		t1.start();
		t2.start();
		

	}

}
