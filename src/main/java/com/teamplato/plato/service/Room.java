package com.teamplato.plato.service;

public class Room {
    private final static int DEFAULT_ROOM_NO = -1;
    private final static String DEFAULT_NAME = "Rabobank";
    private final static int DEFAULT_CAPACITY = 10;

    private int number;
    private int roomNO;
    private String name;
    private int capacity;

    public Room() {
        this(DEFAULT_ROOM_NO);
    }

    public Room(int roomNO) {
        this(roomNO, DEFAULT_NAME);
    }

    public Room(String name){
        this(DEFAULT_ROOM_NO, name);
    }

    public Room(int roomNO, String name) {
        this(roomNO, name, DEFAULT_CAPACITY);
    }

    public Room(int roomNO, String name, int capacity) {
        this.setRoomNO(roomNO);
        this.setName(name);
        this.setCapacity(capacity);
    }

    public int getRoomNO(){
        return roomNO;
    }

    public void setRoomNO(int roomNO){
        this.roomNO = roomNO;
    }

    public int getNumber() {
        return number;
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

    @Override
    public String toString() {
        return name;
    }
}
