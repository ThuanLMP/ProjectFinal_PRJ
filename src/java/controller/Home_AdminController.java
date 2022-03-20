/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.user.BaseAuthController;
import dal.BillDBContext;
import dal.BusinessDBContext;
import dal.UserDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Order;
import model.User;

/**
 *
 * @author ITACHI
 */
public class Home_AdminController extends BaseAuthController {

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
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        BillDBContext dbbill = new BillDBContext();
        BusinessDBContext dbbusiness = new BusinessDBContext();
        
        int revenueToDay = dbbusiness.getRevenueToDay();
        int revenue30Day = dbbusiness.getRevenue30day();
        int revenueAll = dbbusiness.getAllRevenue();
        int profitAll = dbbusiness.getAllProfit();
        int profitToDay = dbbusiness.getProfitToDay();
        int profit30Day = dbbusiness.getProfit30day();
        
        UserDBContext dbuser = new UserDBContext();
        
        ArrayList<Order> orders1 = dbbill.getOdersActive();       
        ArrayList<Order> orders2 = dbbill.getOders();
        ArrayList<Order> orders3 = dbbill.getExpires();
        
        int countOrderExpires = orders3.size();
        int countOrder = orders1.size();
           
        UserDBContext db = new UserDBContext();
        ArrayList<User> users = db.getUsers();
        
        
        HttpSession session = request.getSession();
        session.setAttribute("users", users);
        session.setAttribute("countOrder",countOrder);
        session.setAttribute("countOrderExpire",countOrderExpires);
        session.setAttribute("orders", orders1);
        session.setAttribute("rev30day", revenue30Day);
        session.setAttribute("revtoday", revenueToDay);
        session.setAttribute("revall", revenueAll);
        session.setAttribute("profitall", profitAll);
        session.setAttribute("profitday", profitToDay);
        session.setAttribute("profit30day", profit30Day);
        response.sendRedirect("../home_admin.jsp");
        
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
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
