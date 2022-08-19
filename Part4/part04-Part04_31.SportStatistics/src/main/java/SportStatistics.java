
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String fileName = scan.nextLine();
        
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        
        // Initialize a counter to count the number of games
        int count = 0;
        
        int wins = 0;
        int losses = 0;
        
        // Read the file
        // Create a scanner to read the file
        try(Scanner scanFile = new Scanner(Paths.get(fileName))) {
            
            // Read all the lines in the file
            while(scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
                
                // Split the string in different parts
                String[] pieces = line.split(",");
                String homeTeam = pieces[0];
                String visitingTeam = pieces[1];
                int homePoints = Integer.valueOf(pieces[2]);
                int visitingPoints = Integer.valueOf(pieces[3]);
                
                if(homeTeam.equals(teamName)) {
                    count++;
                    
                    if(homePoints > visitingPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                    
                } else if(visitingTeam.equals(teamName)) {
                    count++;
                    
                    if(visitingPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        
        } catch(Exception e) {
            System.out.println("Reading the file " + fileName + " has failed!");
        }
    }

}
