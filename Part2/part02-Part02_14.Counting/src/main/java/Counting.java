
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer input from the user
        System.out.println("");
        // Assign a variable to the user input
        int num = Integer.valueOf(scanner.nextLine());
        
        for(int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}
