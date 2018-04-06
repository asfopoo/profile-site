package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fakeDB.FakeAreaDB;


public class GameServlet extends HttpServlet {
	public int level = 1;
	private static final long serialVersionUID = 1L;
	public boolean post = false;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		post = false;
		System.out.println("Game Servlet: doGet");
		FakeAreaDB db = new FakeAreaDB();
		
		db.setArea(level);
		db.setScreen();
		//Sets paragraph above the choices
		String para = db.getPara();
		String[] options = db.getOptions();				
		req.setAttribute("para",para);
		
		//Sets the choices
		for(int i = 0; i < 6; i++){
			
			req.setAttribute("q" + (i + 1), (i + 1) + ": " + options[i]);
		}

		
		req.getRequestDispatcher("/_view/game.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		post = true;
		System.out.println("Game Servlet: doPost");
		
		
		req.getRequestDispatcher("/_view/game.jsp").forward(req, resp);
	}
}