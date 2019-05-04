package com.pairgood.adventure;

public class Player extends Entity {

	private String name;
	private double money;
	
	public Player(String name) {
		this.name = name;
		setHealth(10);
		setMoney(19.99);
	}

	public String getName() {
		return name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public void modifyMoney(double money) {
		this.money += money;
	}
}
