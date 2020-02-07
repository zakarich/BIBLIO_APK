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
import com.gestion.beans.Etudiant;
import com.gestion.beans.Ouvrage;
import com.gestion.metier.*;

/**
 * Servlet implementation class Listcommande
 */
@WebServlet("/ListOuvrageEtudiant")
public class ListOuvrageEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListOuvrageEtudiant() {
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
				request.getRequestDispatcher("index1.jsp").forward(request, response);
			}else {
				Etudiant clt=(Etudiant)request.getSession().getAttribute("Etudiant");
				String S="Voila la liste des Ouvrages Mrs."+clt.getNom()+":]";
				
				IMetier M=new MetierImpl(); 
				List<Ouvrage>list=M.ListBook();
				request.setAttribute("msg",S);
				request.setAttribute("listOvr",list);
				request.getSession().setAttribute("Etudiant",clt);
				request.getRequestDispatcher("ListOuvrageEtudiant.jsp").forward(request,response);	
			}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//doGet(request, response);
		
				doGet(request,response);
  
   }
}

