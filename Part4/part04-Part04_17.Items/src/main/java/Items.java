
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            // Ask the user to input names
            System.out.println("Name: ");
            // Assign a variable to hold the value of the user input
            String name = scanner.nextLine();
            
            // Condition to leave the program
            if(name.isEmpty()) {
                break;
            } else {
                items.add(new Item(name));
            }
        }
        // Print the final results
        for(Item item: items) {
            System.out.println(item);
        }

    }
}
