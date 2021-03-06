package com.mine.servlet3.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="mytest",
		urlPatterns={"/url"})		
public class TheServlet extends HttpServlet {
    
	private static final long serialVersionUID = 1L;	
	
	@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           String jspPath = "view/main.jsp";
           // Comment to commit.
           request.getRequestDispatcher(jspPath).forward(request, response);
    }
	
	/**
	 * Tester le plugin pmd.
	 */
	private void triggerWarnnings() {
		String variable = "toto";   
	}
}
