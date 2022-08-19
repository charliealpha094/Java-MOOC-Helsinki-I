
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        // Create a scanner to read the file
        try (Scanner scan = new Scanner(Paths.get("data.txt"))) {
            // Read the file until all the lines have been read
            while(scan.hasNextLine()) {
                // Read one line
                String row = scan.nextLine();
                // Print the line we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
