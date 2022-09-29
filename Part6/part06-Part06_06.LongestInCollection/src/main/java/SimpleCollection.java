
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest() {
        // Return a null reference if there's nothing on elements
        if(this.elements.isEmpty()) {
            return null;
        }
        
        // Crate an object reference for the object to be returned
        // It's first value is the first object on the list
        String longestString = this.elements.get(0);
        
        // Loop through the list
        for(String element: this.elements) {
            // Compare each object on the list
            // to the longestString -- we compare the size of strings
            // Since we're searching for the longes string,
            
            if(element.length() > longestString.length()) {
                // if we find a longer string in comparision
                // we assign it as the value of the longestString
                longestString = element;
            }
        }
        
        // Finally the object reference describing the 
        // return object is described
        return longestString;
    }

}
