package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gamePersist.DatabaseProvider;
import gamePersist.DerbyDatabase;
import gamePersist.IDatabase;

public class HealthServlet extends HttpServlet {
	
	
	int size = 0;

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example ---- CITING
		IDatabase db = DatabaseProvider.getInstance();
		
		System.out.println("Health Servlet: doGet");
		
		try {
			size = db.getHealthSize();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		req.setAttribute("size", size); // sets size to be used in jsp
		
		req.getRequestDispatcher("/_view/health.jsp").forward(req, resp); ///// put in multiple images of maps with each with different prgress corresponding to the users progress
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("health Servlet: doPost");
		
		//checks if account it a real account
		//FakeUserDB db = new FakeUserDB(); fake database
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example-- CITING
		IDatabase db = DatabaseProvider.getInstance();
		
		
		
		
			req.getRequestDispatcher("/_view/health.jsp").forward(req, resp);
		
		
	}

}
