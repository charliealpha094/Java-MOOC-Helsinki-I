/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Container {
    
    private int totalAmount;
    
    public Container() {
        this.totalAmount = 0;
    }
    
    public int contains() {
        return this.totalAmount;
    }
    
    public void add(int amount) {
        if(amount < 0) {
            return;
        } else if(this.contains() + amount <= 100) {
            totalAmount += amount;
        } else {
            this.totalAmount = 100;
        }
    }
    
    public void remove(int amount) {
        if(amount < 0) {
            return;
        } else if(this.contains() - amount >= 0) {
            totalAmount -= amount;
        } else {
            this.totalAmount = 0;
        }
    }
    
    public String toString() {
        return this.contains() + "/100";
    }
}
