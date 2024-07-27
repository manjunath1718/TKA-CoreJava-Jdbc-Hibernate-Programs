package com.tka.multithreading;

public class ThreadTable extends Thread{
	
	public void run() {
		for(int i=1;i<21;i++) {
			System.out.println("5*"+i+"="+(5*i));
		}
	}

}
