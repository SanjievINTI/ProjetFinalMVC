package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Tribunal;
import com.inti.service.interfaces.ITribunalService;


@CrossOrigin("*")
@RestController
public class TribunalController {
@Autowired
ITribunalService tribunalService;

@RequestMapping(value="tribunals", method = RequestMethod.GET)
public List<Tribunal> findAll(){
	return tribunalService.findAll(Tribunal.class);
}
@RequestMapping(value="tribunals/{idTribunal}", method = RequestMethod.GET)
public Tribunal findOne(@PathVariable("idTribunal") Long idTribunal) {
	return tribunalService.findOne(Tribunal.class,idTribunal);
}
@RequestMapping(value="tribunals", method = RequestMethod.POST)
public Tribunal saveTribunal(@RequestBody Tribunal tribunal) {
			tribunalService.save(tribunal);
			return new Tribunal ();
}
@RequestMapping(value="tribunals/{idTribunal}", method = RequestMethod.DELETE)
public void deleteTribunal(@PathVariable("idTribunal") Long idTribunal) {
	tribunalService.remove(tribunalService.findOne(Tribunal.class, idTribunal));
}
@RequestMapping(value="tribunals/{idTribunal}", method= RequestMethod.PUT)
public Tribunal updateTribunal(@PathVariable("idTribunal") Long idTribunal,@RequestBody Tribunal tribunal) {
	Tribunal currentTribunal = tribunalService.findOne(Tribunal.class,idTribunal);
	currentTribunal.setAdresse(tribunal.getAdresse());
	currentTribunal.setFax(tribunal.getFax());
	currentTribunal.setTel(tribunal.getTel());
	currentTribunal.setRegion(tribunal.getRegion());
	tribunalService.save(currentTribunal);
	return currentTribunal;
	
}
}
