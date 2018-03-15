package model;

import java.util.ArrayList;

import entity.Area;
import entity.Item;
import entity.LocationType;



public class Game {
	
	private String open;
	
	private ArrayList<Item> houseItems = new ArrayList<Item>();
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
	
	
	public Area getHouse() {
		return house;
	}
	public Area getHospital() {
		return hospital;
	}
	public Area getChurch() {
		return church;
	}
	public Area getSchool() {
		return school;
	}
	public Area getBrokenDownCar() {
		return brokenDownCar;
	}
	public Area getRestaurant() {
		return restaurant;
	}
	public Area getOpenManHoleCover() {
		return openManholeCover;
	}
	public Area getSheetz() {
		return sheetz;
	}
	public Area getGroceryStore() {
		return groceryStore;
	}
	public void setLocation(LocationType locationType, ArrayList<Item> items) {
		this.location = new Area(locationType, items);
	}
	public Area getLocation() {
		return location;
	}

	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}




}

