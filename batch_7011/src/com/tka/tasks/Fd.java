package com.tka.tasks;

public class Fd {

	double pamt;
	double roi;
	int duration;
	
	public Fd(double amt, double r, int dur) {
		
		pamt = amt;
		roi = r;
		duration = dur;
	}

	public void display() {
		double mamt=pamt+(pamt*roi*duration)/100;
		System.out.println("maturity amount "+mamt);
	}
	public static void main(String[] args) {
		
		Fd f1=new Fd(100000, 20, 2);
		f1.display();
	}

}
