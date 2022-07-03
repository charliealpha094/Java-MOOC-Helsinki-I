
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.println("Enter a value: ");
        // Assign user input to a variable (1st num)
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Enter another value: ");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        // Operations and variable declaration for the result
        int sum = num1 + num2;
        double sqroute = Math.sqrt(sum);
        
        // Print the result of the operation
        System.out.println(sqroute);
    }
}
