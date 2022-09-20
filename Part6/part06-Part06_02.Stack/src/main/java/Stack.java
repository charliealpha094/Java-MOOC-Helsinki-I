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

public class Stack {
    
    // Instance variables
    private ArrayList<String> items;
    
    // Constructor
    public Stack() {
        this.items = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if(items.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value) {
        this.items.add(value);
    }
    
    public ArrayList<String> values() {
        return this.items;
    }
    
    public String take() {
        String last = items.get(items.size() - 1);
        
        items.remove(last);
        return last;
    }
}
