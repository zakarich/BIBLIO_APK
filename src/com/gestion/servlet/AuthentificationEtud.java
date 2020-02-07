package com.gestion.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.beans.Etudiant;
import com.gestion.metier.IMetier;
import com.gestion.metier.MetierImpl;

/**
 * Servlet implementation class authentification
 */
@WebServlet("/AuthentificationEtud")
public class AuthentificationEtud extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentificationEtud() {
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
			Etudiant Etud=M.verifier_Etudiant(login,password);
			if(Etud==null) {
				PrintWriter out = response.getWriter();  
				response.setContentType("text/html");  
				out.println("<script type=\"text/javascript\">");  
				out.println("alert('Verifer vos informations le mot de passe ou l'identifiant est incorrect...');");  
				out.println("location='Authentifier.jsp';");
				out.println("</script>");
				//request.getRequestDispatcher("enregistrement.jsp").forward(request, response);;
				
			}
			else {
			String str="Bienvenue "+Etud.getNom()+" dans votre Espace Bibliotheque USMBA";
			request.getSession().setAttribute("Etudiant", Etud);
			request.getSession().setAttribute("str", str);
			request.getRequestDispatcher("Interface_Etud.jsp").forward(request, response);}
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
