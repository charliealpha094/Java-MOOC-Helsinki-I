
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        // Ask the user for the first index
        System.out.println("From where? ");
        // Assign variable to first index
        int start = Integer.valueOf(scanner.nextLine());
       
        System.out.println("To where? ");
        int finnish = Integer.valueOf(scanner.nextLine());
        // Display the numbers
        System.out.println(numbers.get(start));
        System.out.println(numbers.get(finnish));
    }
}
