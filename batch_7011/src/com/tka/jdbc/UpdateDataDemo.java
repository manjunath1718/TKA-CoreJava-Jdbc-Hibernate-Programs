package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("connected");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","root");

		System.out.println("Enter Student Id");
		int id=sc.nextInt();

		System.out.println("Enter Student course");
		String course=sc.next();
		
		PreparedStatement preparedStmt=con.prepareStatement("update student set course=? where stdid=?");
		
		preparedStmt.setString(1, course);
		preparedStmt.setInt(2, id);
		
		preparedStmt.executeUpdate();

		System.out.println("record updated");
		con.close();
		
	}

}
