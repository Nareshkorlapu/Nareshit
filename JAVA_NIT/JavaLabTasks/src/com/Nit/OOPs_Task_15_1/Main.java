package com.Nit.OOPs_Task_15_1;

public class Main
{
	public static void main(String[] args)
	{
		Dog d = new Dog("Buddy",true,"Golden Retreiver");
		System.out.println(d);
		
	}
}

class Animal {

	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Mammal extends Animal
{
	private boolean hasFur;

	public Mammal(String name, boolean hasFur) {
		super(name);
		this.hasFur = hasFur;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
}

class Dog extends Mammal
{
	private String breed;

	public Dog(String name, boolean hasFur, String breed) {
		super(name, hasFur);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Animal Name:"+getName()+"\nHas Fur:"+isHasFur()+"\nBreed:"+breed;
	}
	
}


