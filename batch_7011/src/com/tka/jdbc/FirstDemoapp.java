package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class FirstDemoapp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("connected");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","root");

		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student ");
		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	
		}
		
		con.close();
	}




}
