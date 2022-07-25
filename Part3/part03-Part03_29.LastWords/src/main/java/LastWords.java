
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for some input
        // System.out.println("Please, give some strings: (blank to exit)");
        
        // while loop to keep asking
        while(true) {
            // Assign a variable to hold the value of the user input
            String input = scanner.nextLine();
            
            // Condition to leave
            if(input.equals("")) {
                break;
            }
            
            // Split the string
            String[] pieces = input.split(" ");
            
            // Find the last string
            String last = pieces[pieces.length - 1];
            
            // Output
            System.out.println(last);

        }

    }
}
