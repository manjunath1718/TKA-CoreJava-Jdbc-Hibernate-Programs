package com.tka.sat;

public class LeapYear {

	static boolean leapYear=false;
	public static void isLeapYear(int year) {

		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leapYear=true;			
				}
				else {
					leapYear=false;
				}
			}
			else {
				leapYear=true;
			}
		}
		else {
			leapYear=false;
		}


		if(leapYear) {
			System.out.println(year+" is Leap Year");
		}
		else {
			System.out.println(year+" is not Leap Year");
		}

	}
	public static void main(String[] args) {

		LeapYear.isLeapYear(2020);

	}

}
