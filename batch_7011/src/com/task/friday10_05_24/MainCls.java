package com.task.friday10_05_24;

public class MainCls {

	public static void main(String[] args) {
		ThreadOfTwo t2=new ThreadOfTwo();
		ThreadOfFive t5=new ThreadOfFive();
		ThreadOfFifteen t15=new ThreadOfFifteen();
		
		t2.start();
		t5.start();
		t15.start();

	}

}
