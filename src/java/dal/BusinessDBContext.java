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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ITACHI
 */
public class BusinessDBContext extends DBContext {

    public int getRevenueToDay() {
        int total = 0;
        try {

            long millis = System.currentTimeMillis();
            Date date = new java.sql.Date(millis);
            String sql = "SELECT a.saleprice*b.time as d from Bill b inner join Account a on b.aid=a.aid \n"
                    + "WHERE startdate= ?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setDate(1, date);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                total = total + rs.getInt("d");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BusinessDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public int getRevenue30day() {
        int total = 0;
        try {

            long millis = System.currentTimeMillis();
            Date date = new java.sql.Date(millis);
            String sql = "SELECT a.saleprice*b.time as d from Bill b inner join Account a on b.aid=a.aid \n"
                    + "                    WHERE DATEDIFF(day,startdate,?) <=30";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setDate(1, date);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                total = total + rs.getInt("d");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BusinessDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public int getRevenue(String startDate, String endDate) {
        int total = 0;
        try {

            String sql = "SELECT a.saleprice as d from Bill b inner join Account a on b.aid=a.aid \n"
                    + "WHERE startDate>=? and startDate<=?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, startDate);
            stm.setString(2, endDate);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                total = total + rs.getInt("d");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BusinessDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public int getAllRevenue() {
        int total = 0;
        try {

            String sql = "SELECT a.saleprice*b.time as d from Bill b inner join Account a on b.aid=a.aid";

            PreparedStatement stm = connection.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                total = total + rs.getInt("d");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BusinessDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public int getRevenueDay(String date) {
        int total = 0;
        try {
            String sql = "SELECT a.saleprice as d from Bill b inner join Account a on b.aid=a.aid \n"
                    + "WHERE startdate= ?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, date);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                total = total + rs.getInt("d");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BusinessDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public int getProfit30day() {
        int profit = 0;

        try {

            long millis = System.currentTimeMillis();
            Date date = new java.sql.Date(millis);
            String sql = "SELECT a.saleprice*b.time-a.purchaseprice*b.time as profit from Bill b inner join Account a on b.aid=a.aid \n"
                    + "WHERE DATEDIFF(day,startdate,?) <=30";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setDate(1, date);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                profit = profit + rs.getInt("profit");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BusinessDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return profit;
    }

    public int getProfit(String startDate, String endDate) {
        int total = 0;
        try {

            String sql = "SELECT a.saleprice-a.purchaseprice as d from Bill b inner join Account a on b.aid=a.aid \n"
                    + "WHERE startDate>=? and startDate<=?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, startDate);
            stm.setString(2, endDate);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                total = total + rs.getInt("d");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BusinessDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public int getAllProfit() {
        int total = 0;
        try {

            String sql = "SELECT a.saleprice*b.time -a.purchaseprice*b.time d from Bill b inner join Account a on b.aid=a.aid";

            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                total = total + rs.getInt("d");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BusinessDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public int getProfitToDay() {
        int total = 0;
        try {

            long millis = System.currentTimeMillis();
            Date date = new java.sql.Date(millis);
            String sql = "SELECT a.saleprice*b.time -a.purchaseprice*b.time as profit from Bill b inner join Account a on b.aid=a.aid \n"
                    + "WHERE startdate=?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setDate(1, date);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                total = total + rs.getInt("profit");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BusinessDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

  
}
