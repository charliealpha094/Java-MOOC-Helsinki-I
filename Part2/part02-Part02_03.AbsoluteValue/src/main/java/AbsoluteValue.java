
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User input
        System.out.println("Give a number: ");
        // Assign user input to a variable
        int num = Integer.valueOf(scanner.nextLine());
        
        // conditionals
        if(num < 0) {
            int result = num * -1;
            System.out.println(result);
        } else {
            System.out.println(num);
        }
    }
}
