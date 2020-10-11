package com.teamplato.plato.service;

import java.time.*;

public class Course {
    private final static int DEFAULT_COURSE_CODE = 001;
    private final static String DEFAULT_NAME = "Python";
    private final static int DEFAULT_DAY_NUMBER = 20;
    private final static String DEFAULT_START_TIME = "09:00";
    private final static int DEFAULT_DURATION = 3;

    private int number;
    private int courseCode;
    private String name;
    private int dayNumber;
    private LocalTime startTime;
    private Duration duration;

    public Course() {
        this(DEFAULT_COURSE_CODE);
    }

    public Course(int courseCode) {
        this(courseCode, DEFAULT_NAME);
    }

    public Course(String name) {
        this(DEFAULT_COURSE_CODE, name);
    }

    public Course(int courseCode, String name) {
        this(courseCode, name, DEFAULT_DAY_NUMBER);
    }

    public Course(int courseCode, String name, int dayNumber) {
        this(courseCode, name, dayNumber, DEFAULT_START_TIME);
    }

    public Course(int courseCode, String name, int dayNumber, String startTime) {
        this(courseCode, name, dayNumber, startTime, DEFAULT_DURATION);
    }

    public Course(int courseCode, String name, int dayNumber, String startTime, int hours) {
        this.setCourseCode(courseCode);
        this.setName(name);
        this.setDayNumber(dayNumber);
        this.setStartTime(startTime);
        this.setDuration(hours);
    }

    public int getNumber() {
        return number;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
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

    public void setStartTime(String startTime) {
        this.startTime = LocalTime.parse(startTime);
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(int hours) {
        this.duration = Duration.ofHours(hours);
    }

    public void setDuration(int hours, int minutes) {
        this.duration = Duration.ofMinutes(minutes + (hours * 60));
    }

    @Override
    public String toString(){
        return name;
    }

}
