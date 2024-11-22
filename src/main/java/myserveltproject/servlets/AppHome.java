package myserveltproject.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/home")
public class AppHome extends GenericServlet{

	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pWriter = res.getWriter();
		pWriter.println("Welcome Home");
		
		RequestDispatcher rd =  req.getRequestDispatcher("logout");
		rd.forward(req, res);
	}

}
