
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask input to the user
        //System.out.println("Give a string (blank to exit)");
        
        while(true) {
            // Assign a variable to hold the value of the user input
            String input = scanner.nextLine();
            
            // Split the string
            String[] pieces = input.split(" ");
            
            // Condition to leave
            if(input.equals("")) {
                break;
            }
            
            for(String part: pieces) {
                if(part.contains("av")) {
                    System.out.println(part);
                }
            }
        }

    }
}
