
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
    
    public String toString() {
        String printOutput = "The collection " + this.name;
        
        if(elements.isEmpty()) {
            return printOutput + " is empty.";
        }
        
        // Form a string from the values on the list
        String valuesPrint = "";
        
        for(String element : elements) {
            if(elements.size() <= 1) {
                valuesPrint = element;
            } else {
                valuesPrint += element + "\n";
            } 
        }
        
        // Form a string from the elements on the list
        String elementsString = "";
        
        if(elements.size() > 1) {
            elementsString = "elements:\n";
        } else {
            elementsString += "element:\n"; 
        }
        return printOutput + " has " + elements.size() + " " 
                + elementsString + valuesPrint;
    }
}
