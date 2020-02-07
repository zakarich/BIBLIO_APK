package com.gestion.dao;

import java.util.List;


import org.hibernate.Session;

import com.gestion.beans.Admin;
import com.gestion.beans.Emprunte;
import com.gestion.beans.Etudiant;
import com.gestion.beans.Ouvrage;
import com.gestion.beans.Reservation;


public class DaoImpl implements IDao {
	

	@Override
	public boolean addEtudiant(String prenom, String nom, String filiere, String cNE, String login, String passw) {
		Session session=HibernateUtile.getSessionFactory().openSession(); 
		session.beginTransaction(); 
		Etudiant Etud=new Etudiant(prenom,nom,filiere,cNE,login,passw); 
		session.save(Etud); 
		session.getTransaction().commit(); 
		session.close(); 
		return true; 
	}

	@Override
	public boolean addOuvrage(String titre, String auteur, String filiere, String categorie, String type, int nbr_ex) {
		Session session=HibernateUtile.getSessionFactory().openSession(); 
		session.beginTransaction();
		Ouvrage Ouvre1= (Ouvrage) session.createQuery("from Ouvrage where title='"+titre+"' and Auteur='"+auteur+"' ").uniqueResult();
		if(Ouvre1==null) {
		Ouvrage Ouvre=new Ouvrage(titre, auteur, filiere, categorie, type, nbr_ex); 
		session.save(Ouvre); 
		session.getTransaction().commit(); 
		session.close(); 
		return true;
		}else {
			int num=Ouvre1.getNbr_ex()+nbr_ex;
			Ouvre1.setNbr_ex(num);
			session.save(Ouvre1);
			session.getTransaction().commit();
			session.close();
			return true;
		}
		
	}

	@Override
	public Etudiant verifier_Etudiant(String login, String psw) {
		Session session=HibernateUtile.getSessionFactory().openSession(); 
		session.beginTransaction(); 
		Etudiant Etud= (Etudiant) session.createQuery("from Etudiant where Login='"+login+"' and Password='"+psw+"' ").uniqueResult();
		session.getTransaction().commit();
		session.close();
		return Etud;
	}

	@Override
	public Admin verifier_Admin(String login, String psswrd) {
		Session session=HibernateUtile.getSessionFactory().openSession(); 
		session.beginTransaction(); 
		Admin Admin= (Admin) session.createQuery("from Admin where Login='"+login+"' and Password='"+psswrd+"' ").uniqueResult();
		session.getTransaction().commit();
		session.close();
		return Admin;
		
	}
	@Override
	public Ouvrage ChercherOuvre_Nom(String Title) {
		Session session=HibernateUtile.getSessionFactory().openSession(); 
		session.beginTransaction(); 
		Ouvrage Ouvrage= (Ouvrage) session.createQuery("from Ouvrage where title='"+Title+"' ").uniqueResult();
		session.getTransaction().commit();
		session.close();
		return Ouvrage;
		
	}
	@Override
	public Ouvrage ChercherOuvre_Id(int Id) {
		Session session=HibernateUtile.getSessionFactory().openSession(); 
		session.beginTransaction(); 
		Ouvrage Ouvrage= (Ouvrage) session.createQuery("from Ouvrage where Id_Ouvrage="+Id).uniqueResult();
		session.getTransaction().commit();
		session.close();
		return Ouvrage;
		
	}
	@Override
	public Etudiant Etudiant_Name_CNE(String Name,String CNE) {
		Session session=HibernateUtile.getSessionFactory().openSession(); 
		session.beginTransaction(); 
		Etudiant Etud= (Etudiant)session.createQuery("from Etudiant where Nom='"+Name+"' and CNE='"+CNE+"' ").uniqueResult();
		session.getTransaction().commit();
		session.close();
		return Etud;
		
	}

	@Override
	public boolean AddReservation(Reservation cd, Etudiant clt, Ouvrage book) {
		Session session=HibernateUtile.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(clt);
		session.update(book);
		session.save(cd);
		session.getTransaction().commit(); 
		session.close();
		return true;
	}
	@Override
	public Etudiant Consulter_Etudiant(Etudiant Etud) {
		String login=Etud.getLogin();
		String CNE=Etud.getCNE();
		String passw=Etud.getPassword();
		Session session=HibernateUtile.getSessionFactory().openSession(); 
		session.beginTransaction(); 
		Etudiant Etud1= (Etudiant) session.createQuery("from Admin where Login='"+login+"' and Password='"+passw+"'and Password='"+CNE+"' ").uniqueResult();
		session.getTransaction().commit();
		session.close();
		return Etud1;
		
	}

	@Override
	public boolean AddEmprunte(Emprunte cd, Etudiant clt, Ouvrage book) {
		Session session=HibernateUtile.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(cd);
		clt.getEmprunte().add(cd);
		session.evict(clt);
		session.update(clt);
		cd.setEtudiant(clt);
		book.getEmprunte().add(cd);
		session.evict(book);
		session.update(book);
		cd.setOuvre(book);
		session.getTransaction().commit(); 
		session.close();
		return true;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Ouvrage> ListBook() {
		
		Session session=HibernateUtile.getSessionFactory().openSession();
		session.beginTransaction();
		List<Ouvrage> list=session.createQuery("from Ouvrage").list();
		session.getTransaction().commit(); 
		session.close();
		return list;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> Listcommande() {
		Session session=HibernateUtile.getSessionFactory().openSession();
		session.beginTransaction();
		List<Reservation> list=session.createQuery("from Reservation").list();
		session.getTransaction().commit(); 
		session.close();
		return list;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Emprunte> ListEmprunte() {
		Session session=HibernateUtile.getSessionFactory().openSession();
		session.beginTransaction();
		List<Emprunte> list=session.createQuery("from Emprunte").list();
		session.getTransaction().commit(); 
		session.close();
		return list;
	}
	

}
