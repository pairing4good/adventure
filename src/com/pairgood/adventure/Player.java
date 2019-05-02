package com.pairgood.adventure;

public class Player {

	private String name;
	private int health;
	private double money;
	
	public Player(String name) {
		this.name = name;
		setHealth(10);
		setMoney(19.99);
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public void modifyHeath(int health) {
		this.health += health;
	}
	
	public void modifyMoney(double money) {
		this.money += money;
	}
}
