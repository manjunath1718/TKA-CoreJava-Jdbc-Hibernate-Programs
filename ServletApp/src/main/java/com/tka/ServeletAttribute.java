package com.tka;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServeletAttribute")
public class ServeletAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServeletAttribute() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name =  request.getParameter("uname");
		
		if(name.equalsIgnoreCase("raj")) {
			
			request.setAttribute("status", "Welcom Raj");
			RequestDispatcher reqDispatch = request.getRequestDispatcher("greet.jsp");
			reqDispatch.forward(request, response);
			
		}else {
			
			request.setAttribute("status", "Try AGAIN!!!");
			RequestDispatcher reqDispatch = request.getRequestDispatcher("error.jsp");
			reqDispatch.forward(request, response);
			
		}
	}

	

}
