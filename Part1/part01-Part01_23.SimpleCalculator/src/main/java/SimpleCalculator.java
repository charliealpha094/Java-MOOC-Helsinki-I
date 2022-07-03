
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // 1st number
        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        // 2nd number
        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        
        // Calculations
        int sum = first + second;
        int diff = first - second;
        int product = first * second;
        double division = (first * 1.0) / second;
        
        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + diff);
        System.out.println(first + " * " + second + " = " + product);
        System.out.println(first + " / " + second + " = " + division);


    }
}
