package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dal.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class LoginController extends HttpServlet {

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
        doPost(request, response);
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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        AccountDAO db = new AccountDAO();
        Account account = db.getAcount(username, password, 1);
        if (account != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", account);
            Cookie c_user = new Cookie("c_user", username);
            Cookie c_pass = new Cookie("c_pass", request.getParameter("password"));
            Cookie c_remember = new Cookie("c_remember", remember);
            if (remember != null) {
                c_user.setMaxAge(3600 * 24 * 15);
                c_pass.setMaxAge(3600 * 24 * 15);
                c_remember.setMaxAge(3600 * 24 * 15);
            } else {
                c_user.setMaxAge(0);
                c_pass.setMaxAge(0);
                c_remember.setMaxAge(0);
            }
            response.addCookie(c_user);
            response.addCookie(c_pass);
            response.addCookie(c_remember);
            PrintWriter out = response.getWriter();
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Username/Password incorrect!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
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
