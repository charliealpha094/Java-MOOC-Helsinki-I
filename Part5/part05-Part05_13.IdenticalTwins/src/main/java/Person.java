
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        // If the variables are located in the same position, they are equal
        if(this == compared) {
            return true;
        }
        
        // if the type of the compared objects is not Person, the objects are not equal
        if(!(compared instanceof Person)) {
            return false;  
        }
        
        // Convert the object type compared object
        // into a Person type object called comparedPerson
        Person comparedPerson = (Person) compared;
        
        // if the values of the object variables are the same, the objects are equal
        if(this.name.equals(comparedPerson.name) && 
                this.birthday.equals(comparedPerson.birthday) && 
                this.height == comparedPerson.height &&
                this.weight == comparedPerson.weight) { 
            return true; 
        }
        return false;
    }
        
        
}
