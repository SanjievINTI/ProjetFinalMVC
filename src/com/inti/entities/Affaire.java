package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Affaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAffaire;
	private String reference;
	private String titre;
	private String description;
	private int statut;
	@OneToMany(mappedBy = "affaire",fetch=FetchType.EAGER)
	private Set<Document> listDocument = new HashSet<Document>();
	@OneToMany(mappedBy = "affaire",fetch=FetchType.EAGER)
	private Set<Tache> listTache = new HashSet<Tache>();
	
	public Affaire() {
	}

	public Long getIdAffaire() {
		return idAffaire;
	}

	public void setIdAffaire(Long idAffaire) {
		this.idAffaire = idAffaire;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatut() {
		return statut;
	}

	public void setStatut(int statut) {
		this.statut = statut;
	}

	public Set<Document> getListDocument() {
		return listDocument;
	}

	public void setListDocument(Set<Document> listDocument) {
		this.listDocument = listDocument;
	}

	public Set<Tache> getListTache() {
		return listTache;
	}

	public void setListTache(Set<Tache> listTache) {
		this.listTache = listTache;
	}

	
}
