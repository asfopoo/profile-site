package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.GameController;
import model.Game;



public class ChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Change: doGet");
		
		GameController controller = new GameController();
		Game model = new Game();
		
		controller.addItem(model.getChange()); // adds change to userinventory items

		
		// call JSP to generate empty form
		req.getRequestDispatcher("/_view/change.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Change: doPost");
	
		resp.sendRedirect(req.getContextPath() + "/change");
		
		
	}
}