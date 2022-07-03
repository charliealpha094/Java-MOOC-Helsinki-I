
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Assign a variable to track the value of the sum
        int sum = 0;

        // Ask for user input
        System.out.println("Last number? ");
        int n = Integer.valueOf(scanner.nextLine());
        
        // loop through the numbers
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);

    }

}
