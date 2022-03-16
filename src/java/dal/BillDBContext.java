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
import model.Account_netf;
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
                    + "WHERE [time]*30-DATEDIFF(day,startdate,?) <3 and [time]*30-DATEDIFF(day,startdate,?) >0 ;\n";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setDate(1, date);
            stm.setDate(2, date);

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
            String sql = "SELECT u.fullname, b.username,u.gmail,u.sdt,a.gmailacc,a.slot,b.startdate,b.time,a.type FROM Bill b inner join [user] u\n"
                    + "on b.username=u.username\n"
                    + "inner join Account a\n"
                    + "on b.aid=a.aid\n"
                    + "WHERE [time]*30-DATEDIFF(day,startdate,?) >0 ;\n";

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
    public int getIdOrder(){
        int n = 0;
        try {
            String sql = "select MAX(billid) as maxid from Bill";

            PreparedStatement stm = connection.prepareStatement(sql);
            
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                String check = rs.getString("maxid");
                n = Integer.parseInt(check);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public void insertOrder(int month,String username, Account_netf acc) {
        BillDBContext db = new BillDBContext();
        int n = db.getIdOrder();
        long millis = System.currentTimeMillis();
        Date date = new java.sql.Date(millis);
        String sql = "INSERT INTO [Bill]\n"
                + "           ([billid]\n"
                + "           ,[username]\n"
                + "           ,[aid]\n"
                + "           ,[startdate]\n"
                + "           ,[time])\n"
                + "     VALUES\n"
                + "           ?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?";

        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1,n+1);
            stm.setString(2, username);
            stm.setInt(3, acc.getId());
            stm.setDate(4, date);
            stm.setInt(5,month);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public static void main(String[] args) {
        BillDBContext db = new BillDBContext();
        int n = db.getIdOrder();
        System.out.println(n);
    }

}
