/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.business;

import dal.AccountDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account_netf;
import model.Order;
import model.OrderCart;
import model.OrderDetail;

/**
 *
 * @author ITACHI
 */
public class CartController extends HttpServlet {

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

        String type = request.getParameter("type");
        AccountDBContext db = new AccountDBContext();
        int check = db.getMinId(type.trim());
        Account_netf acc = db.getAcc(check);

        OrderCart orderCart = (OrderCart) request.getSession().getAttribute("orderCart");

        if (orderCart == null) {
            orderCart = new OrderCart();
        }
        boolean isExist = false;

        for (OrderDetail detail : orderCart.getDetails()) {
            if (detail.getAccount().getType().trim().equals(type.trim())) {
                isExist = true;
                detail.setMonth(detail.getMonth() + 1);
                break;
            }
        }

        if (!isExist) {
            OrderDetail detail = new OrderDetail();
            detail.setAccount(acc);
            detail.setMonth(1);
            orderCart.getDetails().add(detail);
        }

        request.getSession().setAttribute("orderCart", orderCart);
        response.sendRedirect("../cart.jsp");
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
