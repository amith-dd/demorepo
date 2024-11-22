package myserveltproject.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s2")
public class ServletTwo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		Long contact = (Long) req.getAttribute("k1");
		String mail = (String) req.getAttribute("k2");
		
		res.getWriter().print(mail+" "+contact+"  data fetched from request object");
				
		
	}

}
