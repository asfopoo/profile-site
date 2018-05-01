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

public class LineParaServlet extends HttpServlet {
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
		
		try        
		{
		    Thread.sleep(10000);// delays text
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
		
		
//		username = (String) req.getSession().getAttribute("username"); //session stuff
		
//		if(username == null) {
//			req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
//		}
//		else 
		//{
			System.out.println("Linepara Servlet: doGet");
			
			
					rand = new Random();
					level = (String.valueOf(rand.nextInt(13) + 1)); // gets random numver and sets to level
					
					System.out.println(level);
					
					
					
					
					if(level.equals("1") || level.equals("3")) {
						System.out.println("if kdjfljs");
						try {
							
							db.updateHealth(db.getHealthSize() - 1);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else if(level.equals("2")) {
						System.out.println("if kdjfljs");
						try {
							db.updateHealth(db.getHealthSize() - 3);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
					try {
						
						content = db.getLinearArea((String.valueOf(level))); //gets that random line from from the linear area table
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					String para = content.get(2);
					req.setAttribute("para", para); //sets para attribute to be used in jsp
					
					

				//}
				page = "linePara.jsp"; // different way to set the page forward address
		
				
				req.getRequestDispatcher("/_view/" + page).forward(req, resp);
				count++;
				
				
			}			
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("LinePara Servlet: doPost");
		
		
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example-- CITING
		IDatabase db = DatabaseProvider.getInstance();
		
		
		
		
			req.getRequestDispatcher("/_view/linePara.jsp").forward(req, resp);
		
		
	}

}
