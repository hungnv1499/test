/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.google.gson.Gson;
import daos.ArticlesDAO;
import daos.RegistrationDAO;
import entities.Articles;
import entities.Registrations;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.ArticlesModel;

/**
 *
 * @author DELL
 */
public class GetArticleAdminController extends HttpServlet {

    private static final String ERROR = "error.jsp";
    private static final String INDEX = "index.jsp";
    private static final String LOGIN = "login.jsp";
    private static final int MAX_SIZE = 6;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter();) {
            List<Articles> list = new ArrayList<Articles>();
            int pageIndex = Integer.parseInt(request.getParameter("pageIndex").trim());
            Gson gson = new Gson();
            HttpSession session = request.getSession();
            String email = (String) session.getAttribute("USER");
            if ((email != null)) {
                ArticlesDAO articlesDAO = new ArticlesDAO();
                RegistrationDAO registrationDAO = new RegistrationDAO();
                list = articlesDAO.getArticles(MAX_SIZE, pageIndex);
                Registrations registrations = registrationDAO.findById(email);
                List<ArticlesModel> listArticlesModels = new ArrayList<ArticlesModel>();
                for (Articles articles : list) {
                    ArticlesModel articlesModel = new ArticlesModel(articles.getId(), articles.getTitle(), articles.getShortDescription(), articles.getContents(), articles.getAuthor().getName(), articles.getStatus());
                    listArticlesModels.add(articlesModel);
                }
                out.print(gson.toJson(listArticlesModels));
            }
        } catch (Exception e) {
            log("Error at GetArticleAdminController: " + e.getMessage());
        }
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
