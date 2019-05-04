package com.pairgood.adventure;

import java.util.Random;
import java.util.Scanner;;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();

		print("What is your name?");
		
		String name = scanner.nextLine();
		
		Player player = new Player(name);
		
		
		print("Welcome to Adventure" + name + "!");
		
		int input;
		 
		do {
			System.out.println("[0] Quit.");
			System.out.println("[1] Go to the store.");
			System.out.println("[2] Go into the forest.");
			System.out.println("[3] Talk to the townspeople.");
			
			input = scanner.nextInt();
			
			if(input == 0) {
				continue;
				
			}else if(input == 1) {
				if(player.getMoney() - 1 < 0) {
					print("You don't have enough money.");
					continue;
				}
				
				if(player.getHealth() + 1 > 10) {
					print("You have max health.");
					continue;
				}
				
				print("You bought a health potion and restored some health.");
				player.modifyMoney(-1);
				player.modifyHeath(+1);
				
			}else if(input == 2) {
	
				if(player.getHealth() - 1 < 0) {
					print("You don't have enough health.");
					continue;
				}
				
				Entity monster = new Monster(1);
				
				print("You discovered treasure in the forest after a long day of hiking.");
				player.modifyMoney(+1);
				player.modifyHeath(-1);
			}else if(input == 3){
				String[] messages = new String[] {
					"Hey there.",
					"How are you today?",
					"Nice weather we've been having!",
					"This game is amazing! Oops, I just broke the fourth wall."
				};
				
				print(messages[random.nextInt(messages.length)]);
			}else {
				print("Invalid item.");
			}
		} while(input != 0);
	}
	
	public static void print(String message) {
		System.out.println("Adventure: " + message);
	}
}
