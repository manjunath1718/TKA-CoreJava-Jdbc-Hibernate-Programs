package com.telusko.fileio;

import java.io.File;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {

		
//		File f1=new File("bike");
//		File f2=new File("student");
//		System.out.println(f1.renameTo(f2));
//		System.out.println(f2.renameTo(f1));
		
		File f3=new File("student1");
		f3.createNewFile();
		File f4=new File("employee1");
		System.out.println(f3.renameTo(f4));
		

	}

}
