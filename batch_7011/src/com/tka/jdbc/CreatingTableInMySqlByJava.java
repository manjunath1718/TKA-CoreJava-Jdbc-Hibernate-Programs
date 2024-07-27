package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTableInMySqlByJava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String sql;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("connected");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","root");

		Statement stmt=con.createStatement();
		
		sql="create table faculty1(facultyId int,facName varchar(20))";
		stmt.execute(sql);

		sql="insert into faculty1 values(1,'kiran')";
		stmt.executeUpdate(sql);
	    sql="insert into faculty1 values(2,'raj')";
		stmt.executeUpdate(sql);		
		sql="insert into faculty1 values(3,'ram')";
		stmt.executeUpdate(sql);
		
		ResultSet rs=stmt.executeQuery("select * from faculty1");
		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
	
		}
		con.close();

	}

}
