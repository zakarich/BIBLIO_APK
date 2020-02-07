package com.gestion.servlet;

import java.io.IOException;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.beans.Admin;
import com.gestion.beans.Emprunte;
import com.gestion.beans.Etudiant;
import com.gestion.beans.Ouvrage;
import com.gestion.beans.Reservation;
import com.gestion.metier.IMetier;
import com.gestion.metier.MetierImpl;

/**
 * Servlet implementation class Listcommande
 */
@WebServlet("/ReserverAdmin")
public class ReserverAdmin extends HttpServlet {
private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReserverAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
			if(request.getSession().getAttribute("Admin")==null) {
				request.getRequestDispatcher("index1.jsp").forward(request, response);	
		    }else {
		        doPost(request,response);
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//doGet(request, response);
		IMetier M=new MetierImpl();
		Admin admin=(Admin)request.getSession().getAttribute("Admin");
		Ouvrage Livre=(Ouvrage)request.getSession().getAttribute("Livre1"); 
		Ouvrage Ouvr=M.ChercherOuvre_Nom(Livre.getTitre());
		LocalDate d=LocalDate.now();
		String Name=request.getParameter("nom");
		String CNE=request.getParameter("CNE");
		if(Name!=null&& CNE!=null) {
			Etudiant Etud=M.Etudiant_Name_CNE(Name,CNE);

			Emprunte Emp=new Emprunte();
			Emp.setEtudiant(Etud);
			Emp.setOuvre(Ouvr);
			Emp.setDebut(d);

			List<Emprunte>listEmp=Etud.getEmprunte();

			listEmp.add(Emp);
			Etud.setEmprunte(listEmp);
			List<Emprunte>listEmp1=Ouvr.getEmprunte();
			listEmp1.add(Emp);
			Ouvr.setEmprunte(listEmp1);
			

			M.AddEmprunte(Emp,Etud,Ouvr);
			Admin admin1=(Admin)request.getSession().getAttribute("Admin");
			request.getSession().setAttribute("Admin", admin1);
			String Str="voila Mrs "+admin.getNom()+" l'Etudiant: "+Etud.getNom()+" doit recevoir l'ouvrage: "+Ouvr.getTitre()+" portant N d'inventaire: "+Ouvr.getId_ouvrage()+" :) ";
			request.setAttribute("Stri", Str);
			System.out.println("je suis l erreur!!!!!!!!!!");
			request.getRequestDispatcher("Apres_Emprunte.jsp").forward(request, response);			
		}else {
			request.getSession().setAttribute("Admin", admin);
			request.getRequestDispatcher("Ad_Et_Res.jsp").forward(request, response);
		}
	}
}

	

