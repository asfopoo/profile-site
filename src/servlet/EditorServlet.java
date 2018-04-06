package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gamePersist.DatabaseProvider;
import gamePersist.IDatabase;
import fakeDB.FakeUserDB;
import gamePersist.DerbyDatabase;

public class EditorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Editor Servlet: doGet");
		
		req.getRequestDispatcher("/_view/editor.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Editor Servlet: doPost");
		
		//checks if account it a real account
		//fake db stuff//FakeUserDB db = new FakeUserDB();
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example ---- CITING
		IDatabase db = DatabaseProvider.getInstance();
		

		// gets username and password
		String name = req.getParameter("name");
		String para = req.getParameter("para");
		String option1 = req.getParameter("o1");
		String option2 = req.getParameter("o2");
		String option3 = req.getParameter("o3");
		String option4 = req.getParameter("o4");
		String option5 = req.getParameter("o5");
		String option6 = req.getParameter("o6");
		

		

		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/editor.jsp").forward(req, resp);
		System.out.println("Editor Servlet: Edit Successful");

		//System.out.println(first + second);
		
	}

}


