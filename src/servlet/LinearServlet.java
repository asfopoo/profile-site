package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gamePersist.DatabaseProvider;
import gamePersist.DerbyDatabase;
import gamePersist.IDatabase;
import gamePersist.hashSHA256;

public class LinearServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int size;
	int health;
	private Random rand;
	private String username = null;
	boolean line = true;
	String level = null;
	String page = null;
	int count = 0;
	public ArrayList<String> content = new ArrayList<String>();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example-- CITING
		IDatabase db = DatabaseProvider.getInstance();
		
		try {
			health = db.getHealthSize();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		username = (String) req.getSession().getAttribute("username"); //session stuff
		
		if(username == null) {
			req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
		} 
		else if(health < 1) {
			req.getRequestDispatcher("/_view/gameOver.jsp").forward(req, resp);
		}
		else {
			System.out.println("Linear Servlet: doGet");
	
			
			
			
			req.setAttribute("size", health); // sets size to be used in jsp

				page = "linear.jsp";
	
				
				req.getRequestDispatcher("/_view/" + page).forward(req, resp);
				count++;
	}			
				
			}			
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Linear Servlet: doPost");
		
		
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example-- CITING
		IDatabase db = DatabaseProvider.getInstance();
		
		
		
		
			req.getRequestDispatcher("/_view/linear.jsp").forward(req, resp);
		
		
	}

}


