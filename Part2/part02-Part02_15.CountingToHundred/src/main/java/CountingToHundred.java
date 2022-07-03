
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Make the user input a number
        System.out.println("");
        // Assign a new variable to the input
        int num = Integer.valueOf(scanner.nextLine());
        
        for(int i = num; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
