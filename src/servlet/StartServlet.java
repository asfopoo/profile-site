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
		
		Game model = new Game();
		GameController controller = new GameController();
		controller.setModel(model);

		req.setAttribute("game", model);
		
		System.out.println(model.getOpen());	
		System.out.println("Start Servlet: doGet");	
		
		// call JSP to generate empty form
		req.getRequestDispatcher("/_view/start.jsp").forward(req, resp);
	}
}
