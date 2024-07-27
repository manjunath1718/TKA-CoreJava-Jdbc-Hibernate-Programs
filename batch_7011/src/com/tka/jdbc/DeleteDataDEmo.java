package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataDEmo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("connected");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","root");

		System.out.println("Enter Student Id");
		int id=sc.nextInt();

		
		PreparedStatement preparedStmt=con.prepareStatement("delete from student where stdid=?");
		
		
		preparedStmt.setInt(1, id);
		
		preparedStmt.executeUpdate();

		System.out.println("record deleted");
		con.close();

	}

}
