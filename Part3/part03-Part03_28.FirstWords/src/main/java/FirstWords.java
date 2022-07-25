
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        // System.out.println("Write something, please (blank to exit): ");
        
        while(true) {
            // Assgin a variable to hold the value of user input
            String input = scanner.nextLine();
            
            // Split the string
            String[] pieces = input.split(" ");
            
            // Condition to leave
            if(input.equals("")) {
                break;
            }
            
            // Output the 1st word of the string
            System.out.println(pieces[0]);
        }
    }
}
