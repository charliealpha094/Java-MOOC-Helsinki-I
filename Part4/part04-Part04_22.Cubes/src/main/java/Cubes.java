
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        
        while(true) {
            String row = scanner.nextLine();
            
            if(row.equals("end")) {
                break;
            }
            
            // Convert String to integer
            number = Integer.valueOf(row);
            System.out.println(number * number * number);
        }
    }
}
