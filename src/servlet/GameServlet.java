package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.AbstractDocument.Content;

import controller.GameController;
import fakeDB.FakeAreaDB;
import gamePersist.DatabaseProvider;
import gamePersist.DerbyDatabase;
import gamePersist.IDatabase;
import model.Game;


public class GameServlet extends HttpServlet {
	public int level = 1;
	private static final long serialVersionUID = 1L;
	public boolean post = false;
	public ArrayList<String> content = new ArrayList<String>();
	public ArrayList<String> select = new ArrayList<String>();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String username = (String) req.getSession().getAttribute("username");
		if(username == null) {
			req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
		}
		else {
		
		
			//checks if it is post
			post = false;
			System.out.println("Game Servlet: doGet");
			
			//Accessing database
			DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example ---- CITING
			IDatabase db = DatabaseProvider.getInstance();
			//FakeAreaDB db2 = new FakeAreaDB();
			
			//Pulling the level content from database based on level id
			try {
				content = db.getArea(Integer.toString(level));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Print out the picture
			String pic = content.get(15);
			req.setAttribute("pic",pic);
					
			//Print out all of the content
			String para = content.get(2);
			req.setAttribute("para",para);
			
			//Sets the choices
			for(int i = 3; i < 9; i++){
				if(content.get(i).equals("*")){
					req.setAttribute("q" + (i - 2)," ");
				}else{
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content.get(i));
				}
				
			}

		
			req.getRequestDispatcher("/_view/game.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example ---- CITING
		IDatabase db = DatabaseProvider.getInstance();
		
		Game model = new Game();
		GameController controller = new GameController();
		
		post = true;
		String choice = null;
		System.out.println("Game Servlet: doPost");
		choice = req.getParameter("choice");
		System.out.println("choice= " + choice);
		System.out.println("db loaction = " + db.getPlayerLocation());
		
		
		//Takes users choice and loads next area, each choice has an area id tied to it
		try {
			select = db.getNextArea(Integer.toString(level)); //gets second line of csv
			//System.out.println(select + "*********************************");
			String nextAreaNumber = select.get(Integer.parseInt(choice)+8);
			//System.out.println(nextAreaNumber + "*********************************");
			//checking for item
			if(nextAreaNumber.indexOf('&') != -1){
				String item = nextAreaNumber.substring(nextAreaNumber.indexOf('&') + 1);
				nextAreaNumber = nextAreaNumber.substring(0, nextAreaNumber.indexOf('&'));
				System.out.println("There is an item, here is the name and next area" + item + ", " + nextAreaNumber);
				
				//lazy way of adding the correct item
				if(item.equalsIgnoreCase("lighter")){
					controller.addItem(model.getLighter()); //Added lighter to users inventory
				}else if(item.equalsIgnoreCase("bandaids")){
					controller.addItem(model.getBandAids()); //Added lighter to users inventory
				}
			}
			level = Integer.parseInt(nextAreaNumber);
			content = db.getArea(Integer.toString(level));
			select = db.getNextArea(Integer.toString(level)); //gets second line of csv
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Print out the picture
		String pic = content.get(15);
		req.setAttribute("pic",pic);
				
		//Displays the areas content
		String para = select.get(2); //gets second section (paragraph section) of the line in csv
		req.setAttribute("para",para);
		
		//Sets the choices
		for(int i = 3; i < 9; i++){
			if(content.get(i).equals("*")){
				req.setAttribute("q" + (i - 2)," ");
			}else{
				req.setAttribute("q" + (i - 2), (i - 2) + ": " + select.get(i));
			}
			//req.setAttribute("q" + (i - 2), (i - 2) + ": " + select.get(i));
			
		}
		db.insertPlayerLocation(select.get(1)); // change the area
			
		
		req.getRequestDispatcher("/_view/game.jsp").forward(req, resp);
	}
}