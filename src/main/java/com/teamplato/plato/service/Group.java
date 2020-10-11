package com.teamplato.plato.service;

public class Group {
    private final static String DEFAULT_NAME = "Groep 1";
    private final static int DEFAULT_PEOPLE = 8;

    private int number;
    private String name;
    private int amountOfPeople;

    public Group() {
        this(DEFAULT_NAME);
    }

    public Group(String name) {
        this(name, DEFAULT_PEOPLE);
    }

    public Group(String name, int amountOfPeople) {
        this.setName(name);
        this.setAmountOfPeople(amountOfPeople);
    }

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

    public String toString(){
        return name;
    }

}
