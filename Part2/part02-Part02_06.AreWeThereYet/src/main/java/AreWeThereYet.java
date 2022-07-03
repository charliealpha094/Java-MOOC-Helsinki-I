
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Ask input to user
            System.out.println("Give a number: ");
            // Assign input to a new variable
            int num = Integer.valueOf(scanner.nextLine());
            
            // Conditionals
            if (num == 4) {
                break;
            }
            
        }
    }
}
