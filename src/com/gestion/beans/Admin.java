package com.gestion.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin implements Serializable {

	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="Id_Admin")
	 private int id_Admin;
	 @Column (name="Prenom")
	 private String prenom;
	 @Column (name="Nom")
	 private String nom;
	 @Column (name="Login")
	 private String login;
	 @Column (name="Password")
	 private String password;
	public Admin(String prenom, String nom, String login, String password) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.password = password;
	}
	
	public Admin() {
		
	}
	
	private void setId(int id) {
		this.id_Admin=id;
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
	 
	
}
