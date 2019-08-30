package com.inti.dao.impl;


import org.springframework.stereotype.Repository;

import com.inti.dao.interfaces.ITribunalDAO;

import com.inti.entities.Tribunal;
@Repository
public class TribunalDAO extends ManagerDAO<Tribunal> implements ITribunalDAO {

}
