
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Initialize the two containers
        int firstContainer = 0;
        int secContainer = 0;      
        // attribute the maximum volume
        int maxVolume = 100;


        while (true) {
            
            System.out.println("First: " + firstContainer + "/" + maxVolume);
            System.out.println("Second: " + secContainer + "/" + maxVolume);
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" "); 
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
           
            if(command.equals("add") && amount > 0) {
                if(firstContainer <= maxVolume) {
                    firstContainer += amount;
                } if(firstContainer > maxVolume) {
                    firstContainer = maxVolume;
                }
            }
            
            else if(command.equals("move") && amount > 0) {
                if(firstContainer - amount >= 0) {
                    secContainer += amount;
                    firstContainer -= amount;
                    
                    if(secContainer >= maxVolume) {
                        secContainer = maxVolume;
                    }
                }
                else if(firstContainer - amount < 0) {
                    secContainer += firstContainer;
                    firstContainer = 0;
                }
            }
            
            else if(command.equals("remove") && amount > 0) {
                if(secContainer - amount >= 0) {
                    secContainer -= amount;
                }
            }
            
        }
    }

}
