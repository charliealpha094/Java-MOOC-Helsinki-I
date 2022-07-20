
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Start by creating an array for the usernames and another for the passwords
        String[] usernames = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};
        
        // Prompt the user to give a username and a password
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        
        // loop through the elements in the array usernames
        // Create a boolean to use in the condition and give it value of false
        boolean isCorrect = false;
        for(int i = 0; i < usernames.length; i++) {
            if(username.equals(usernames[i]) && password.equals(passwords[i])) {
               isCorrect = true;
            } 
        }
        
        // Condition
        if(isCorrect) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
