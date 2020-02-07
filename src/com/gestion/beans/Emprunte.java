package com.gestion.beans;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.time.*;
import java.time.temporal.*;
import java.util.Date;

@SuppressWarnings({ "serial", "unused" })
@Entity
@Table(name="Emprunte")
public class Emprunte implements Serializable {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="Id_Emprunte")
	 private int id;
	 @Column (name="date_Debut")
	 private LocalDate debut;
	 @Column (name="date_retour")
	 private Date fin;
	 @Column(name="Duree")
	 private int duree;
	 @ManyToOne
	 @JoinColumn(name="Id_Etudiant")
	 private Etudiant etudiant;
	 @ManyToOne
	 @JoinColumn(name="Id_Ouvrage")
	 private Ouvrage ouvre;
	  
	 public Emprunte() {}
	 
	public Emprunte( Date fin, int duree, Etudiant etudiant, Ouvrage ouvre) {
		super();
		this.fin = fin;
		this.duree = duree;
		this.etudiant = etudiant;
		this.ouvre = ouvre;
	}
	
	private void setId(int id) {
		this.id=id;
	}
	
	public Date getFin() {
		return fin;
	}
	public void setFin(Date fin) {
		this.fin = fin;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Ouvrage getOuvre() {
		return ouvre;
	}
	public void setOuvre(Ouvrage ouvre) {
		this.ouvre = ouvre;
	}

	public LocalDate getDebut() {
		return debut;
	}

	public void setDebut(LocalDate debut) {
		this.debut = debut;
	}
	 

}
