
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize the total number of negatives count
        int negatives = 0;
        
        // loop through the input numbers
        while(true) {
            // Ask the user a number
            System.out.println("Give a number: ");
            // Assign a variable to the user input
            int num = Integer.valueOf(scanner.nextLine());
            
            // Conditionals
            if(num < 0) {
                negatives++;
            } else if (num == 0) {
                break;
            } else {
                continue;
            }

        }
        System.out.println("Number of negative numbers: " + negatives);

    }
}
