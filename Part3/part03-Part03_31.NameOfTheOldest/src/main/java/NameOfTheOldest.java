
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.println("Give, name and age separated by a comma");
        
        // Variable to hold the value of the oldest age
        int oldest = 0;
        // Variable to hold the name of the oldest person
        String oldestPerson = "";
        
        while(true) {
            // Assign a variable to hold the value of the user input
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            // Split the string
            String[] pieces = input.split(",");
            
            int age = Integer.valueOf(pieces[1]);
            String name = pieces[0];
            
            if(age > oldest) {
                oldest = age;
                oldestPerson = name;
            }
        }
        System.out.println("Name of the oldest: " + oldestPerson);
    }
}
