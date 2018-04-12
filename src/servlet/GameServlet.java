package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.AbstractDocument.Content;

import fakeDB.FakeAreaDB;
import gamePersist.DatabaseProvider;
import gamePersist.DerbyDatabase;
import gamePersist.IDatabase;


public class GameServlet extends HttpServlet {
	public int level = 1;
	private static final long serialVersionUID = 1L;
	public boolean post = false;
	public String[] content = new String[16];
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		post = false;
		System.out.println("Game Servlet: doGet");
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example ---- CITING
		IDatabase db = DatabaseProvider.getInstance();
		//FakeAreaDB db2 = new FakeAreaDB();
		
		try {
			content = db.getArea(Integer.toString(level));
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
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example ---- CITING
		IDatabase db = DatabaseProvider.getInstance();
		String area = "bedroom"; //should be handled privately in the model!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		post = true;
		String choice = null;
		System.out.println("Game Servlet: doPost");
		choice = req.getParameter("choice");
		System.out.println("choice= " + choice);
		if (area.equals("bedroom")) {
			System.out.println(area);
			if (choice.equals("1")) { //parameter from post form 
				try {
					content = db.getArea(Integer.toString(2)); //gets second line of csv
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2]; //gets second section (paragraph section) of the line in csv
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
					area = "dresser"; // change the area
					System.out.println(area);
				}	
			}
			else if (choice.equals("2")) {
				try {
					content = db.getArea(Integer.toString(3));///NOTE: does not correlate direclty to choice value
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2];
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
				}
			}
			else if (choice.equals("3")) {
				try {
					content = db.getArea(Integer.toString(4));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2];
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
				}
			}
			else if (choice.equals("4")) {
				try {
					content = db.getArea(Integer.toString(5));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2];
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
				}
			}
			else if (choice.equals("5")) {
				try {
					content = db.getArea(Integer.toString(6));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2];
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
				}
			}
			else if (choice.equals("6")) {
				try {
					content = db.getArea(Integer.toString(7));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2];
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
				}
			}
		}
		else if(area.equals("dresser")) {
			System.out.println(area);
			if (choice.equals("1")) { //parameter from post form 
				try {
					content = db.getArea(Integer.toString(8)); //gets second line of csv
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2]; //gets second section (paragraph section) of the line in csv
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
					area = "bedroom";// change the area
				}	
			}
		}
			
		
		req.getRequestDispatcher("/_view/game.jsp").forward(req, resp);
	}
}