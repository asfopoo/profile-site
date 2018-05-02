package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GameOverServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("gameOver Servlet: doGet");
		
		req.getRequestDispatcher("/_view/gameOver.jsp").forward(req, resp); ///// put in multiple images of maps with each with different prgress corresponding to the users progress
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("gameOver Servlet: doPost");
		
		
		
		
		
			req.getRequestDispatcher("/_view/gameOver.jsp").forward(req, resp);
		
		
	}

}
