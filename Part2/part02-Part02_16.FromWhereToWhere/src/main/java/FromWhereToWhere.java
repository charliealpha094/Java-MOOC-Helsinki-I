
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Ask input to the user (minimum number)
        System.out.println("Where to? ");
        // Assign a new variable to the user input
        int to = Integer.valueOf(scanner.nextLine());
        
        // Ask maxium number to the user
        System.out.println("Where from? ");
        // Assign variable
        int from = Integer.valueOf(scanner.nextLine());
        
        // for loop
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }
}
