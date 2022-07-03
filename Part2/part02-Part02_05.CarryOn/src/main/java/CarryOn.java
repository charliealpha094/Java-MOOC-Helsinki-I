
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // loop
        while(true) {
            System.out.println("Shall we carry on? ");
            String input = scanner.nextLine();
            
            // condition to break the loop
            if(input.equals("no")) {
                break;
            }
            
        }
        
    }
}
