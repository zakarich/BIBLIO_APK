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
@WebServlet("/Reserver")
public class Reserver extends HttpServlet {
private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reserver() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		if(request.getSession().getAttribute("Etudiant")==null) {
			if(request.getSession().getAttribute("Admin")==null) {
				request.getRequestDispatcher("index1.jsp").forward(request, response);	
			}else {
				String book=request.getParameter("t");
				IMetier M=new MetierImpl();
				Ouvrage Ouvr=M.ChercherOuvre_Nom(book);
				request.getSession().setAttribute("livre",Ouvr);
				
				Admin admin=(Admin)request.getSession().getAttribute("Admin");
				request.getSession().setAttribute("Admin", admin);
				String str="voila Mrs:"+admin.getNom()+"vous pouvez confirmer l'etudiant empruntant!!";
				request.setAttribute("str", str);
				request.getRequestDispatcher("Ad_Et_Res.jsp").forward(request, response);
			}
			
		}else {
		doPost(request,response);}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//doGet(request, response);
		if(request.getSession().getAttribute("Admin")==null) {
			if(request.getSession().getAttribute("Etudiant")==null) {
				request.getRequestDispatcher("index1.jsp").forward(request, response);	
			}else {
		        Etudiant Etud=(Etudiant)request.getSession().getAttribute("Etudiant");
		        String book=request.getParameter("t");
		        if(book!=null) {
		           LocalDate d=LocalDate.now();
		           IMetier M=new MetierImpl();
		           Ouvrage Ouvr=M.ChercherOuvre_Nom(book);
		           Reservation Res=new Reservation();
		           Res.setEtudiant(Etud);
		   		   Res.setOuvre(Ouvr);
		   		   Res.setDate_reserv(d);
		   		   List<Reservation>listRes=Etud.getReserver();
		   		   listRes.add(Res);
		   		   Etud.setReserver(listRes);
		   		   List<Reservation>listRes1=Ouvr.getReserver();
		   		   listRes1.add(Res);
		   		   Ouvr.setReserver(listRes1);
		   		   M.AddReservation(Res,Etud,Ouvr);
		   		   String Str="voila Mrs"+Etud.getNom()+"votre Reservation est bien Comfirmer!!";
		   		   request.setAttribute("Stri", Str);
		   		   request.getSession().setAttribute("Etudiant",Etud);
		   		   request.getRequestDispatcher("Apres_Reservation.jsp").forward(request, response);
		         }else {
		        	 request.getRequestDispatcher("ListeOuvrage.jsp").forward(request, response);
		         }
			}
		}else {
		doGet(request,response);
			}
	}

}