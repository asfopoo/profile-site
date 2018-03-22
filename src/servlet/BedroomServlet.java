package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Game;


public class BedroomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Bedroom Servlet: doGet");
		
		req.getRequestDispatcher("/_view/bedroom.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Bedroom Servlet: doPost");
		
		Game model = new Game();
		
		String choice = req.getParameter("choice");
	
		model.setChoice(choice);
		
		req.setAttribute("game", model);
			
		
		System.out.print(model.getChoice());
		System.out.println("Choice2 = " + choice);
		
		req.getRequestDispatcher("/_view/bedroom.jsp").forward(req, resp);
		
		if(model.getChoice() == "one") {
			resp.sendRedirect(req.getContextPath() + "/game");
		}	
		
		
	
	}

}