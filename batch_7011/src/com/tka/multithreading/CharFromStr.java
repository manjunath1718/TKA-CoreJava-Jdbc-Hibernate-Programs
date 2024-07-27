package com.tka.multithreading;

public class CharFromStr implements Runnable{
	
	String str="something";
	
	public void run() {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||
					str.charAt(i)=='o' ||str.charAt(i)=='u' ) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
			}			
			System.out.println(str.charAt(i));
		}
	}

}
