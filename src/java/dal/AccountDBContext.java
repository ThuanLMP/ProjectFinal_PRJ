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
        return acc_netfs ;
    }
    
    public static void main(String[] args) {
        AccountDBContext db = new AccountDBContext();
        ArrayList<Account_netf> accs = db.getAccs();
        for(Account_netf a : accs){
            System.out.println(a.toString());
        }
    }

}
