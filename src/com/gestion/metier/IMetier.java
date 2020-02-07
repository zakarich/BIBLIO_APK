package com.gestion.metier;

import java.util.List;

import com.gestion.beans.Admin;
import com.gestion.beans.Emprunte;
import com.gestion.beans.Etudiant;
import com.gestion.beans.Ouvrage;
import com.gestion.beans.Reservation;

public interface IMetier {
	public boolean addEtudiant(String prenom,String nom,String filiere, String cNE,String login,String passw);
	public boolean addOuvrage(String titre, String auteur, String filiere, String categorie, String type, int nbr_ex);
	
	public Etudiant verifier_Etudiant(String login,String psw);
	public Admin verifier_Admin(String login,String psswrd);
	
	public boolean AddReservation(Reservation cd,Etudiant clt,Ouvrage book);
	public boolean AddEmprunte(Emprunte cd,Etudiant clt,Ouvrage book);
	
	public List<Ouvrage>ListBook();
	public List<Reservation>Listcommande();
	public List<Emprunte> ListEmprunte();
	public Ouvrage ChercherOuvre_Nom(String Title);
	public Etudiant Consulter_Etudiant(Etudiant Etud);
	public Etudiant Etudiant_Name_CNE(String Name, String CNE);

}
