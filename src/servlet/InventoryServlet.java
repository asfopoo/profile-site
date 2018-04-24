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

public class InventoryServlet extends HttpServlet {
	public String level = null;
	private String username = null;
	public boolean post = false;
	public ArrayList<String> items = new ArrayList<String>();
	public ArrayList<Integer> size = new ArrayList<Integer>();
	int sieze;

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		username = (String) req.getSession().getAttribute("username"); //session stuff
		
		if(username == null) {
			req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
		}
		else {
		
		post = false;
		System.out.println("Login Servlet: doGet");
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example ---- CITING
		IDatabase db = DatabaseProvider.getInstance();
		
		
		try {
			items = db.getInventory();
			size = db.getInventorySize();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0; i < size.size(); i++) { //adds inventory sizes
			sieze += size.get(i);
		}
		
		req.setAttribute("items", items); //sets items to be used in jsp
		req.setAttribute("size", sieze); // sets size to be used in jsp
		
		
		req.getRequestDispatcher("/_view/inventory.jsp").forward(req, resp);
		}	
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Login Servlet: doPost");
		
		//checks if account it a real account
		//FakeUserDB db = new FakeUserDB(); fake database
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example-- CITING
		IDatabase db = DatabaseProvider.getInstance();
		
		
		
		
			req.getRequestDispatcher("/_view/inventory.jsp").forward(req, resp);
		
		
	}

}

