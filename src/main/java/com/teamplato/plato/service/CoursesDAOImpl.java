package com.teamplato.plato.service;

import java.util.ArrayList;
import com.teamplato.plato.database_dummy.DatabaseDummy;
/**
 *
 * @author Thijme.Langelaar
 */
public class CoursesDAOImpl implements DAO<Course> {
    private static DatabaseDummy dbDummy = DatabaseDummy.getInstance();
    private static ArrayList<Course> courses = dbDummy.getCourseList();

    //TODO: constructors

    @Override
    public ArrayList<Course> getAll() {
        return courses;
    }

    @Override
    public Course get(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Course t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Course t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Course t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(Course t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
