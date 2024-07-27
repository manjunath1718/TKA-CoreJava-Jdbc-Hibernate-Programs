package com.task.friday10_05_24;

public class ThreadOfFifteen extends Thread{
	
	public void run() {
		
		for(int i=1;i<11;i++) {
			int n=15*i;
			System.out.println("15*"+i+"="+n);
			if(i==9) {
				try {
					System.out.println("Tables of Fifteen is going Pause");
					Thread.sleep(6000);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}

	}


}
