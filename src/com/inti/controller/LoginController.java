//package com.inti.controller;
//
//import java.security.Principal;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.inti.entities.Utilisateur;
//import com.inti.service.interfaces.IUtilisateurService;
//
//@CrossOrigin("http://localhost:4200")
//@RestController
//@RequestMapping(value = "/login")
//public class LoginController {
//	@Autowired
//	IUtilisateurService utilisateurService;
//	@RequestMapping(value="/user", method=RequestMethod.GET)
//	public Utilisateur login(Principal principal) {
//		return utilisateurService.findOneByUsername(principal.getName());
//	}
//}
