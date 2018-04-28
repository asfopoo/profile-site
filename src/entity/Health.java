package entity;

import java.util.ArrayList;

public class Health {
	private String health;
	private int healthInventoryId;
	
	public Health(String health) {
		this.health = health;
	}

	public void setHealthInventoryId(int healthInventoryId) {
		this.healthInventoryId = healthInventoryId;
	}
	public int getHealthInventoryId() {
		return healthInventoryId;
	}
	public void setHealth(String health) {
		this.health = health;
	}	
	public String getHealth() {
		return health;
	}
}	