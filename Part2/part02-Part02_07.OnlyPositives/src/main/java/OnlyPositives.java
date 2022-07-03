
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            // Prompt the user to input a number
            System.out.println("Give a number: ");
            // Assign the user input to a new variable
            int num = Integer.valueOf(scanner.nextLine());
            
            // Conditionals
            if(num < 0) {
                System.out.println("Unsuitable number");
            } else if (num > 0) {
                int result = num * num;
                System.out.println(result);
            } else {
                break;
            }
        }
    }
}
