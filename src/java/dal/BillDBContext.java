/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Order;

/**
 *
 * @author ITACHI
 */
public class BillDBContext extends DBContext {

    public ArrayList<Order> getOders() {
        ArrayList<Order> orders = new ArrayList<>();
        try {
            String sql = "select u.fullname, b.username,u.gmail,u.sdt,a.gmailacc,a.slot,b.startdate,b.time,a.type\n"
                    + "from bill b inner join [user] u \n"
                    + "on b.username=u.username\n"
                    + "inner join Account a\n"
                    + "on b.aid=a.aid";

            PreparedStatement stm = connection.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Order order = new Order();
                order.setFullname(rs.getString("fullname"));
                order.setUsername(rs.getString("username"));
                order.setGmail(rs.getString("gmail"));
                order.setSdt(rs.getString("sdt"));
                order.setAccNetf(rs.getString("gmailacc"));
                order.setSlot(rs.getInt("slot"));
                order.setStartDate(rs.getDate("startdate"));
                order.setTime(rs.getInt("time"));
                order.setType(rs.getString("type"));
                orders.add(order);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orders;
    }

    //test orders
    /*
    public static void main(String[] args) {
        BillDBContext b = new BillDBContext();
        ArrayList<Order> orders = b.getOders();
        for(Order o:orders){
            System.out.println(o.toString());
        }
    }
     */
    public ArrayList<Order> getExpires() {
        ArrayList<Order> orders = new ArrayList<>();
        try {
            long millis = System.currentTimeMillis();
            Date date = new java.sql.Date(millis);

            String sql = "SELECT u.fullname, b.username,u.gmail,u.sdt,a.gmailacc,a.slot,b.startdate,b.time,a.type FROM Bill b inner join [user] u\n"
                    + "on b.username=u.username\n"
                    + "inner join Account a\n"
                    + "on b.aid=a.aid\n"
                    + "WHERE [time]*30-DATEDIFF(day,startdate,?) <3;\n";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setDate(1, date);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Order order = new Order();
                order.setFullname(rs.getString("fullname"));
                order.setUsername(rs.getString("username"));
                order.setGmail(rs.getString("gmail"));
                order.setSdt(rs.getString("sdt"));
                order.setAccNetf(rs.getString("gmailacc"));
                order.setSlot(rs.getInt("slot"));
                order.setStartDate(rs.getDate("startdate"));
                order.setTime(rs.getInt("time"));
                order.setType(rs.getString("type"));
                orders.add(order);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orders;
    }

    public ArrayList<Order> getOdersActive() {
        ArrayList<Order> orders = new ArrayList<>();
        try {

            long millis = System.currentTimeMillis();
            Date date = new java.sql.Date(millis);
            String sql = "select u.fullname, b.username,u.gmail,u.sdt,a.gmailacc,a.slot,b.startdate,b.time,a.type\n"
                    + "from bill b inner join [user] u\n"
                    + "on b.username=u.username\n"
                    + "inner join Account a\n"
                    + "on b.aid=a.aid\n"
                    + "where b.startdate <= ?";
            
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setDate(1, date);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Order order = new Order();
                order.setFullname(rs.getString("fullname"));
                order.setUsername(rs.getString("username"));
                order.setGmail(rs.getString("gmail"));
                order.setSdt(rs.getString("sdt"));
                order.setAccNetf(rs.getString("gmailacc"));
                order.setSlot(rs.getInt("slot"));
                order.setStartDate(rs.getDate("startdate"));
                order.setTime(rs.getInt("time"));
                order.setType(rs.getString("type"));
                orders.add(order);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orders;  
    }

    //test getExpire
    /*
    public static void main(String[] args) {
        BillDBContext b = new BillDBContext();
        ArrayList<Order> orders = b.getExpires();
        for(Order o:orders){
            System.out.println(o.toString());
        }
    }
     */
}
