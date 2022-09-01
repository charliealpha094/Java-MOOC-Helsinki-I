
public class HealthStation {
    
    // Initialize a variable to count the weighings
    private int weighCount = 0;


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighCount += 1;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return weighCount;
    }

}
