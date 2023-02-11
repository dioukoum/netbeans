package com.ectest.servlets;

import com.ectest.beans.Auteur;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Test extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom= request.getParameter("nom");
        request.setAttribute("name", nom);
        String[] noms= {"Treize","Mak","2pac"};
        request.setAttribute("noms", noms);
        Auteur auteur= new Auteur();
        auteur.setNom("Sissoko");
        auteur.setPrenom("Dioukou Moussa");
        auteur.setActif(true);
        request.setAttribute("auteur",auteur);
       this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  

}
