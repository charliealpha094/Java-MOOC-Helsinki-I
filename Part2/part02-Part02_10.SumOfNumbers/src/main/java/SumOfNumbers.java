
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a variable to hold the sum of the numbers
        int sum = 0;
        
        // Ask repeadetly for numbers
        while(true) {
            // Ask the user to give a number input
            System.out.println("Give a number: ");
            // Assign a new variable to the number input
            int num = Integer.valueOf(scanner.nextLine());
           
            // conditionals
            if(num == 0) {
                break;
            } else {
                // sum = num + sum;
                sum += num;
            }
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
