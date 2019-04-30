package com.pairgood.adventure;

import java.util.Scanner;;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int health = 10;
		double money = 19.99;

		System.out.println("What is your name?");
		
		String name = scanner.nextLine();
		
		
		
		System.out.println("Welcome to Adventure" + name + "!");
		
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
					System.out.println("You don't have enough money.");
					continue;
				}
				
				if(health + 1 > 10) {
					System.out.println("You have max health.");
					continue;
				}
				
				System.out.println("You bought a health potion and restored some health.");
				money -= 1;
				health += 1;
				
			}else if(input == 2) {
	
				if(health - 1 > 10) {
					System.out.println("You don't have enough health.");
					continue;
				}
				
				System.out.println("You discovered treasure in the forest after a long day of hiking.");
				money += 1;
				health -= 1;
			}else if(input == 3){
				for(int i = 0; i< 5; i++) {
					System.out.println("Someone say hi.");
				}
			}else {
				System.out.println("Invalid item.");
			}
		} while(input != 0);
	}
}
