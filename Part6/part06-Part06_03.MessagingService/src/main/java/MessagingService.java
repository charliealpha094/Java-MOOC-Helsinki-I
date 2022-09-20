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

public class MessagingService {
    
    // Instance variables
    private ArrayList<Message> messages;
    
    // Constructor
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    
    public void add(Message message) {
        if(message.getContent().length() <= 280) {
            this.messages.add(message);
        }  
    }
    
    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
