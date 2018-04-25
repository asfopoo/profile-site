package servlet;

import java.io.IOException;
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
	int level = 0;
	
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		username = (String) req.getSession().getAttribute("username"); //session stuff
		
		if(username == null) {
			req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
		}
		else {
			System.out.println("Linear Servlet: doGet");
			
			//while(line == true) {
				req.getRequestDispatcher("/_view/linear.jsp").forward(req, resp);
				/*try        
				{
				    Thread.sleep(6000);// delays text
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				rand = new Random();
				level = rand.nextInt(50);
				req.setAttribute("para", level);
				
				req.getRequestDispatcher("/_view/linePara.jsp").forward(req, resp);
				
				try        
				{
				    Thread.sleep(6000);// delays text
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
			}  */
		} 
	}	
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Linear Servlet: doPost");
		
		//checks if account it a real account
		//FakeUserDB db = new FakeUserDB(); fake database
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example-- CITING
		IDatabase db = DatabaseProvider.getInstance();
		
		
		
		
			req.getRequestDispatcher("/_view/linear.jsp").forward(req, resp);
		
		
	}

}


