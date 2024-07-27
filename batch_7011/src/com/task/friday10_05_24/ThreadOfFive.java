package com.task.friday10_05_24;

public class ThreadOfFive extends Thread{

	public void run() {
		
		for(int i=1;i<11;i++) {
			int n=5*i;
			System.out.println("5*"+i+"="+n);
			if(i==9) {
				try {
					System.out.println("Tables of Five is going to Pause");
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
