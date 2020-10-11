package com.teamplato.plato.service;

import com.teamplato.plato.database_dummy.DatabaseDummy;
import java.util.ArrayList;

/**
 *
 * @author Thijme.Langelaar
 */
public class GroupsDAOImpl implements DAO<Group> {
    private static DatabaseDummy dbDummy = DatabaseDummy.getInstance();
    private static ArrayList<Group> groups = dbDummy.getGroupList();

    @Override
    public ArrayList<Group> getAll() {
        return groups;
    }

    @Override
    public Group get(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Group t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Group t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Group t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(Group t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
