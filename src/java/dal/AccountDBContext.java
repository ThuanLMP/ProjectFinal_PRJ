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
import model.User;

/**
 *
 * @author ITACHI
 */
public class AccountDBContext extends DBContext {

    /*
    public void insertUser(User user) {
        String sql = "SELECT aid,gmailacc,password,purchaseprice,saleprice,slot,type,active \n"
                + "FROM Account";

        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, user.getUsername());
            stm.setString(2, user.getPassword());
            stm.setString(3, user.getFullname());
            stm.setString(4, user.getGmail());
            stm.setString(5, user.getSdt());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
     */
    public ArrayList<Account_netf> getAccs() {
        ArrayList<Account_netf> acc_netfs = new ArrayList<>();
        try {
            String sql = "SELECT aid,gmailacc,password,purchaseprice,saleprice,slot,type,active \n"
                    + "FROM Account";

            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account_netf acc = new Account_netf();
                acc.setId(rs.getInt("aid"));
                acc.setGmail(rs.getString("gmailacc"));
                acc.setPassword(rs.getString("password"));
                acc.setPurPrice(rs.getInt("purchaseprice"));
                acc.setSalePrice(rs.getInt("saleprice"));
                acc.setType(rs.getString("type"));
                acc.setSlot(rs.getInt("slot"));
                acc.setActive(rs.getInt("active"));
                acc_netfs.add(acc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acc_netfs;
    }

    public int getMinId(String type) {
        int n = 0;
        try {
            String sql = "select  MIN(aid) as aid from Account where type=? and active=1";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, type);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                String check = rs.getString("aid");
                n = Integer.parseInt(check);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public Account_netf getAcc(int id) {

        Account_netf acc = new Account_netf();
        try {
            String sql = "select  aid,gmailacc,password,purchaseprice,saleprice,slot,type,active  from Account where aid=?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {

                acc.setId(rs.getInt("aid"));
                acc.setGmail(rs.getString("gmailacc"));
                acc.setPassword(rs.getString("password"));
                acc.setPurPrice(rs.getInt("purchaseprice"));
                acc.setSalePrice(rs.getInt("saleprice"));
                acc.setType(rs.getString("type"));
                acc.setSlot(rs.getInt("slot"));
                acc.setActive(rs.getInt("active"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acc;
    }

    public void updateAcc(int id) {
        String sql = "UPDATE [Account]\n"
                + "   SET\n"
                + "      [active] = 0\n"
                + " WHERE aid = ?;";

        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, id);

            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateActiveAcc(String gmailacc, int slot) {
        String sql = "UPDATE [Account]\n"
                + "   SET\n"
                + "      [active] = 1\n"
                + " WHERE gmailacc=? and slot = ?";

        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, gmailacc);
            stm.setInt(2, slot);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public ArrayList<Order> getOrderExpires() {
        ArrayList<Order> orders = new ArrayList<>();
        try {
            long millis = System.currentTimeMillis();
            Date date = new java.sql.Date(millis);

            String sql = "SELECT u.fullname, b.username,u.gmail,u.sdt,a.gmailacc,a.slot,b.startdate,a.saleprice*b.time as price,b.time,a.type FROM Bill b inner join [user] u\n"
                    + "on b.username=u.username\n"
                    + "inner join Account a\n"
                    + "on b.aid=a.aid\n"
                    + "WHERE [time]*30-DATEDIFF(day,startdate,?) <=0 and a.active=0\n";

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
                order.setPrice(rs.getInt("price"));
                order.setTime(rs.getInt("time"));
                order.setType(rs.getString("type"));
                orders.add(order);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orders;
    }

    public ArrayList<Account_netf> searchAcc(String gmail) {
        ArrayList<Account_netf> acc_netfs = new ArrayList<>();
        try {
            String sql = "select*from Account where gmailacc like ?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + gmail + "%");
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Account_netf acc = new Account_netf();
                acc.setId(rs.getInt("aid"));
                acc.setGmail(rs.getString("gmailacc"));
                acc.setPassword(rs.getString("password"));
                acc.setPurPrice(rs.getInt("purchaseprice"));
                acc.setSalePrice(rs.getInt("saleprice"));
                acc.setType(rs.getString("type"));
                acc.setSlot(rs.getInt("slot"));
                acc.setActive(rs.getInt("active"));
                acc_netfs.add(acc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acc_netfs;
    }
    
    public static void main(String[] args) {
        AccountDBContext db = new AccountDBContext();
        int n = db.getMinId("2-END");
        System.out.println(n);
        db.updateAcc(n);    
    }
     
}
