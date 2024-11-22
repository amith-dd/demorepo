package myserveltproject.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/httpone")
public class HttpServletOne extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String contactstring = req.getParameter("u_contact");
		
		System.out.println(contactstring);
		
		long contact = Long.parseLong(contactstring);
		String email = req.getParameter("u_email");
		
		resp.getWriter().print(email+" "+contact+"  ==========");
		
	}
	
}
