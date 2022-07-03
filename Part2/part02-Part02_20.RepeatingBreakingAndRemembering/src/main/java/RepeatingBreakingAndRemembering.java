
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        // Part 1
        // Create needed variables for the loop
        System.out.println("Give numbers:");
        // Part 2
        int sum = 0;
        // Part 3
        int numberOfNums = 0;
        // Part 5
        int numberOfOdds = 0;
        int numberOfEvens = 0;
        
        while(true) {
            // read input
            int num = Integer.valueOf(scanner.nextLine());
            
            // end of loop
            if(num == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else if (num % 2 == 0) {
                numberOfEvens++;
                sum += num;
                numberOfNums++;
            } else {
                sum += num;
                numberOfNums++;
                numberOfOdds++;
                continue;
            } 
            
        }
        // Functionality to execute after the loop ends
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNums);
        // Part 4
        System.out.println("Average: " + sum/(float)numberOfNums);
        System.out.println("Even: " + numberOfEvens);
        System.out.println("Odd: " + numberOfOdds);
    }
}
