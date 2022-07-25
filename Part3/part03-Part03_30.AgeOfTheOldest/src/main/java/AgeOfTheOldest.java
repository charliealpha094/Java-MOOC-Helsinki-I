
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        // System.out.println("Give name and age separated by a comma");
        
        // Create variable to hold value of the oldest age
        int oldest = 0;
        
        while(true) {
            // Assign a variable to hold the value of the input
            String input = scanner.nextLine();
            
            // Condition to leave
            if(input.equals("")) {
                break;
            }
            
            // Split the string
            String[] pieces = input.split(",");
            
            int age = Integer.valueOf(pieces[1]);
            
            if(age > oldest) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);


    }
}
