package com.tka.multithreading;

public class MainThreadPrg {

	public static void main(String[] args) {
		
		ThreadEven t= new ThreadEven();
		ThreadOdd t1= new ThreadOdd();
		ThreadTable t2= new ThreadTable();

		t.start();
		t1.start();
		t2.start();
		
		System.out.println(t);
		System.out.println(t1);
//		System.out.println(t2);
		
		t.setName("Even Numbers");
		t.setPriority(Thread.MAX_PRIORITY);
		
		t1.setName("Odd Numbers");
		t1.setPriority(Thread.MIN_PRIORITY);
	
		t2.setName("Tables of Five");
		t2.setPriority(1);
		
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		
	}

}
