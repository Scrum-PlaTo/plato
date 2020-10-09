/*
 * DUMMY DATABASE, BASICALLY THIS IS THE TEACHER TABLE IN SQL!!!
 */
package com.teamplato.plato.database_dummy;

import java.util.ArrayList;
import com.teamplato.plato.bol.Teacher;

/**
 *
 * @author nicks
 */
public class DatabaseDummy {
    
    //the resultset from the database
    private static ArrayList<Teacher> teacherTable = new ArrayList<Teacher>();
   
    //DATABASE TEACHER OBJECTS
    public DatabaseDummy() {
         teacherTable.add(new Teacher("Senne Aarssen"));
         teacherTable.add(new Teacher("Rob Janssen"));
         teacherTable.add(new Teacher("Sietse de Kok"));
         teacherTable.add(new Teacher("Thijme Langelaar"));
         teacherTable.add(new Teacher("Marjolein Piek"));
         teacherTable.add(new Teacher("Frederico van der Post"));
         teacherTable.add(new Teacher("Stef Snijder"));
         teacherTable.add(new Teacher("Dominick Vietor"));
         teacherTable.add(new Teacher("Nick Stad"));
    }
    
    //Return table from database
    public ArrayList<Teacher> getTeacherList(){
        return teacherTable;
    }
    
}
