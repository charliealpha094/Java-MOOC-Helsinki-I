
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable to track the positive numbers
        int positiveNums = 0;
        // Variable to track the sum of the numbers
        int sumOfNums = 0;
        
        // Ask repeaditly for numbers
        while(true) {
            // Ask the user for input
            System.out.println("Give a number: ");
            // Assign a new variable to the user input
            int num = Integer.valueOf(scanner.nextLine());
            
            // Conditionals
            if (num > 0) {
                positiveNums++;
                sumOfNums += num;
            } else if (num == 0) {
                break;
            } 
            
        }
        
        if (positiveNums == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sumOfNums / (float)positiveNums);
        }

    }
}
