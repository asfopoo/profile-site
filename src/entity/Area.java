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
	
	public Area(String name, String para, String opt1, String opt2, String opt3, String opt4, String opt5, String opt6) {
		this.name = name;
		this.para = para;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.opt5 = opt5;
		this.opt6 = opt6;
	}
	
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
	

}	

