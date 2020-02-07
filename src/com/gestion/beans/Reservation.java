package com.gestion.beans;

import java.io.Serializable;

import java.time.LocalDate;



import java.util.Date;
import javax.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@SuppressWarnings("unused" )
@Entity
@Table(name="Reservation")
public class Reservation implements Serializable {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id_Reservation")
	private int Id_Reservation;
	 @Column (name="Date_Reservation")
	 private LocalDate date_reserv;
	 
	 
	 @ManyToOne
	 @JoinColumn(name = "Id_Etudiant", referencedColumnName = "Id_Etudiant")
	 private Etudiant etudiant;
	 
	 @ManyToOne
	 @JoinColumn(name = "Id_ouvrage", referencedColumnName = "Id_ouvrage")
	 private Ouvrage ouvreR;
	 
	 public Reservation() {}
	 
	public Reservation(LocalDate date_reserv, Etudiant etudiant, Ouvrage ouvre) {
		super();
		this.date_reserv = date_reserv;
		this.etudiant = etudiant;
		this.ouvreR = ouvre;
	}
	
	
	private void setId(int id) {
		this.Id_Reservation=id;
	}
	
	
	public LocalDate getDate_reserv() {
		return date_reserv;
	}
	public void setDate_reserv(LocalDate date_reserv) {
		this.date_reserv = date_reserv;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Ouvrage getOuvre() {
		return ouvreR;
	}
	public void setOuvre(Ouvrage ouvre) {
		this.ouvreR = ouvre;
	}
	 
	
	

}
