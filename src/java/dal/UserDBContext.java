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
import model.User;

/**
 *
 * @author ITACHI
 */
public class UserDBContext extends DBContext {

    public int LoginUser(String username, String password) {
        int Valid = -1;
        String sql = "select*from [User]\n"
                + "where username=? and password=?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                if(username=="mra"){
                    Valid=1;
                }
                else
                    Valid=0;

            } else {
                Valid = -1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Valid;
    }

    

    public void insertUser(User user) {
        String sql = "INSERT INTO [User]\n"
                + "(username,password,fullname,gmail,sdt)\n"
                + "VALUES\n"
                + "(?,?,?,?,?)";

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

    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        try {
            String sql = "select username,password,fullname,gmail,sdt from [User]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setFullname(rs.getString("fullname"));
                u.setGmail(rs.getString("gmail"));
                u.setSdt(rs.getString("sdt"));
                users.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
    
    public static void main(String[] args) {
        UserDBContext db = new UserDBContext();
        int check = db.LoginUser("mra", "mra");
        System.out.println(check);
    }
 
}
