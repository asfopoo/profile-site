package model;

import java.util.ArrayList;

import entity.Area;
import entity.Item;
import entity.LocationType;



public class Game {
	public ArrayList<Item> houseItems = new ArrayList<Item>();
	private ArrayList<Item> hospitalItems = new ArrayList<Item>();
	private ArrayList<Item> churchItems = new ArrayList<Item>();
	private ArrayList<Item> schoolItems = new ArrayList<Item>();
	private ArrayList<Item> carItems = new ArrayList<Item>();
	private ArrayList<Item> restaurantItems = new ArrayList<Item>();
	private ArrayList<Item> manCoverItems = new ArrayList<Item>();
	private ArrayList<Item> sheetzItems = new ArrayList<Item>();
	private ArrayList<Item> groceryItems = new ArrayList<Item>();
	
	private Area house;
	private Area hospital;
	private Area church;
	private Area school;
	private Area brokenDownCar;
	private Area restaurant;
	private Area openManholeCover;
	private Area sheetz;
	private Area groceryStore;
	private Area location;
	private String choice;
	
	public Game() {
		this.house = new Area(LocationType.START, houseItems);
		this.hospital = new Area(LocationType.HOSPITAL,hospitalItems);
		this.church = new Area(LocationType.CHURCH, churchItems);
		this.school = new Area(LocationType.SCHOOL, schoolItems);
		this.brokenDownCar = new Area(LocationType.BROKEN_DOWN_CAR, carItems);
		this.restaurant = new Area(LocationType.RESTAURAUNT, restaurantItems);
		this.openManholeCover = new Area(LocationType.OPEN_MANHOLE_COVER, manCoverItems);
		this.sheetz = new Area(LocationType.SHEETZ, sheetzItems);
		this.groceryStore = new Area(LocationType.GROCERY_STORE, groceryItems);
		
	}
	
	//Sets location based on type and arraylist of items
	public void setLocation(LocationType locationType, ArrayList<Item> items) {
		this.location = new Area(locationType, items);
	}
	
	//returns location
	public Area getLocation() {
		return location;
	}

	//Get choice from in game
	public String getChoice() {
		return choice;
	}
	
	//sets choice from in game
	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	//gets array of items
	public ArrayList<Item> getItems(Area location){
		ArrayList<Item> returnItem = null;
		if(location == house){
			returnItem = houseItems;
		}else if(location == hospital){
			returnItem = hospitalItems;
		}else if(location == church){
			returnItem = churchItems;
		}else if(location == school){
			returnItem = schoolItems;
		}else if(location == brokenDownCar){
			returnItem = carItems;
		}else if(location == restaurant){
			returnItem = restaurantItems;
		}else if(location == openManholeCover){
			returnItem = manCoverItems;
		}else if(location == sheetz){
			returnItem = sheetzItems;
		}else if(location == groceryStore){
			returnItem = groceryItems;
		}
		return returnItem;
	}



}

