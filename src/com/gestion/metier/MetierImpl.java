package com.gestion.metier;

import java.util.List;

import org.hibernate.Session;

import com.gestion.beans.Admin;
import com.gestion.beans.Emprunte;
import com.gestion.beans.Etudiant;
import com.gestion.beans.Ouvrage;
import com.gestion.beans.Reservation;
import com.gestion.dao.DaoImpl;
import com.gestion.dao.HibernateUtile;
import com.gestion.dao.IDao;


public class MetierImpl implements IMetier {

	
	IDao Udao=new DaoImpl();
	
	@Override
	public boolean addEtudiant(String prenom, String nom, String filiere,String cNE, String login, String passw) {
	
		return Udao.addEtudiant(prenom, nom, filiere, cNE, login, passw);
	}

	@Override
	public boolean addOuvrage(String titre, String auteur, String filiere, String categorie, String type, int nbr_ex) {
		return Udao.addOuvrage(titre, auteur, filiere, categorie, type, nbr_ex);
	}

	@Override
	public Etudiant verifier_Etudiant(String login, String psw) {
		Etudiant Etud=Udao.verifier_Etudiant(login, psw);
				return Etud;
	}

	@Override
	public Admin verifier_Admin(String login, String psswrd) {
		Admin Adm=Udao.verifier_Admin(login, psswrd);
		return Adm;
	}
	@Override
	public Ouvrage ChercherOuvre_Nom(String Title) {
		return Udao.ChercherOuvre_Nom(Title);
		
	}
	@Override
	public Etudiant  Consulter_Etudiant(Etudiant Etud) {
		return Udao.Consulter_Etudiant(Etud);
	}
	
	@Override
	public Etudiant Etudiant_Name_CNE(String Name,String CNE) {
		
		return Udao.Etudiant_Name_CNE(Name, CNE);
		
	}
	@Override
	public boolean AddReservation(Reservation cd, Etudiant clt, Ouvrage book) {
		// TODO Auto-generated method stub
		return Udao.AddReservation(cd, clt, book);
	}

	@Override
	public boolean AddEmprunte(Emprunte cd, Etudiant clt, Ouvrage book) {
		// TODO Auto-generated method stub
		return Udao.AddEmprunte(cd, clt, book);
	}

	@Override
	public List<Ouvrage> ListBook() {
		// TODO Auto-generated method stub
		return Udao.ListBook();
	}

	@Override
	public List<Reservation> Listcommande() {
		// TODO Auto-generated method stub
		return Udao.Listcommande();
	}

	@Override
	public List<Emprunte> ListEmprunte() {
		// TODO Auto-generated method stub
		return Udao.ListEmprunte();
	}

}
