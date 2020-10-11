package com.teamplato.plato.dal;

import java.util.List;

public interface DAO<T> {
	public List<T> getAll();
	public T get(String name);
	public void update(T t);
	public void delete(T t);
	public void add(T t);
	public void create(T t);
}
