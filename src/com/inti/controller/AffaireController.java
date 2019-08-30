package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Affaire;
import com.inti.service.interfaces.IAffaireService;


@CrossOrigin("*")
@RestController
public class AffaireController {
@Autowired
IAffaireService affaireService;

@RequestMapping(value="affaires", method = RequestMethod.GET)
public List<Affaire> findAll(){
	return affaireService.findAll(Affaire.class);
}
@RequestMapping(value="affaires/{idAffaire}", method = RequestMethod.GET)
public Affaire findOne(@PathVariable("idAffaire") Long idAffaire) {
	return affaireService.findOne(Affaire.class,idAffaire);
}

	@RequestMapping(value="affaires", method = RequestMethod.POST)
public Affaire saveAffaire(@RequestBody Affaire affaire) {
			affaireService.save(affaire);
			return new Affaire ();
}
@RequestMapping(value="affaires/{idAffaire}", method = RequestMethod.DELETE)
public void deleteAffaire(@PathVariable("idAffaire") Long idAffaire) {
	affaireService.remove(affaireService.findOne(Affaire.class, idAffaire));
}
@RequestMapping(value="affaires/{idAffaire}", method= RequestMethod.PUT)
public Affaire updateAffaire(@PathVariable("idAffaire") Long idAffaire,@RequestBody Affaire affaire) {
	Affaire currentAffaire = affaireService.findOne(Affaire.class,idAffaire);
	currentAffaire.setReference(affaire.getReference());
	currentAffaire.setTitre(affaire.getTitre());
	currentAffaire.setDescription(affaire.getDescription());
	currentAffaire.setStatut(affaire.getStatut());
	affaireService.save(currentAffaire);
	return currentAffaire;
	
}
}
