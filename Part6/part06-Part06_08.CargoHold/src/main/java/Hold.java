/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
import java.util.ArrayList;

public class Hold {
    
    // Instance variables
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    // Constructor
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight() {
       // Initialize a variable to hold the value of the sum
       int sumWeight = 0;
       for(Suitcase suitcase: suitcases) {
           sumWeight += suitcase.totalWeight();
       }
       return sumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        for(Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
