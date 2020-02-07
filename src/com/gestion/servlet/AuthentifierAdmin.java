package com.gestion.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.beans.*;
import com.gestion.metier.IMetier;
import com.gestion.metier.MetierImpl;

/**
 * Servlet implementation class authentification
 */
@WebServlet("/AuthentificationAdmin")
public class AuthentifierAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentifierAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login=request.getParameter("login");
		String password=request.getParameter("mdp");
		if(login!=""&&password!="") {
			IMetier M=new MetierImpl(); 
			Admin Admin=M.verifier_Admin(login, password);
			if(Admin==null) {
				
			request.getRequestDispatcher("Authentifier_Admin.jsp").forward(request, response);
				
			}
			else {
			String str="Bienvenue Mrs."+Admin.getPrenom()+" "+Admin.getNom()+" dans votre Espace Bibliotheque USMBA";
			request.getSession().setAttribute("Admin", Admin);
			request.getSession().setAttribute("str", str);
			request.getRequestDispatcher("Interface_Admin.jsp").forward(request, response);}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
			
		
		
	
	}
	

}
