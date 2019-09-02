package com.inti.dao.interfaces;

import com.inti.entities.Utilisateur;

public interface IUtilisateurDAO extends IDAO<Utilisateur>{

	Utilisateur findOneByUsername(String username);
}
