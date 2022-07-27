package com.abc.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login",loadOnStartup = 1)
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    static
    {
    	System.out.println("Servlet Loading...........");
    }
	
    public ValidationServlet() {
        super();
        System.out.println("Servlet Instantiation...........");
    }
    
    public void init()
    {
    	System.out.println("Servlet Initialization.......");
    }
		
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Servlet Request Processing..............");

		//setting the content type
		response.setContentType("text/html");
		
		//getting the writer Object 
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Validation Page</title></head>");
		out.println("<body>");
		//getting the request paramter data
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		
		//perform validation assuming the username as Sachin and password as tendulkar
		if(username.equalsIgnoreCase("sachin") && password.equalsIgnoreCase("tendulkar"))
		{
			//login successful only when the username and password matches
			out.println("<h1 style='color:red;'>LOGIN SUCCESSFUL</h1>");
		}
		else
		{
			//login failed
			out.println("<h1>LOGIN FAILURE</h1>");
		}
		out.println("</body>");
		out.println("</html>");
		out.close();	
	}

}
