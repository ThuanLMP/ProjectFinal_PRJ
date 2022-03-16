/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.business;

import dal.AccountDBContext;
import dal.BillDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account_netf;
import model.Order;
import model.OrderCart;
import model.OrderDetail;
import model.User;

/**
 *
 * @author ITACHI
 */
public class PayUpController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = (User) request.getSession().getAttribute("user");
        OrderCart orderCart = (OrderCart) request.getSession().getAttribute("orderCart");
        
        AccountDBContext dba = new AccountDBContext();
        BillDBContext dbb = new BillDBContext();
        for (OrderDetail detail : orderCart.getDetails()) {
            
            int check = dba.getMinId(detail.getAccount().getType());
            Account_netf acc = dba.getAcc(check);
            dba.updateAcc(acc.getId());
            dbb.insertOrder(detail.getMonth(), user.getUsername(), acc);
            
        }
        //response.sendRedirect("../pay_up.jsp");
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
