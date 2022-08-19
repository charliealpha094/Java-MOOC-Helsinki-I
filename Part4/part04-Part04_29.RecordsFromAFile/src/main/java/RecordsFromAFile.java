
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        
        // Read the file
        // Create a scanner to read the file
        try(Scanner scanFile = new Scanner(Paths.get(fileName))) {
            // Read the file
            while(scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
                
                // Split the string in different parts
                String[] pieces = line.split(",");
                String name = pieces[0];
                int age = Integer.valueOf(pieces[1]);
                
                if(age == 1) {
                    System.out.println(name + ", " + age + " year");
                } else {
                    System.out.println(name + ", " + age + " years");

                }
                
            }
        
        } catch(Exception e) {
            System.out.println("Reading the file " + fileName + " failed!");
        }

    }
}
