package com.teamplato.plato.bol; 

import java.time.*;

public class Course {

	private int number;
	private int courseCode;
	private String name;
	private int dayNumber;
	private LocalTime startTime;
	private Duration duration;

	// create empty constructor
	public Course() {

	}

	// create constructor
	public Course(int number, int courseCode, String name, int dayNumber, LocalTime startTime, Duration duration) {
		this.setNumber(number);
		this.setCourseCode(courseCode);
		this.setName(name);
		this.setDayNumber(dayNumber);
		this.setStartTime(startTime);
		this.setDuration(duration);
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

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public int getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

}
