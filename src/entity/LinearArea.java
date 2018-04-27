package entity;

import java.util.ArrayList;

public class LinearArea {
	private String name;
	private String para;
	private int linearAreaInventoryId;
	
	public LinearArea(String name, String para) {
		this.name = name;
		this.para = para;
		
	}
	
	public void setLinearAreaInventoryId(int areaInventoryId) {
		this.linearAreaInventoryId = linearAreaInventoryId;
	}
	public int getLinearAreaInventoryId() {
		return linearAreaInventoryId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPara(String para) {
		this.para = para;
	}
	
	public String getName() {
		return name;
	}
	public String getPara() {
		return para;
	}

	

}
