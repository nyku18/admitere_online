/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import admitere.Candidat;
import admitere.CandidatOptiune;
import admitere.Operations.CandidateOperation;
import admitere.Operations.CandidateOptionOperation;
import admitere.Operations.OptionOperation;
import java.io.IOException;
import java.util.List;
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
@WebServlet(name = "AddCandidate", urlPatterns = {"/AddCandidate"})
public class AddCandidate extends HttpServlet {

    @EJB
    private CandidateOperation candidateOperation;
    
    @EJB
    private OptionOperation optionOperation;
    
    @EJB
    private CandidateOptionOperation candidateOptionOperation;

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
        request.setAttribute("options", optionOperation.getAll());
                        
        getServletContext().getRequestDispatcher("/WEB-INF/pages/add-candidate.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Candidat> allCandidates = candidateOperation.getAll();
        Candidat lastAddedCandidate = allCandidates.get(allCandidates.size() - 1);
        
        Candidat candidate = new Candidat();
        candidate.setId(lastAddedCandidate.getId() + 1);
        candidate.setNume(request.getParameter("nume"));
        candidate.setPrenume(request.getParameter("prenume"));
        candidate.setInitialaTata(request.getParameter("initialaTata")); 
        candidate.setCnp(Integer.parseInt(request.getParameter("cnp"))); 
        candidate.setAdresa(request.getParameter("adresa")); 
        candidate.setTelefon(Integer.parseInt(request.getParameter("telefon"))); 
        candidate.setEmail(request.getParameter("email")); 
        
        candidateOperation.add(candidate);
        
        String[] selectedOptions = request.getParameterValues("option");
        
        List<CandidatOptiune> allCandidateOptions = candidateOptionOperation.getAll();
        CandidatOptiune lastAddedCandidateOption = allCandidateOptions.get(allCandidateOptions.size() - 1);

        long lastCandidateOptionId = lastAddedCandidateOption.getId();
        for(String selectedOption : selectedOptions)
        {
            long idOptiune = Integer.parseInt(selectedOption);
            
            CandidatOptiune candidateOption = new CandidatOptiune();
            candidateOption.setId(++lastCandidateOptionId);
            candidateOption.setIdCandidat(candidate.getId());
            candidateOption.setIdOptiune(idOptiune);

            candidateOptionOperation.add(candidateOption);
        }
              
        response.sendRedirect("http://localhost:8080/AdmitereOnline/CandidateList");
        
    }

}
