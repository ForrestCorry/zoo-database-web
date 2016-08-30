package com.forrestzoo;

public class Animals {
	
	public Integer animalID = 0;
	public String species = null;
	public String typeOfCage = null;
	public String food = null;
	public String name = null;
	public String weight = null;
	
	
	


	public Animals() {
		super();
		
	}
	
	
	public Integer getAnimalID() {
		return animalID;
	}

	public void setAnimalID(Integer animalID) {
		this.animalID = animalID;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getTypeOfCage() {
		return typeOfCage;
	}

	public void setTypeOfCage(String typeOfCage) {
		this.typeOfCage = typeOfCage;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String string) {
		this.weight = string;
	}

	@Override
	public String toString() {
		return "Animals [animalID=" + animalID + ", species=" + species + ", typeOfCage=" + typeOfCage + ", food="
				+ food + ", name=" + name + ", weight=" + weight + "]";
	}
	
	
	
	
	
	

}
