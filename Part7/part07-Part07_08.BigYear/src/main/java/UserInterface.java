/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdDatabase birdList;
    
    public UserInterface(Scanner scanner, BirdDatabase birdList) {
        this.scanner = scanner;
        this.birdList = birdList;
    }
    
    public void start() {
        
        try {
            while(true) {
                System.out.println("? ");
                
                String command = scanner.nextLine();
                
                switch(command.toLowerCase()) {
                    case "quit": 
                        break;
                    case "add":
                        System.out.println("Name: ");
                        String name = scanner.nextLine();
                        
                        System.out.println("Name in Latin ");
                        String latinName = scanner.nextLine();
                        birdList.addBird(new Bird(name, latinName));
                        
                        break;
                        
                    case "observation":
                        name = scanner.nextLine();
                        birdList.addObservationFromDB(name);
                        break;
                    case "all":
                        birdList.printBirdDatabase();
                        break;
                    case "one":
                        name = scanner.nextLine();
                        birdList.printBird(name);
                        break;
                    default:
                        System.out.println("Unknown command");
                }
            }
        } catch(Exception error) {
            System.out.println("There was an error: " + error.getMessage());
        }
    }
    
  
}
