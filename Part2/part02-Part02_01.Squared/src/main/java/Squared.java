
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.println("");
        // Assign user input to a variable
        int num = Integer.valueOf(scanner.nextLine());
        
        // Operation and declare variable for the result
        int square = num * num;
        
        // Print the result of the operation
        System.out.println(square);
    }
}
