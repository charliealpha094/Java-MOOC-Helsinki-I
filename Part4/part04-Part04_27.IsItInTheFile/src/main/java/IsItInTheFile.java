
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        // Create a boolean to check whether the name has been found or not
        boolean hasBeenFound = false;
        
        
        // Read the file
        // Create a scanner to read the file
        try(Scanner scanFile = new Scanner(Paths.get(file))) {
        
            // Read all the lines in the file
            while(scanFile.hasNextLine()) {
                // Read one line
                String row = scanFile.nextLine();
                if(searchedFor.equals(row)) {
                    hasBeenFound = true;
                }
            }
                
                if(hasBeenFound) {
                    System.out.println("Found!");
                } else {
                    System.out.println("Not found!");
                }
            
        } catch(Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
