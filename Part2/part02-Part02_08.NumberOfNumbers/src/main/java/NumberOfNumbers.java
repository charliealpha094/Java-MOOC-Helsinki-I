
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;
        
        while(true) {
            // Prompt user to input a number
            System.out.println("Give a number: ");
            // Assign a new variable to the user input
            int num = Integer.valueOf(scanner.nextLine());
            
            // Conditionals
            if(num == 0) {
                break;
            } else {
                numbers++;
                System.out.println(numbers);
            }
        }
    }
}
