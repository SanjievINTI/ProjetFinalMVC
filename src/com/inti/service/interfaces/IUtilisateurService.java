package com.inti.service.interfaces;

import com.inti.entities.Utilisateur;

public interface IUtilisateurService extends IService<Utilisateur>{
	Utilisateur findOneByUsername(String username);
}
