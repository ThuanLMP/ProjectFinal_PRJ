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
public class Account_netf {
    private int id;
    private String gmail;
    private String password;
    private int purPrice;
    private int salePrice;
    private int slot;
    private String type;
    private int active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPurPrice() {
        return purPrice;
    }

    public void setPurPrice(int purPrice) {
        this.purPrice = purPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Account_netf{" + "id=" + id + ", gmail=" + gmail + ", password=" + password + ", purPrice=" + purPrice + ", salePrice=" + salePrice + ", slot=" + slot + ", type=" + type + ", active=" + active + '}';
    }
    
    
}
