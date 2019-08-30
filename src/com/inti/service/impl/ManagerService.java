package com.inti.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.inti.dao.interfaces.IDAO;
import com.inti.service.interfaces.IService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ManagerService<T> implements IService<T>{
	
	@Autowired
	@Qualifier("daoGeneric")
	IDAO<T> dao;

	@Override
	public void save(T obj) {
		dao.save(obj);
	}

	@Override
	public void update(T obj) {
		dao.update(obj);
		
	}

	@Override
	public void remove(T obj) {
		dao.remove(obj);
	}

	@Override
	public List<T> findAll(Class<?> c) {
		return dao.findAll(c);
	}

	@Override
	public T findOne(Class<?> c, Long id) {
		return dao.findOne(c, id);
	}
}
