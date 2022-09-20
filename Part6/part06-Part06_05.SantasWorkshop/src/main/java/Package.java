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

public class Package {
    
    // Instance variables
    private ArrayList<Gift> gifts;
    
    // Constructor
    public Package() {
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }
    
    public int totalWeight() {
        int sum = 0;
        
        for(Gift gift : gifts) {
            sum += gift.getWeight();
        }
        return sum;
    }
}
