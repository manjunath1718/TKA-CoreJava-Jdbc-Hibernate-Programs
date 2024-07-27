package com.task.friday10_05_24;

public class ThreadOfTwo extends Thread {
	
	public void run() {
		for(int i=1;i<11;i++) {
			int n=2*i;
			System.out.println("2*"+i+"="+n);
			if(i==9) {
				try {
					System.out.println("Tables of Two is going to Pause");
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
