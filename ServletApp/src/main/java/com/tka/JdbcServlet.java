package com.tka;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/JdbcServlet")
public class JdbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public JdbcServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("uname");
		String password=request.getParameter("upassword");
		
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tka_hib_spr","root","root");
			String sql="select * from userinfo where u_name=? and u_password=?";
			
			 PreparedStatement pstmt = con.prepareStatement(sql);
			 pstmt.setString(1, name);
			 pstmt.setString(2, password);
			 
			 System.out.println(sql);
			ResultSet rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				
				System.out.println(rs.getString(1)+" : "+rs.getString(2)); 
			    RequestDispatcher reqDispatch = request.getRequestDispatcher("jdbcvalid.jsp");
					reqDispatch.forward(request, response);			
				
			}else {
				
				RequestDispatcher reqDispatch = request.getRequestDispatcher("jdbcinvalid.jsp");
				reqDispatch.forward(request, response);
				
			}
			
			rs.close();
		    pstmt.close();
		    con.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	
		
	}

}
