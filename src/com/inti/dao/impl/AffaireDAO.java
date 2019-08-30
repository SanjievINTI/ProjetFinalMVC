package com.inti.dao.impl;

import org.springframework.stereotype.Repository;

import com.inti.dao.interfaces.IAffaireDAO;
import com.inti.entities.Affaire;

@Repository
public class AffaireDAO  extends ManagerDAO<Affaire> implements IAffaireDAO{

}
