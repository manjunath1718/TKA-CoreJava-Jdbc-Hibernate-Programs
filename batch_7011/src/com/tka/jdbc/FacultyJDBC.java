package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FacultyJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ArrayList<Faculty> alist=new ArrayList();
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("connected");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","root");

		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from faculty1");
		while(rs.next()) {
			
			alist.add(new Faculty(rs.getInt(1),rs.getString(2)));
		}
		System.out.println(alist);
		con.close();
	}

}
