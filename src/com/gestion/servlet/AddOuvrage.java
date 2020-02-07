package com.gestion.servlet;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.beans.*;
import com.gestion.metier.IMetier;
import com.gestion.metier.MetierImpl;

/**
 * Servlet implementation class AddClient
 */
@WebServlet("/AddOuvrage")
public class AddOuvrage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOuvrage() {
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
			request.getRequestDispatcher("Authentifier_Admin.jsp").forward(request, response);
		}
		else {
			doPost(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String titre=request.getParameter("Title"); 
		String auteur=request.getParameter("Auteur"); 
		String filiere=request.getParameter("select1");
		String categorie=request.getParameter("select2"); 
		String type=request.getParameter("select3");
		int nbr_ex=Integer.parseInt(request.getParameter("Nbr_Exemplaires"));
		
		
		if(titre!=""&&auteur!=""&&categorie!="" &&filiere!=""&&type!=""&&nbr_ex!=0){ 
			IMetier M=new MetierImpl(); 
			M.addOuvrage(titre, auteur, filiere, categorie, type, nbr_ex);
			Admin a=(Admin)request.getSession().getAttribute("Admin");
			String str="Bienvenue "+a.getNom()+" dans votre Espace Bibliotheque, votre ajout se fait avec succes";
			request.getSession().setAttribute("str",str);
			//request.setAttribute("str", str);
	        request.getRequestDispatcher("Interface_apres_Ajout_Ouvrage.jsp").forward(request, response);
			
				        
		}
	}
	

}