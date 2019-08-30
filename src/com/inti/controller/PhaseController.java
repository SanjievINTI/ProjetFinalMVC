package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Phase;
import com.inti.service.interfaces.IPhaseService;

@CrossOrigin("*")
@RestController
public class PhaseController {
@Autowired
IPhaseService phaseService;

@RequestMapping(value="phases", method = RequestMethod.GET)
public List<Phase> findAll(){
	return phaseService.findAll(Phase.class);
}
@RequestMapping(value="phases/{idPhase}", method = RequestMethod.GET)
public Phase findOne(@PathVariable("idPhase") Long idPhase) {
	return phaseService.findOne(Phase.class,idPhase);
}
@RequestMapping(value="phases", method = RequestMethod.POST)
public Phase savePhase(@RequestBody Phase phase) {
			phaseService.save(phase);
			return new Phase ();
}
@RequestMapping(value="phases/{idPhase}", method = RequestMethod.DELETE)
public void deletePhase(@PathVariable("idPhase") Long idPhase) {
	phaseService.remove(phaseService.findOne(Phase.class, idPhase));
}
@RequestMapping(value="phases/{idPhase}", method= RequestMethod.PUT)
public Phase updatePhase(@PathVariable("idPhase") Long idPhase,@RequestBody Phase phase) {
	Phase currentPhase = phaseService.findOne(Phase.class,idPhase);
	currentPhase.setNom(phase.getNom());
	currentPhase.setDateDebut(phase.getDateDebut());
	currentPhase.setDateFin(phase.getDateFin());
	phaseService.save(currentPhase);
	return currentPhase;
	
}
}
