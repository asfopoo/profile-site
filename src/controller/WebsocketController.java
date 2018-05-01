package controller;

import java.io.DataInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebsocketController {
	String scoreData = null;
	public void startServer(int portNum) throws Exception{
		 try {
	         ServerSocket srvr = new ServerSocket(1234);
	         Socket skt = srvr.accept();
	         System.out.print("Server has connected!\n");
	        // DataInputStream in = new DataInputStream(skt.getInputStream());
	        // scoreData = in.toString();
	        // skt.close();
	       //  srvr.close();
	      }
	      catch(Exception e) {
	         System.out.println("OOPSIE WOOPSIE!! Uwu We made a fucky wucky!! A wittle fucko boingo! The code monkeys at our headquarters are working VEWY HAWD to fix this!");
	      }
		}
	
	public String getData(){
		return scoreData;
	}
}
