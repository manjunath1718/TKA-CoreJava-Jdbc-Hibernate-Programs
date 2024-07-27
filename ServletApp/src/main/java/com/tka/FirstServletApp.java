package com.tka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/firstServletApp")
public class FirstServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public FirstServletApp() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");

		String name=request.getParameter("uname");
		
		PrintWriter pw=response.getWriter();
		pw.println("<h1>"+" Hello! "+name+" Login Successful"+"</h1>");
		
		RequestDispatcher reqDispatch=request.getRequestDispatcher("welcome.jsp");
		reqDispatch.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}