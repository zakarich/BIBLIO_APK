package com.gestion.servlet;

import javax.servlet.http.HttpServlet
;
import java.io.IOException;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.beans.Admin;
import com.gestion.beans.Emprunte;
import com.gestion.beans.Etudiant;
import com.gestion.beans.Ouvrage;
import com.gestion.beans.Reservation;
import com.gestion.metier.*;

/**
 * Servlet implementation class Listcommande
 */
@WebServlet("/ListReservation")
public class ListReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListReservation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
			doPost(request,response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//doGet(request, response);
			 if(request.getSession().getAttribute("Admin")==null) {
				request.getRequestDispatcher("index1.jsp").forward(request, response);
			}else {
				Admin admin=(Admin)request.getSession().getAttribute("Admin");
				String S="Voila la liste des Reservation en cours Mrs."+admin.getNom()+" :)";
				IMetier M=new MetierImpl(); 
				List<Reservation>list=M.Listcommande();
				request.setAttribute("msg",S);
				request.setAttribute("listRes", list);
				request.getSession().setAttribute("Admin", admin);
				request.getRequestDispatcher("ListReservation.jsp").forward(request,response);
			}
    }
}

