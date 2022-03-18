/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account_netf;
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
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
    
    public static void main(String[] args) {
        AccountDBContext db = new AccountDBContext();
        int check = db.getMinId("");
        Account_netf acc = db.getAcc(check);
        System.out.println(acc.toString());
    }
}
