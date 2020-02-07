package com.gestion.servlet;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.beans.Etudiant;
import com.gestion.metier.IMetier;
import com.gestion.metier.MetierImpl;

/**
 * Servlet implementation class AddClient
 */
@WebServlet("/AddEtudiant")
public class AddEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEtudiant() {
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
			request.getRequestDispatcher("Authentifier.jsp").forward(request, response);
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
		
		String prenom=request.getParameter("prenom"); 
		String nom=request.getParameter("nom"); 
		String cNE=request.getParameter("CNE");
		String filiere=request.getParameter("select"); 
		String semestre=request.getParameter("select2");
		String login=request.getParameter("login"); 
		String passw=request.getParameter("mdp");
		
		if(prenom!=""&&nom!=""&&cNE!="" &&filiere!=""&&semestre!=""&&login!=""&&passw!=""){ 
			IMetier M=new MetierImpl(); 
			M.addEtudiant(prenom, nom, filiere, cNE, login, passw);
			Etudiant E=new Etudiant(prenom, nom, filiere, cNE, login, passw);
			request.getSession().setAttribute("Etudiant", E);
			String str="Bienvenue "+E.getNom()+" dans votre Espace Bibliotheque";
			request.getSession().setAttribute("str",str);
			//request.setAttribute("str", str);
	        request.getRequestDispatcher("Interface_Etud.jsp").forward(request, response);
			
				        
		}
	}
	

}
