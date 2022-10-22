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

public class TextUI {
    
    // Instance variables
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        
        while(true) {
            System.out.println("Give a command, please: ");
            String command = scanner.nextLine();
            
            if(command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if(command.equals("add")) {
                System.out.println("Please, give a word: ");
                String word = scanner.nextLine();
                
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                
                simpleDictionary.add(word, translation);
            } else if(command.equals("search")) {
                System.out.println("Word to be translated: ");
                String translated = scanner.nextLine();
                
                String translationWord = simpleDictionary.translate(translated);
                if(translationWord == null) {
                    System.out.println("Word " + translated + " was not found");
                } else {
                    System.out.println(translationWord);
                }
            }
            else {
                System.out.println("Unknown command");
            }
        }
            
        
    }
}
