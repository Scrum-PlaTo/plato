package com.teamplato.plato.bol;

public class Teacher {

	private int number; 
	private String name; 
	private String email;

	//create empty constructor 
	public Teacher() {
		
	};
        
        public Teacher(String name) {
            this.setName(name);
        }
	
	//create constructor 
	public Teacher(int number, String name, String email) {
		
		this.setNumber(number);
		this.setName(name); 
		this.setEmail(email); 
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	};	
        
        @Override
        public String toString() {
            return name;
        }
		
}
