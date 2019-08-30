package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Tache;
import com.inti.service.interfaces.ITacheService;

@CrossOrigin("*")
@RestController
public class TacheController {
@Autowired
ITacheService tacheService;

@RequestMapping(value="taches", method = RequestMethod.GET)
public List<Tache> findAll(){
	return tacheService.findAll(Tache.class);
}
@RequestMapping(value="taches/{idTache}", method = RequestMethod.GET)
public Tache findOne(@PathVariable("idTache") Long idTache) {
	return tacheService.findOne(Tache.class,idTache);
}
@RequestMapping(value="taches", method = RequestMethod.POST)
public Tache saveTache(@RequestBody Tache tache) {
			tacheService.save(tache);
			return new Tache ();
}
@RequestMapping(value="taches/{idTache}", method = RequestMethod.DELETE)
public void deleteTache(@PathVariable("idTache") Long idTache) {
	tacheService.remove(tacheService.findOne(Tache.class, idTache));
}
@RequestMapping(value="taches/{idTache}", method= RequestMethod.PUT)
public Tache updateTache(@PathVariable("idTache") Long idTache,@RequestBody Tache tache) {
	Tache currentTache = tacheService.findOne(Tache.class,idTache);
	currentTache.setDateCreation(tache.getDateCreation());
	currentTache.setTitre(tache.getTitre());
	currentTache.setDescription(tache.getDescription());
	currentTache.setStatutAudience(tache.isStatutAudience());
	return currentTache;
	
}
}
