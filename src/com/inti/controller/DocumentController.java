package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Document;
import com.inti.service.interfaces.IDocumentService;

@CrossOrigin("*")
@RestController
public class DocumentController {
@Autowired
IDocumentService documentService;

@RequestMapping(value="documents", method = RequestMethod.GET)
public List<Document> findAll(){
	return documentService.findAll(Document.class);
}
@RequestMapping(value="documents/{idDocument}", method = RequestMethod.GET)
public Document findOne(@PathVariable("idDocument") Long idDocument) {
	return documentService.findOne(Document.class,idDocument);
}
@RequestMapping(value="documents", method = RequestMethod.POST)
public Document saveDocument(@RequestBody Document document) {
			documentService.save(document);
			return new Document ();
}
@RequestMapping(value="documents/{idDocument}", method = RequestMethod.DELETE)
public void deleteDocument(@PathVariable("idDocument") Long idDocument) {
	documentService.remove(documentService.findOne(Document.class, idDocument));
}
@RequestMapping(value="documents/{idDocument}", method= RequestMethod.PUT)
public Document updateDocument(@PathVariable("idDocument") Long idDocument,@RequestBody Document document) {
	Document currentDocument = documentService.findOne(Document.class,idDocument);
	currentDocument.setDateCreation(document.getDateCreation());
	currentDocument.setNom(document.getNom());
	currentDocument.setDescription(document.getDescription());
	documentService.save(currentDocument);
	return currentDocument;
	
}
}
