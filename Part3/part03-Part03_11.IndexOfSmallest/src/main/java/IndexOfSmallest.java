
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        System.out.println("Please, introduce some numbers: ");
        
        // Start an empty list
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true) {
            // Assign a variable to hold the value of the input
            int number = Integer.valueOf(scanner.nextLine());
            
            // Condition to leave the program
            if(number == 9999) {
                break;
            } else {
                // Add the user input numbers to the list
                list.add(number);
            }
        }
        
        int smallest = list.get(0);
        
        // loop through the numbers inside the list to find the smallest one
        for(int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if(smallest > number) {
                smallest = number;
            }
            

        }
        System.out.println("Smallest number: " + smallest);

        
        // Find the index of the smallest one
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == smallest) {
                System.out.println(smallest + " is at index " + i);
            }
        }

        
    }
}
