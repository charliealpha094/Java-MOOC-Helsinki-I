/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Fitbyte {
    
    // Instance variables
    private int age;
    private int restingHeartRate;
    
    // Constructor
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * age);
        
        return (maximumHeartRate - restingHeartRate) * 
                (percentageOfMaximum) + (restingHeartRate);
    }
}
