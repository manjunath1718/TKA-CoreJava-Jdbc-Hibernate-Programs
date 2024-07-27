package com.telusko.fileio;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name");
		String f1=sc.next();
//		f1.createNewFile();//if file not there we have to create new file
		FileWriter fw1= new FileWriter(f1);
		
		System.out.println("Enter Data");
		fw1.write(sc.next());//converts data into streams
		fw1.write(sc.nextLine());
//		fw1.flush();
		//A set or sequence of binary values is called as streams
//		fw1.flush();//converts streams into data & stores into file
	
//		fw1.write(" raj");
//		fw1.write(" how r u");
//		fw1.flush();
		fw1.close();
		FileReader fr1=new FileReader(f1);
		int x;		
		while((x=fr1.read())!=-1) {
			System.out.print((char)x);
			
		}

	}

}
