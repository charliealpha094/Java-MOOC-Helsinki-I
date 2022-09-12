
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an empty list
        ArrayList<Item> items = new ArrayList<>();

        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                break;
            }
            
            Item item = new Item(name, identifier);
            
            if(items.contains(item)) {
                System.out.println("Sorry. Alrady on the list.");
            } else {
                items.add(item);
            }
            
            
        }
        
        System.out.println("==Items==");
            
            for(Item i : items) {
                System.out.println(i);
            }
        
        
        
        
    }
}
