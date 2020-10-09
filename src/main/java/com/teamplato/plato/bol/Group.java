package com.teamplato.plato.bol;

public class Group {
	private int number;
	private String name;
	private int amountOfPeople;
	
	//empty constructor
	public Group () {
	};
	
	//create constructor
	public Group (int number, String name, int amountOfPeople) {
		this.setNumber(number);
		this.setName(name);
		this.setAmountOfPeople(amountOfPeople);
	}
	//getters en setters
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmountOfPeople() {
		return amountOfPeople;
	}

	public void setAmountOfPeople(int amountOfPeople) {
		this.amountOfPeople = amountOfPeople;
	}
	
}