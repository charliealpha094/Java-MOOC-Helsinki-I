
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask a number to the user
        System.out.println("Give a number: ");
        // Assign a new variable to hold the value of the input number
        int num = Integer.valueOf(scanner.nextLine());
        
        // Create a variable to hold the final result
        int result = 1;
        
        // Loop through the input numbers
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Factorial: " + result);
    }
}
