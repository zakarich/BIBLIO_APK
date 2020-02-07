package com.gestion.beans;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="Ouvrage")
public class Ouvrage implements Serializable {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id_Ouvrage")
	private int Id_ouvrage;
	@Column(name="Title") 
	private String titre;
	@Column(name="Auteur") 
	private String auteur;
	@Column(name="Filiere") 
	private String filiere;
	@Column(name="Categorie") 
	private String categorie;
	@Column(name="Type") 
	private String type;
	@Column(name="Nbr_exemplaires") 
	private int nbr_ex;
	@Column(name="Disponnible") 
	private boolean dispo;
	

	
	@OneToMany(mappedBy="ouvreR")
	private List<Reservation>reserver;
	
	public List<Reservation> getReserver() {
		return reserver;
	}

	public void setReserver(List<Reservation> reserver) {
		this.reserver = reserver;
	}

	

	@OneToMany(mappedBy="ouvre")
	private List<Emprunte>emprunte;
	
	public List<Emprunte> getEmprunte() {
		return emprunte;
	}
	public void setEmprunte(List<Emprunte> emprunte) {
		this.emprunte = emprunte;
	}
	
	public Ouvrage() {
		
	}
	
	public Ouvrage(String titre, String auteur, String filiere) {
		this.titre=titre;
		this.auteur=auteur;
		this.filiere=filiere;

	}
	
	
	
	public Ouvrage(String titre, String auteur, String filiere, String categorie, String type, int nbr_ex) {
		this.titre = titre;
		this.auteur = auteur;
		this.filiere = filiere;
		this.categorie = categorie;
		this.type = type;
		this.nbr_ex = nbr_ex;
		this.emprunte=new ArrayList<>();
		this.reserver=new ArrayList<>();
	
	}
	
	
	public int getId_ouvrage() {
		return Id_ouvrage;
	}

	private void setId(int id) {
		this.Id_ouvrage=id;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNbr_ex() {
		return nbr_ex;
	}
	public void setNbr_ex(int nbr_ex) {
		this.nbr_ex = nbr_ex;
	}
	public boolean isDispo() {
		return dispo;
	}
	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}
	
	

}
