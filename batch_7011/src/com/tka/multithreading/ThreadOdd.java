package com.tka.multithreading;

public class ThreadOdd extends Thread{
	
	public void run() {
		
		for(int i=1;i<=50;i=i+2) {			
				System.out.println("Odd Number"+i);	
				
		}
	}

}
