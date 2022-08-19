import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
        // Ask user for input
        System.out.println("Name: ");
        String name = scanner.nextLine();
        // Break the program
        if(name.isEmpty()) {
            break;
        }
        
        System.out.println("Duration: ");
        int duration = Integer.valueOf(scanner.nextLine());
        
        // Add the program name and duration to programs list
        programs.add(new TelevisionProgram(name, duration));
        }
        
        System.out.println("Program's maximum duration? ");
        int durationLimit = Integer.valueOf(scanner.nextLine());
        
        // Loop through the programs list
        for(TelevisionProgram program: programs) {
            if(program.getDuration() <= durationLimit) {
                System.out.println(program);
            }
        }
    }
}
