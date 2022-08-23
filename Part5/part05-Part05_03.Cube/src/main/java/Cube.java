/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Cube {
    
    // Instance variables
    private int edgeLength;
    
    // Constructor
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    public int volume() {
        return this.edgeLength * this.edgeLength * this.edgeLength;
    }
    
    public String toString() {
        return "The length of the edge is " + this.edgeLength + 
                " and the volume is " + this.volume();
    }
}
