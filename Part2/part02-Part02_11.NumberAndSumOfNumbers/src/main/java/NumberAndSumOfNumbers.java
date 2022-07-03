
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a variable to hold number of numbers
        int numOfNums = 0;
        // Initialize a variable to hold sum of numbers
        int sumOfNums = 0;
        
        // Ask for a number repeatedly with a while loop
        while(true){
            // Ask the user to input a number
            System.out.println("Give a number: ");
            // Assign a new variable to the user input
            int num = Integer.valueOf(scanner.nextLine());
            
            // Conditionals
            if(num == 0) {
                break;
            } else {
                numOfNums++;
                sumOfNums += num;
            }
        }
        System.out.println("Number of numbers: " + numOfNums);
        System.out.println("Sum of the numbers: " + sumOfNums);
    }
}
