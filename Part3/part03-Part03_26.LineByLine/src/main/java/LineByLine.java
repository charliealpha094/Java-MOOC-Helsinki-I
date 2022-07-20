
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask a string to the user
        //System.out.println("Please, give a string: ");
        
        // while loop to keep asking
        while(true) {
            // Assign a variable to the user input
            String input = scanner.nextLine();
            
            // Split the string
            String[] pieces = input.split(" ");
            
            // Condition to leave
            if(input.equals("")) {
                break;
            }
            
            for(int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
        }
       

    }
}
