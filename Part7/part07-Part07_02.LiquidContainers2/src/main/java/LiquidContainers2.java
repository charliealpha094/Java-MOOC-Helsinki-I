
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container firstContainer = new Container();
        Container secContainer = new Container();
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: " + firstContainer + "\n" + 
                    "Second: " + secContainer + "\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split("");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")) {
                firstContainer.add(amount);
            }
            
            else if(command.equals("move")) {
                if(amount <= 0 || firstContainer.contains() == 0) {
                    return;
                }
                if(firstContainer.contains() - amount < 0) {
                    amount = firstContainer.contains();
                } else {
                    firstContainer.remove(amount);
                    secContainer.add(amount);
                }
            }
            
            else if(command.equals("remove")) {
                secContainer.remove(amount);
            }

        }
    }

}
