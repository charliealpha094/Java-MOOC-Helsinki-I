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

public class Suitcase {
    
    // Instance variables
    private ArrayList<Item> items;
    private int maxWeight;

    
    // Constructor
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight() {
        // Initialize a variable to hold the value of the sum
        int sumWeight = 0;
        for(Item item: items) {
            sumWeight += item.getWeight();
        }
        return sumWeight;
    }
    
    public void addItem(Item item) {
        if((item.getWeight() + this.totalWeight()) <= maxWeight) {
            this.items.add(item);
        } 
           
    }
    
    public String toString() {
        if(this.items.size() == 0) {
            return "no items (" + this.totalWeight() + " kg)";
        } else if(this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        // print all the items in the suitcase
        for(Item item: items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        // Return a null reference if there aren't elements in the items list
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        // loop through the items list
        for(Item item: items) {
            if(item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }    
}
