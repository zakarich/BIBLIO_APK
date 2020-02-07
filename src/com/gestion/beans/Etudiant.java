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
@Table(name="Etudiant")
public class Etudiant implements Serializable {
	


	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="Id_Etudiant")
	 private int id_etudiant;
	 @Column (name="Prenom")
	 private String prenom;
	 @Column (name="Nom")
	 private String nom;
	 @Column (name="Filiere")
	 private String filiere;
	 @Column (name="CNE")
	 private String CNE;
	//---------------------verifier---------------//
	 
	 @Column (name="Login")
	 private String login;
	 @Column (name="Password")
	 private String password;
	 
	 @Column (name="Nbr_avertissement")
	 private int nbr_avert;
	 @Column (name="Black_list")
	 private boolean black;
	 //----------------------------partager key-----------------------//
		@OneToMany(mappedBy="etudiant")
		private List<Reservation>reserver;
		
		@OneToMany(mappedBy="etudiant")
		private List<Emprunte>emprunte;
		

	public Etudiant (String prenom,String nom,String filiere, String CNE,String login,String Password) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.filiere = filiere;
		this.CNE = CNE;
		this.login = login;
		this.password = Password;
		this.nbr_avert=0;
		this.black=false;
		this.emprunte=new ArrayList<>();
		this.reserver=new ArrayList<>();

	
	}
	
	
	public Etudiant() {
	}


	public int getId_etudiant() {
		return id_etudiant;
	}


	public void setId_etudiant(int id_etudiant) {
		this.id_etudiant = id_etudiant;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getFiliere() {
		return filiere;
	}


	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}


	public String getCNE() {
		return CNE;
	}


	public void setCNE(String cNE) {
		CNE = cNE;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getNbr_avert() {
		return nbr_avert;
	}


	public void setNbr_avert(int nbr_avert) {
		this.nbr_avert = nbr_avert;
	}


	public boolean isBlack() {
		return black;
	}


	public void setBlack(boolean black) {
		this.black = black;
	}


	public List<Reservation> getReserver() {
		return reserver;
	}


	public void setReserver(List<Reservation> reserver) {
		this.reserver = reserver;
	}


	public List<Emprunte> getEmprunte() {
		return emprunte;
	}


	public void setEmprunte(List<Emprunte> emprunte) {
		this.emprunte = emprunte;
	}

	
}
