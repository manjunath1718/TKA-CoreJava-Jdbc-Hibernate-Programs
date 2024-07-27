package com.tka.multithreading;

public class DigitFromNo implements Runnable{
	
    int num=12345;  
    
	public void run() {
		for(int i=0;num>0;i++) {
			System.out.println(num%10);
			num=num/10;
		}
	}
}
