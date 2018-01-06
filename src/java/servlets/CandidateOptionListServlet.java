/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import admitere.Operations.CandidateOptionOperation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NYKU
 */
@WebServlet(name = "CandidateOptionListServlet", urlPatterns = {"/CandidateOptionList"})
public class CandidateOptionListServlet extends HttpServlet {
    
    @EJB
    private CandidateOptionOperation candidateoptionOperation;

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("candidateoptions", candidateoptionOperation.getAll());
                        
        getServletContext().getRequestDispatcher("/WEB-INF/pages/candidateoption-list.jsp").forward(request, response);
    }

}
