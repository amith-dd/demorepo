package myserveltproject.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s1")
public class ServletOne extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		long contact = Long.parseLong(req.getParameter("u_contact"));
		String email = req.getParameter("u_email");
		
		req.setAttribute("k1", contact);
		req.setAttribute("k2", email);
		
		req.getRequestDispatcher("s2").forward(req, res);
		
	}

}
