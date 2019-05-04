package com.pairgood.adventure;

public abstract class Entity implements Damageable{

	private int health;

	public Entity(int health) {
		this.health = health;
	}
	
	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public void modifyHeath(int health) {
		this.health += health;
	}
	
	public abstract String getType();
}
