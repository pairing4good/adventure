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
		
		System.out.println("[1] Go to the store.");
		System.out.println("[2] Go into the forest.");
		System.out.println("[3] Talk to the townspeople.");
		
		int input = scanner.nextInt();
		
		if(input == 1) {
			System.out.println("You bought a health potion and restored some health.");
			money -= 1;
			health += 1;
			
		}else if(input == 2) {
			System.out.println("You discovered treasure in the forest after a long day of hiking.");
			money += 1;
			health -= 1;
		}else if(input == 3){
			System.out.println("The townspeople say hi.");
		}
	}
}
