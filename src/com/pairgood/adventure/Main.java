package com.pairgood.adventure;

import java.util.Scanner;;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int health = getMaxHealth();
		double money = 19.99;

		print("What is your name?");
		
		String name = scanner.nextLine();
		
		
		
		print("Welcome to Adventure" + name + "!");
		
		int input;
		 
		do {
			System.out.println("[0] Quit.");
			System.out.println("[1] Go to the store.");
			System.out.println("[2] Go into the forest.");
			System.out.println("[3] Talk to the townspeople.");
			System.out.println("money: " + money + ", health: " + health);
			
			input = scanner.nextInt();
			
			if(input == 0) {
				continue;
				
			}else if(input == 1) {
				if(money - 1 < 0) {
					print("You don't have enough money.");
					continue;
				}
				
				if(health + 1 > getMaxHealth()) {
					print("You have max health.");
					continue;
				}
				
				print("You bought a health potion and restored some health.");
				money -= 1;
				health += 1;
				
			}else if(input == 2) {
	
				if(health - 1 < 0) {
					print("You don't have enough health.");
					continue;
				}
				
				print("You discovered treasure in the forest after a long day of hiking.");
				money += 1;
				health -= 1;
			}else if(input == 3){
				for(int i = 0; i< 5; i++) {
					print("Someone say hi.");
				}
			}else {
				print("Invalid item.");
			}
		} while(input != 0);
	}
	
	public static void print(String message) {
		System.out.println("Adventure: " + message);
	}
	
	public static int getMaxHealth() {
		return 10;
	}
}
