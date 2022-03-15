/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ITACHI
 */
public class OrderDetail {
   private Account_netf account;
   private int month;

    public int getTotal(){
        return month*account.getSalePrice();
    }
    public Account_netf getAccount() {
        return account;
    }

    public void setAccount(Account_netf account) {
        this.account = account;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

     
    
}
