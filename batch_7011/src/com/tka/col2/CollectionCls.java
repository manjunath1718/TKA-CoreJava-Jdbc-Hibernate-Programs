package com.tka.col2;

import java.util.ArrayList;

public class CollectionCls {
	
	public static void main(String[] args) {
		ArrayList<Student> aList=new ArrayList<Student>();
		
		aList.add(new Student(1,"raj",5000.0));
		aList.add(new Student(2,"ram",6000.0));
		aList.add(new Student(3,"rahul",7000.0));
		
		System.out.println(aList);
		
		
		
	}

}
