package com.teamplato.plato.service;

public class Teacher {
    private final static String CALCO_DOMAIN = "@calco.nl";

    private int number;
    private String name;
    private String email;

    //create empty constructor
    public Teacher() {

    }

    public Teacher(String name) {
        //concat name and add domain.
        this(name, name.replaceFirst(" ", ".").replaceAll(" ", "").concat(CALCO_DOMAIN));
    }

    //create constructor
    public Teacher(String name, String email) {
        this.setName(name);
        this.setEmail(email);

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name;
    }
}
