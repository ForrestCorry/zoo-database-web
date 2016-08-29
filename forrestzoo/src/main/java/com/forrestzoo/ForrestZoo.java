package com.forrestzoo;

import java.util.Scanner;

public class ForrestZoo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String userMenuInput = null;
		boolean menuCorrect = false;

		System.out.println("Welcome to the Zoo information program");

		do {
			System.out.println("Press 1 to read the DB" + "\nPress 2 to Add to the database"
					+ "\nPress 3 to Update an Animal from the database"
					+ "\nPress 4 to Delete an Animal from the database");
			userMenuInput = sc.nextLine();
			
			switch (userMenuInput) {
			case "1":
				DOA.readFromDB();
				break;
			case "2":
				DOA.writeToDB();
				DOA.readFromDB();
				break;
			case "3":
				DOA.updateDB();
				DOA.readFromDB();
				break;
			case "4":
				DOA.deleteFromDB();
				DOA.readFromDB();
				break;
			default:
				System.out.println("You've entered an invalid option");
				menuCorrect = true;
				break;
			}
		} while (menuCorrect);

	}

}
