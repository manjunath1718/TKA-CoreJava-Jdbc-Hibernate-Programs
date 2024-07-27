package com.telusko.fileio;

import java.io.File;
import java.io.IOException;

//Program to create file
public class Demo2 {

	public static void main(String[] args) {
		
		File f1=new File("d:/tka.pdf");
				
		try {
			boolean  res = f1.createNewFile();
			System.out.println(res);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}
