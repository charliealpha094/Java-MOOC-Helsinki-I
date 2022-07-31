/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Song {
    // Variables
    private String name;
    private int seconds;
    
    // Constructor
    public Song(String name, int length) {
        this.name = name;
        this.seconds = length;
    }
    
    public String name() {
        return this.name;
    }
    
    public int length() {
        return this.seconds;
    }
}
