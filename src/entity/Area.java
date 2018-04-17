package entity;

import java.util.ArrayList;


//
public class Area {
	private String name;
	private String para;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private String opt5;
	private String opt6;
	private String lnk1;
	private String lnk2;
	private String lnk3;
	private String lnk4;
	private String lnk5;
	private String lnk6;
	private String picture;
	private int areaInventoryId;
	

	//private LocationType locationType;
	//private ArrayList<Item> items = new ArrayList<Item>();
	
	
	//public Area(LocationType locationType, ArrayList<Item> items) {
		//this.locationType = locationType;
		
	//}
	
	//public void setLocationType(LocationType locationType) {
		//this.locationType = locationType;
	//}
	
	//public LocationType getLocationType() {
		//return locationType;
	//}
	
	//public void addItem(Item item) {
		//items.add(item);
		
	//}
	
	public Area(String name, String para, String opt1, String opt2, String opt3, String opt4, String opt5, String opt6, String lnk1, String lnk2, String lnk3, String lnk4, String lnk5, String lnk6, String picture) {
		this.name = name;
		this.para = para;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.opt5 = opt5;
		this.opt6 = opt6;
		this.lnk1 = lnk1;
		this.lnk2 = lnk2;
		this.lnk3 = lnk3;
		this.lnk4 = lnk4;
		this.lnk5 = lnk5;
		this.lnk6 = lnk6;
		this.picture = picture;
	}
	
	/*
	 * SETTERS
	 */
	public void setAreaInventoryId(int areaInventoryId) {
		this.areaInventoryId = areaInventoryId;
	}
	public int getAreaInventoryId() {
		return areaInventoryId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPara(String para) {
		this.para = para;
	}
	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}
	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}
	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}
	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}
	public void setOpt5(String opt5) {
		this.opt5 = opt5;
	}
	public void setOpt6(String opt6) {
		this.opt6 = opt6;
	}
	public void setLnk1(String lnk1) {
		this.lnk1 = lnk1;
	}
	public void setLnk2(String lnk2) {
		this.lnk2 = lnk2;
	}
	public void setLnk3(String lnk3) {
		this.lnk3 = lnk3;
	}
	public void setLnk4(String lnk4) {
		this.lnk4 = lnk4;
	}
	public void setLnk5(String lnk5) {
		this.lnk5 = lnk5;
	}
	public void setLnk6(String lnk6) {
		this.lnk6 = lnk6;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/*
	 *GETTERS
	 */
	public String getName() {
		return name;
	}
	public String getPara() {
		return para;
	}
	public String getOpt1() {
		return opt1;
	}
	public String getOpt2() {
		return opt2;
	}
	public String getOpt3() {
		return opt3;
	}
	public String getOpt4() {
		return opt4;
	}
	public String getOpt5() {
		return opt5;
	}
	public String getOpt6() {
		return opt6;
	}
	public String getLnk1() {
		return lnk1;
	}
	public String getLnk2() {
		return lnk2;
	}
	public String getLnk3() {
		return lnk3;
	}
	public String getLnk4() {
		return lnk4;
	}
	public String getLnk5() {
		return lnk5;
	}
	public String getLnk6() {
		return lnk6;
	}
	public String getPicture() {
		return picture;
	}


}	

