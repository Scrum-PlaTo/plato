package com.teamplato.plato.service;

import com.teamplato.plato.database_dummy.DatabaseDummy;
import java.util.ArrayList;

/**
 *
 * @author Thijme.Langelaar
 */
public class RoomsDAOImpl implements DAO<Room> {
    private static DatabaseDummy dbDummy = DatabaseDummy.getInstance();
    private static ArrayList<Room> rooms = dbDummy.getRoomList();

    @Override
    public ArrayList<Room> getAll() {
        return rooms;
    }

    @Override
    public Room get(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Room t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Room t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Room t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(Room t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
