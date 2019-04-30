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
	}
}
