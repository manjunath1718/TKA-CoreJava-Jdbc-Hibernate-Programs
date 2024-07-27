package com.tka.fileio;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File f=new File("data.txt");
		
		if(f.exists()) {
			System.out.println("size of file "+f.length());
			System.out.println(f.isFile());
			System.out.println("File exist");
			
		}else {
			System.out.println("File doesnot exist");
		}
		
//		if(f.exists()) {
//			System.out.println("size of file "+f.length());
//			System.out.println(f.isFile());
//			System.out.println("File exist");
//			f.delete();
//		}else {
//			System.out.println("File doesnot exist");
//		}

	}

}
