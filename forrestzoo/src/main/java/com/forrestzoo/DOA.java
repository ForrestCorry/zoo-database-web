package com.forrestzoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class DOA {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/?user=root$autoReconnect=true&useSSL=false";
	static final String USER = "root";
	static final String PASSWORD = "root";

	static Connection CONN = null;
	static Statement STMT = null;
	static PreparedStatement PREP_STMT = null;
	static ResultSet RES_SET = null;

	static Scanner sc = new Scanner(System.in);

	public static void connToDB() {

		try {
			
			Class.forName(JDBC_DRIVER);
			
			
			System.out.println("Trying to connect to the Database...");
			CONN = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			System.out.println("Connected to the Database");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Failed to connect to the Database");
			e.printStackTrace();
		}

	}

	public static void readFromDB() {

		connToDB();
		ArrayList<Animals> ourAnimals = new ArrayList<>();

		try {
			STMT = CONN.createStatement();
			RES_SET = STMT.executeQuery("SELECT * FROM students.animals_at_zoo;");

			while (RES_SET.next()) {
				Animals animalsInDB = new Animals();

				animalsInDB.setAnimalID(RES_SET.getInt("animal_id"));
				animalsInDB.setSpecies(RES_SET.getString("species"));
				animalsInDB.setTypeOfCage(RES_SET.getString("type_of_cage"));
				animalsInDB.setFood(RES_SET.getString("food"));
				animalsInDB.setName(RES_SET.getString("name"));
				animalsInDB.setWeight(RES_SET.getString("weight"));

				ourAnimals.add(animalsInDB);

			}

			for (Animals animal : ourAnimals) {
				System.out.println(animal.toString());
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	
	public static void writeToDB(Animals animals){
		Animals animalToAdd = new Animals();
		
		animalToAdd = animals;
		
		connToDB();
		
		try{
			PREP_STMT =CONN.prepareStatement(insertToDB);
			
			PREP_STMT.setString(1, animalToAdd.getSpecies());
			PREP_STMT.setString(2, animalToAdd.getTypeOfCage());
			PREP_STMT.setString(3, animalToAdd.getFood());
			PREP_STMT.setString(4, animalToAdd.getName());
			PREP_STMT.setString(5, animalToAdd.getWeight());
			
			System.out.println(PREP_STMT);
			
			PREP_STMT.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Animals updateDB(){
		Animals animalToUpdate = new Animals();
		
		animalToUpdate = updateAnimal();
		connToDB();
		try{
			PREP_STMT = CONN.prepareStatement(updateToDB);
			
			PREP_STMT.setString(1, animalToUpdate.getSpecies());
			PREP_STMT.setString(2, animalToUpdate.getTypeOfCage());
			PREP_STMT.setString(3, animalToUpdate.getFood());
			PREP_STMT.setString(4, animalToUpdate.getName());
			PREP_STMT.setString(5, animalToUpdate.getWeight());
			PREP_STMT.setInt(6, animalToUpdate.getAnimalID());
			//System.out.println(PREP_STMT.toString());
			PREP_STMT.executeUpdate();
			
		} catch (SQLException e){
			e.printStackTrace();
		}
		return animalToUpdate;
	}
	
	public static Animals deleteFromDB(){
		Animals animalToDelete = new Animals();
		
		animalToDelete = deleteTheAnimal();
		connToDB();
		try{
			PREP_STMT = CONN.prepareStatement(deleteDB);
					
			PREP_STMT.setString(1, animalToDelete.getName());
			
			PREP_STMT.executeUpdate();
			
		} catch (SQLException e){
			e.printStackTrace();
		}
		return animalToDelete;
	}
	
	public static Animals deleteTheAnimal(){
		Animals animalToDelete = new Animals();
		
		System.out.println("What is the name of the animal you wish to delete?");
		animalToDelete.setName(sc.nextLine());
		
		
		return animalToDelete;
	}
	
	private static String insertToDB = "INSERT INTO students.animals_at_zoo"
			+ "(species, type_of_cage, food, name, weight)"
			+ "VALUES"
			+ "(?, ?, ?, ?, ?)";
	
	private static String updateToDB = "UPDATE students.animals_at_zoo"
			+ " SET species=?, type_of_cage=?, food=?, name=?, weight=? WHERE animal_id = ?";
				
	
	private static String deleteDB = ("DELETE FROM students.animals_at_zoo WHERE name = ?");
	
public static Animals aboutTheAnimal(){
		
		Animals animalToAdd = new Animals();
		
		System.out.println("What is the Species of the Animal?");
		animalToAdd.setSpecies(sc.nextLine());
		
		System.out.println("What type of Habitat does the " + animalToAdd.getSpecies() + " live in?");
		animalToAdd.setTypeOfCage(sc.nextLine());
		
		System.out.println("What food does your "+ animalToAdd.getSpecies() + " eat");
		animalToAdd.setFood(sc.nextLine());
		
		System.out.println("What is your " + animalToAdd.getSpecies() + " name?");
		animalToAdd.setName(sc.nextLine());
		
		System.out.println("What does your " + animalToAdd.getSpecies() + " weigh?");
		animalToAdd.setWeight(sc.nextLine());
		
		return animalToAdd;
		
		
	}

public static Animals updateAnimal(){
	
	Animals animalToUpdate = new Animals();
	
	System.out.println("What is the Species of the Animal?");
	animalToUpdate.setSpecies(sc.nextLine());
	
	System.out.println("What type of Habitat does the " + animalToUpdate.getSpecies() + " live in?");
	animalToUpdate.setTypeOfCage(sc.nextLine());
	
	System.out.println("What food does your "+ animalToUpdate.getSpecies() + " eat");
	animalToUpdate.setFood(sc.nextLine());
	
	System.out.println("What is your " + animalToUpdate.getSpecies() + " name?");
	animalToUpdate.setName(sc.nextLine());
	
	System.out.println("What does your " + animalToUpdate.getSpecies() + " weigh?");
	animalToUpdate.setWeight(sc.nextLine());
	
	System.out.println("What is the ID of the animal you wish to update?");
	animalToUpdate.setAnimalID(Integer.parseInt(sc.nextLine()));
	
	return animalToUpdate;
	
	
}

}
