/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamplato.plato.dal;

import java.util.ArrayList;
import java.util.List;
import com.teamplato.plato.bol.Teacher;
import com.teamplato.plato.database_dummy.DatabaseDummy;

/**
 *
 * @author nicks
 */
public class Teachers_DAO implements DAO<Teacher> {
    
    private DatabaseDummy db = new DatabaseDummy();
    private static ArrayList<Teacher> resultSet = new ArrayList<Teacher>();
    
    @Override
    public List getAll() {       
        //connect to database from databaseconnection
        //get teachers from dummydatabase
        resultSet = db.getTeacherList();
        return resultSet;
    }

    @Override
    public void update(Teacher crashcourse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Teacher crashcourse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Teacher crashcourse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(Teacher crashCourse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Teacher get(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
