package com.teamplato.plato.bol;

public class Room {
	private int number;
	private int roomNO;
	private String name;
	private int capacity;

	// create empty constructor
	public Room() {
	};

	// create constructor
	public Room(int number, int roomNO, String name, int capacity) {
		this.setNumber(number);
		this.setRoomNO(roomNO);
		this.setName(name);
		this.setCapacity(capacity);
	}

	// getters en setters
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getRoomNO() {
		return roomNO;
	}

	public void setRoomNO(int roomNO) {
		this.roomNO = roomNO;
	}

}
