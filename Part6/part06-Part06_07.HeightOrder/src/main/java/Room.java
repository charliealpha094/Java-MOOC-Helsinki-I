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

public class Room {
    
    // Instance variables
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        if(this.persons.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        // Return a null reference if there are no elements
        if(this.persons.isEmpty()) {
            return null;
        }
        
        // Create an object reference for the object to be returned
        // if the first value is the first object on the list
        Person shortestPerson = this.persons.get(0);
        
        // Loop through the list
        for(Person person: persons) {
            // Compare each object on the list
            // To the shortestPerson - we compare the size of the heights
            // Since we're searching for the smallest,
            
            if(person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }
        
        // finally, the object reference describing the
        // return object must be returned
        return shortestPerson;
    }
    
    public Person take() {
        if(this.persons.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = shortest();
        this.persons.remove(shortestPerson);
        return shortestPerson;
    }
}
