package com.teamplato.plato.service;

import java.util.ArrayList;
import com.teamplato.plato.database_dummy.DatabaseDummy;

/**
 *
 * @author nicks
 */
public class TeachersDAOImpl implements DAO<Teacher> {
    private static DatabaseDummy dbDummy = DatabaseDummy.getInstance();
    private static ArrayList<Teacher> teachers = dbDummy.getTeacherList();

    @Override
    public ArrayList<Teacher> getAll() {
        //connect to database from databaseconnection
        //get teachers from dummydatabase
        return teachers;
    }

    @Override
    public void update(Teacher teacher) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Teacher teacher) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Teacher teacher) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(Teacher teacher) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Teacher get(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
