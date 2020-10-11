/*
 * DUMMY DATABASE, BASICALLY THIS IS THE TEACHER TABLE IN SQL!!!
 */
package com.teamplato.plato.database_dummy;

import java.util.ArrayList;
import com.teamplato.plato.service.*;

/**
 *
 * @author nicks
 */
public class DatabaseDummy {
    private static DatabaseDummy dummyData = null;

    //the resultset from the database
    private static ArrayList<Teacher> teacherTable = new ArrayList<Teacher>();
    private static ArrayList<Course> courseTable = new ArrayList<Course>();
    private static ArrayList<Room> roomTable = new ArrayList<Room>();
    private static ArrayList<Group> groupTable = new ArrayList<Group>();

    //DATABASE TEACHER OBJECTS
    private DatabaseDummy() {
         teacherTable.add(new Teacher("Senne Aarssen"));
         teacherTable.add(new Teacher("Rob Janssen"));
         teacherTable.add(new Teacher("Sietse de Kok"));
         teacherTable.add(new Teacher("Thijme Langelaar"));
         teacherTable.add(new Teacher("Marjolein Piek"));
         teacherTable.add(new Teacher("Frederico van der Post"));
         teacherTable.add(new Teacher("Stef Snijder"));
         teacherTable.add(new Teacher("Dominick Vietor"));
         teacherTable.add(new Teacher("Nick Stad"));

         courseTable.add(new Course("Python"));
         courseTable.add(new Course("C#"));
         courseTable.add(new Course("Design"));
         courseTable.add(new Course("SQL"));
         courseTable.add(new Course("Agile"));

         roomTable.add(new Room("Rabobank"));
         roomTable.add(new Room("ING"));
         roomTable.add(new Room("de Volksbank"));
         roomTable.add(new Room("Fujitsu"));

         groupTable.add(new Group("Groep 1"));
         groupTable.add(new Group("Groep 2"));
    }

    public static DatabaseDummy getInstance(){
        if (dummyData == null){
            //lazy loading
            dummyData = new DatabaseDummy();
        }
        return dummyData;
    }

    //Return table from database
    public ArrayList<Teacher> getTeacherList(){
        return teacherTable;
    }

    public ArrayList<Course> getCourseList(){
        return courseTable;
    }

    public ArrayList<Room> getRoomList(){
        return roomTable;
    }

    public ArrayList<Group> getGroupList(){
        return groupTable;
    }

}
