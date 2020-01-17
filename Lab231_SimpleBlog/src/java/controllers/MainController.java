/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.RollbackException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
public class MainController extends HttpServlet {

    private static final String ERROR = "error.jsp";
    private static final String SIGNIN = "SignInController";
    private static final String LOGIN = "LoginController";
    private static final String ACTIVATED = "ActivatedAccountController";
    private static final String LOGOUT = "LogoutController";
    private static final String POST_ARTICLE = "CreateArticleController";
    private static final String GET_ARTICLE_ADMIN = "GetArticleAdminController";
    private static final String BLOG_PROCESS = "BlogProcessController";

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
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            HttpSession session = request.getSession();
            String role = (String) session.getAttribute("ROLE");
            String action = request.getParameter("action");
            if (role == null) {
                role = "";
            }
            if (action.equals("SignIn")) {
                url = SIGNIN;
            } else {
                if (action.equals("Login")) {
                    url = LOGIN;
                } else {
                    if (action.equals("Activated")) {
                        url = ACTIVATED;
                    } else {
                        if (action.equals("Logout")) {
                            url = LOGOUT;
                        } else {
                            if (action.equals("Post Article")) {
                                url = POST_ARTICLE;
                            } else {
                                if (action.equals("GetArticleAdmin")) {
                                    url = GET_ARTICLE_ADMIN;
                                } else {
                                    if (action.equals("GetInforBlog")) {
                                        url = BLOG_PROCESS;
                                    } else {
                                        request.setAttribute("ERROR", "Your action is invalid!");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            log("Error at MainController: " + e.getMessage());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
