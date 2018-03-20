package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Game Servlet: doGet");
		
		//Sets paragraph above the choices
		req.setAttribute("para","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras in velit arcu. Praesent massa lorem, maximus non rhoncus eu, vulputate quis justo."
				+ " Quisque at quam aliquam, pellentesque ex nec, consectetur velit. Praesent eget libero mollis, dictum libero vitae, accumsan justo. "
				+ "Etiam urna diam, pulvinar nec justo non, dictum tempus lacus. Nam dignissim nibh luctus rutrum sagittis. Duis orci ligula, faucibus ac facilisis sit amet, "
				+ "hendrerit quis arcu. Cras varius augue augue, vel finibus eros euismod nec. Sed quis pellentesque odio. Donec vitae pharetra dolor. Phasellus sit amet quam feugiat, "
				+ "laoreet metus et, placerat elit.");
		
		//Sets the choices
		for(int i = 1; i <= 6; i++){
			req.setAttribute("q" + i, i + ": This is a test option.");
		}
		
		req.getRequestDispatcher("/_view/game.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Game Servlet: doPost");
		
		
		
		
		
		
		
		
	}
}