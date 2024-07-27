package com.tka.multithreading;

public class ThreadEven extends Thread{

	public void run() {
		for(int i=2;i<=50;i=i+2) {			
				System.out.println("Even Number"+i);		
		}
	}


}
