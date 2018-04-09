package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fakeDB.FakeAreaDB;
import gamePersist.DatabaseProvider;
import gamePersist.DerbyDatabase;
import gamePersist.IDatabase;


public class GameServlet extends HttpServlet {
	public int level = 1;
	private static final long serialVersionUID = 1L;
	public boolean post = false;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		post = false;
		System.out.println("Game Servlet: doGet");
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example ---- CITING
		IDatabase db = DatabaseProvider.getInstance();
		//FakeAreaDB db2 = new FakeAreaDB();
		String[] content = new String[15];
		try {
			content = db.getArea("1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String para = content[2];
		req.setAttribute("para",para);
		
		//Sets the choices
		for(int i = 3; i < 9; i++){
			System.out.println(content[i]);
			req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
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