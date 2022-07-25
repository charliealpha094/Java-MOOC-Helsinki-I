
//import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask input to the user
        System.out.println("Give name and birth years: ");
        
        // Intialize variable to hold the value of the sum and count
        int sum = 0;
        int count = 0;
        // Variable to keep track of the longest word
        String longestName = "";
        
        while(true) {
            // Assign a variable to hold the value of user input
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            }
            
            // Split the string
            String[] pieces = input.split(",");
            // Sum to calculate the average
            sum += Integer.valueOf(pieces[1]);
            count++;
            
            String name = pieces[0];
            if(name.length() > longestName.length()) {
                longestName = name;
            }            
            
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of birth years: " + (float)sum/count);
    }
}
