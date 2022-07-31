/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Debt {
    // Variables
    private double balance;
    private double interestRate;
    
    // Constructor
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    public void printBalance() {
        System.out.println("Balance: " + this.balance);
    }
    
    public void waitOneYear() {
        this.balance *= this.interestRate;
    }
}
