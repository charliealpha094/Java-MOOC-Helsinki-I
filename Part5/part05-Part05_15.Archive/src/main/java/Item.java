/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Item {
    
    private String name;
    private String identifier;

    
    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
    
    public String getName() {
        return name;
    }
    
    public String getIdentifier() {
        return identifier;
    }
    
    public boolean equals(Object compared) {
        // If the variables are located in the same position, they are equal
        if(this == compared) {
            return true;
        }
        
        // If the compared object is not of Book type, the objects are not equal
        if(!(compared instanceof Item)) {
            return false;
        }
        
        // Convert the object to a Item object
        Item comparedItem = (Item) compared;
        
        if(this.identifier.equals(comparedItem.identifier)) {
            return true;
        } else {
            return false;

        }
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
