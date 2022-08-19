
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which files should have its contents printed? ");
        String fileName = scanner.nextLine();
        
        // Read the files
        // Create a scanner to read the file
        try(Scanner scan = new Scanner(Paths.get(fileName))) {
            // Read the file until all the lines have been read
            while(scan.hasNextLine()) {
                String row = scan.nextLine();
                // Print the line
                System.out.println(row);
            }
        } catch(Exception e) {
            System.out.println("Sorry, the reading has failed!");
        }
    }
}
