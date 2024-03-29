/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Timer {
    // Variables
    private ClockHand hundSeconds;
    private ClockHand seconds;
    
    // Constructor
    public Timer() {
        this.hundSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        this.hundSeconds.advance();
        
        if(this.hundSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
    public String toString() {
        return seconds + ":" + hundSeconds;
    }
}
