
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1st user input
        System.out.println("Give a number: ");
        // Assign user input to a variable
        int num1 = Integer.valueOf(scanner.nextLine());
        
        // 2nd user input
        System.out.println("Give another number: ");
        // Assign user input to a variable
        int num2 = Integer.valueOf(scanner.nextLine());
        
        // conditionals
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is smaller than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
