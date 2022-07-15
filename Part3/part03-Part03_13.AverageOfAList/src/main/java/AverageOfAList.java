
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        // Ask the user for input
        System.out.println("Please, insert some numbers: ");
        
        // Initialize an empty list
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true) {
            // Assign a variable to hold the value of the user input
            int input = Integer.valueOf(scanner.nextLine());
            
            // Condition to leave
            if(input == -1) {
                System.out.println("Thanks for using this program!! Bye!");
                break;
            } else {
                // Add the number inputs to the list
                list.add(input);
            } 
        }
        
        // Create an empty space
        System.out.println("");
        
        // Calculate the average
        int sum = 0;
        // Loop through the values in the list with a for-each loop
        for(Integer number: list) {
            // 1st: calculate the sum
            sum += number;
        }
        System.out.println("Average: " + sum/(float)list.size());
    }
}
