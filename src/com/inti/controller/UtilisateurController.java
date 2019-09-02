package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IUtilisateurService;

@CrossOrigin("*")
@RestController
public class UtilisateurController {
@Autowired
IUtilisateurService utilisateurService;

@RequestMapping(value="users", method = RequestMethod.GET)
public List<Utilisateur> findAll(){
	return utilisateurService.findAll(Utilisateur.class);
}
@RequestMapping(value="users/{idUtilisateur}", method = RequestMethod.GET)
public Utilisateur findOne(@PathVariable("idUtilisateur") Long idUtilisateur) {
	return utilisateurService.findOne(Utilisateur.class,idUtilisateur);
}
@RequestMapping(value="users", method = RequestMethod.POST)
public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
			utilisateurService.save(utilisateur);
			return new Utilisateur ();
}
@RequestMapping(value="users/{idUtilisateur}", method = RequestMethod.DELETE)
public void deleteUtilisateur(@PathVariable("idUtilisateur") Long idUtilisateur) {
	utilisateurService.remove(utilisateurService.findOne(Utilisateur.class, idUtilisateur));
}
@RequestMapping(value="users/{idUtilisateur}", method= RequestMethod.PUT)
public Utilisateur updateUtilisateur(@PathVariable("idUtilisateur") Long idUtilisateur,@RequestBody Utilisateur utilisateur) {
	Utilisateur currentUtilisateur = utilisateurService.findOne(Utilisateur.class,idUtilisateur);
	currentUtilisateur.setNomUtilisateur(utilisateur.getNomUtilisateur());
	currentUtilisateur.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
	currentUtilisateur.setEmail(utilisateur.getEmail());
	currentUtilisateur.setListRole(utilisateur.getListRole());
	utilisateurService.save(currentUtilisateur);
	return currentUtilisateur;
	
}
/*@RequestMapping(value = "users", method = RequestMethod.POST)
public  String saveUserWithImg(@RequestParam("nom") String nom, 
		@RequestParam("prenom") String prenom,
		@RequestParam("username") String username,
		@RequestParam("password") String password,
		@RequestParam("file") MultipartFile file,
		@RequestParam("dateNaissance") String date) {
	try {
		DateFormat formatter= new SimpleDateFormat("yyyy-mm-dd");
		Date dateNaissance = formatter.parse(date.replace("\""," "));
		Utilisateur currentUser = new Utilisateur ();
		currentUser.setNomUtilisateur(nom);
		currentUser.setPrenomUtilisateur(prenom);
		currentUser.setUsername(username);
		currentUser.setPassword(password);
		currentUser.setImage(file.getBytes());
		currentUser.setDateNaissance(dateNaissance);
		utilisateurService.save(currentUser);
		return "File uploaded successfully! filename="+file.getOriginalFilename();
	}catch (Exception e) {
		e.printStackTrace();
		return "Fail ya had uploaded the file before or the file's size >500kB";
	}

}*/
}
