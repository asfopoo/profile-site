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
		

		String[] options = new String[13];
		// gets username and password
		String name = req.getParameter("name");
		String para = req.getParameter("para");
		options[0] = req.getParameter("o1");
		options[1] = req.getParameter("o2");
		options[2] = req.getParameter("o3");
		options[3] = req.getParameter("o4");
		options[4] = req.getParameter("o5");
		options[5] = req.getParameter("o6");
		options[6] = req.getParameter("ln1");
		options[7] = req.getParameter("ln2");
		options[8] = req.getParameter("ln3");
		options[9] = req.getParameter("ln4");
		options[10] = req.getParameter("ln5");
		options[11] = req.getParameter("ln6");
		options[12] = req.getParameter("pic");
		
		try {
			db.createArea(name, para, options);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/editor.jsp").forward(req, resp);
		System.out.println("Editor Servlet: Edit Successful");

		//System.out.println(first + second);
		
	}

}


