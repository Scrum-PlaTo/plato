package com.teamplato.plato.service;

import java.util.ArrayList;
/**
 * This is a Data Access Object interface that uses generics.
 * <p>
 * This interface is to be implemented by all Data Transfer Objects (Teachers/Rooms/etc).
 *
 * @author Thijme.Langelaar
 * @param <T> Generic Type
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">Generics</a>
 */
public interface DAO<T> {
	public ArrayList<T> getAll();
	public T get(String name);
	public void update(T t);
	public void delete(T t);
	public void add(T t);
	public void create(T t);
}
