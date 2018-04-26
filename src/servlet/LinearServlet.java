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
		
		
		username = (String) req.getSession().getAttribute("username"); //session stuff
		
		if(username == null) {
			req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
		}
		else {
			System.out.println("Linear Servlet: doGet");
			
			while(line == true) {
				System.out.println(count);
				
				if(count == 0) {
					page = "linePara.jsp";
					
				}
				else if(count%2 == 1) {
					// need to display no message
					page = "linear.jsp";
					
				}
				else if(count%2 == 0) {
					rand = new Random();
					//level = rand.nextInt(25+1);
					level = "3"; ///////////////////needs changed to random and new table
					
					//need to display random message
					try {
						content = db.getArea(level);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					String para = content.get(2);
					req.setAttribute("para",para);
					page = "linePara.jsp";
					

				
				}
				
				req.getRequestDispatcher("/_view/" + page).forward(req, resp);
				count++;
				
				try{  
					Thread.sleep(4000);// delays text  
				}   
				catch(InterruptedException ex){  
					Thread.currentThread().interrupt();  
				}
			}			
			
					
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


