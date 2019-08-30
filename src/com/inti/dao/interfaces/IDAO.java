package com.inti.dao.interfaces;

import java.util.List;

public interface IDAO  <T>{
	void save(T obj);

	void update(T obj);

	void remove(T obj);

	List<T> findAll(Class<?> c);

	T findOne(Class<?> c, Long id);
}
