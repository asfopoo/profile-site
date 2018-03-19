package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.GameController;
import model.Game;

/*<div>
<!--	<img src="<%=renderRequest.getContextPath()%>/images/ZombieHands.jpg"   -->
</div> */ //goes in jsp for image	

public class StartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Start Servlet: doGet");	
		
		// call JSP to generate empty form
		req.getRequestDispatcher("/_view/start.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Login Servlet: doPost");
		String errorMessage = null;
		Game model = new Game();
		
		try {
			String next = req.getParameter("next");
			
			
			
		if (!(next == "c")) {
				errorMessage = "Please press c to continue";
						
			}
			else {
				model.setStart(next);
			}

		} catch (NumberFormatException e) {
			errorMessage = "Invalid selection";
		}
		
		req.setAttribute("errorMessage", errorMessage);
		
		req.setAttribute("game", model);
		
		req.getRequestDispatcher("/_view/bedroom.jsp").forward(req, resp);
		
	}	
}
