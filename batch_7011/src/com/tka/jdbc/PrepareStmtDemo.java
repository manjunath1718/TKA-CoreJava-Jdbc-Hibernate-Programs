package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class PrepareStmtDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","root");
		System.out.println("connected");
		
		System.out.println("Enter Student Id");
		int id=sc.nextInt();
		System.out.println("Enter Student name");
		String name=sc.next();
		System.out.println("Enter Student course");
		String course=sc.next();
		
	
		PreparedStatement preparedStmt=con.prepareStatement("INSERT into Student values(?,?,?)");
		preparedStmt.setInt(1,id);
		preparedStmt.setString(2,name);
		preparedStmt.setString(3,course);
		preparedStmt.executeUpdate();

		System.out.println("record inserted");
		con.close();
		
	}

}
