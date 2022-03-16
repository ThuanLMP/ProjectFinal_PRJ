/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author ITACHI
 */
public class Order {
    
    private String fullname;
    private String username;
    private String gmail;
    private String sdt;
    private String accNetf;
    private int slot;
    private int time;
    private Date startDate;
    private int price;
    private String type;
    
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getAccNetf() {
        return accNetf;
    }

    public void setAccNetf(String accNetf) {
        this.accNetf = accNetf;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Order{" + "fullname=" + fullname + ", username=" + username + ", gmail=" + gmail + ", sdt=" + sdt + ", accNetf=" + accNetf + ", slot=" + slot + ", time=" + time + ", startDate=" + startDate + ", price=" + price + ", type=" + type + '}';
    }
    
    
    
    
    
}
