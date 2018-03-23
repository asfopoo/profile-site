package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.GameController;
import model.Game;



public class GuestroomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Guestroom Servlet: doGet");	
		
		// call JSP to generate empty form
		req.getRequestDispatcher("/_view/guestroom.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("guesroom Servlet: doPost");
	
		resp.sendRedirect(req.getContextPath() + "/guestroom");
		
		
	}
}
