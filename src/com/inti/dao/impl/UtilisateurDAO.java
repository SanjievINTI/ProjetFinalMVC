package com.inti.dao.impl;


import org.springframework.stereotype.Repository;

import com.inti.dao.interfaces.IUtilisateurDAO;

import com.inti.entities.Utilisateur;
@Repository
public class UtilisateurDAO extends ManagerDAO<Utilisateur> implements IUtilisateurDAO {

}
