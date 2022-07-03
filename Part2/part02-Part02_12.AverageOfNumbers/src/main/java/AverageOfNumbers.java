
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a variable to hold the sum of the numbers
        int sumOfNums = 0;
        // Initialize a variable to hold the number of numbers
        int numOfNums = 0;
                
        // Ask for numbers repeadetly
        while(true) {
            // Ask the user for a number input
            System.out.println("Give a number: ");
            // Assign a new variable to the user input
            int num = Integer.valueOf(scanner.nextLine());
            
            // Conditionals
            if(num == 0) {
                break;
            } else {
                numOfNums++;
                sumOfNums += num; 
              //  double average = sumOfNums / (float)numOfNums;
            }
        }
        System.out.println("Average of the numbers: " + sumOfNums / (float)numOfNums);
    }
}
