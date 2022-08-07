
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//         you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        // Objects
        Statistics statistics = new Statistics();
        Statistics statEvenNumbers = new Statistics();
        Statistics statOddNumbers = new Statistics();

        
        // Ask the user to input some numbers
        System.out.println("Enter numbers: ");
        
        // While loop to keep asking the user
        while(true) {
            // Assign a variable to hold the value of the 
            int input = Integer.valueOf(scanner.nextLine());
            
            // Condition to leave the program
            if(input == -1) {
                
                break;
            }
            // Add user input to statistics object
            statistics.addNumber(input);
            
            // Add numbers even numbers to even numbers object and odd to the odds object
            if(input % 2 == 0) {
                statEvenNumbers.addNumber(input);
            } else {
                statOddNumbers.addNumber(input);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statEvenNumbers.sum());
        System.out.println("Sum of odd numbers: " + statOddNumbers.sum());
        
        
        
        
//        Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
    }
}
