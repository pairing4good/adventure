package com.pairgood.adventure;

public class Entity {

	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void modifyHeath(int health) {
		this.health += health;
	}
}
