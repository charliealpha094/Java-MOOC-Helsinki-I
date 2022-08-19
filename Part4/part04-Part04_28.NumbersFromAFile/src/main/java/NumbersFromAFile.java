
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        
        // Initialize a variable to count the numbers
        int count = 0;
        // Read the file
        // Create a Scanner to read the file
        try(Scanner scanFile = new Scanner(Paths.get(file))) {
            // Read all the lines in the file
            while(scanFile.hasNextLine()) {
                int row = Integer.valueOf(scanFile.nextLine());
                
                if(row >= lowerBound && row <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        
        } catch(Exception e) {
            System.out.println("Reading the file " + file + " failed!");
        }     
    }

}
