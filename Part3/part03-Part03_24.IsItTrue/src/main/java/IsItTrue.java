
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to give a string
        System.out.println("Give a string: ");
        // Assign a variable to the input user gave
        String input = scanner.nextLine();
        
        if(input.equals("true")){
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }

    }
}
