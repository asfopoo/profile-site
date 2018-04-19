package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.GameController;
import model.Game;



public class StartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Start Servlet: doGet");	
		
		String username = (String) req.getSession().getAttribute("username");
		if (username == null) { // checks session for being logged in
			req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);		
		}
		else {
			req.getRequestDispatcher("/_view/start.jsp").forward(req, resp);
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Start Servlet: doPost");
	
		resp.sendRedirect(req.getContextPath() + "/bedroom");
		
		
	}
}
