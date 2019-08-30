package com.inti.dao.impl;


import org.springframework.stereotype.Repository;

import com.inti.dao.interfaces.ITacheDAO;

import com.inti.entities.Tache;
@Repository
public class TacheDAO extends ManagerDAO<Tache> implements ITacheDAO {

}
