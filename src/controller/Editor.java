package controller;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Item;
import entity.LocationType;
import model.Game;
	



public class Editor {

	public static void Edit(Game model) {
	
	Scanner keyboard = new Scanner(System.in);
	ArrayList <Item> items = new ArrayList<Item>(); // needs fixed
	
	model.setLocation(LocationType.START, items); // must pass in a populated array list
	
	if(model.getLocation().getLocationType() == LocationType.START) {
		
		String open = "There is a tv on....\n " //put in a delay // maybe one letter at a time like a ticker
				+ ".... in local news today, there was a recent outbreak of the mutated rabies virus that \n"
				+ "has been causing mass hysteria.  If infected, the virus causes high fever quickly followed\n"
				+ " by some form of psychosis.  Authorities are still looking into the origin , but everyone \n"
				+ "is urged to stay inside and lock all doors and windows.  The infected are considered extremely \n"
				+ "dangerous!!!!";
		
		model.setOpen(open);
		
		try        
		{
		    Thread.sleep(10000);// delays text
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
		
		System.out.println("\nYou have just woken up!!!\n"// narrated
				+ "How did I sleep so long?\n" // player
				+ "What time is it?"
				+ "\n... screw sitting around this place, im getting outta here!!!!!"
				+ "\nGrab what you need and get on the road, keep in mind, you can ony take what you can carry");//narrated
		
		System.out.println("You are in your bedroom"
				+ "\nThere are two dressers a bed and a tv\n");
		
		try        
		{
		    Thread.sleep(10000);
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
		
		System.out.println("What do you want to do?"
				+ "\n1. check the first dresser"
				+ "\n2. check the second dresser"
				+ "\n3. check the bed"
				+ "\n4. make the bed"
				+ "\n5. turn the tv off"
				+ "\n6. leave the room"
				+ "\n\n which number do you want?");
		
		int choice = keyboard.nextInt();
		if(choice < 1 || choice > 6) {
			System.out.println("invalid choice, choose again");
			choice = keyboard.nextInt();
		}
		
		
		
		
		}
	
	keyboard.close();
	}
	
}

