
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Assign a variable to track the sum value
        int sum = 0;

        // Ask the user to input a first number
        System.out.println("First number? ");
        // Assign variable to the first input
        int first = Integer.valueOf(scanner.nextLine());
        
        // Ask the user to input a second number
        System.out.println("Last number? ");
        // Assign a variable to the second input
        int second = Integer.valueOf(scanner.nextLine());
        
        // loop through the numbers
        for (int i = first; i <= second; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);  
    }
}
