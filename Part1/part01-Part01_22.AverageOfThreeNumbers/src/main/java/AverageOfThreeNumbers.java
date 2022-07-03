
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //1st number
        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        // 2nd number
        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        // 3rd number 
        System.out.println("Give the third number: ");
        int third = Integer.valueOf(scanner.nextLine());
        
        // Average
        double average = ((first * 1.0) + second + third) / 3;
        System.out.println("The average is " + average);
    }
}
