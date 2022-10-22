
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();
        
        // Part 1
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);
        register.addGradeBasedOnPoints(88);
        
        System.out.println(register.averageOfGrades());
        
        // Part 2
        GradeRegister register2 = new GradeRegister();
        register2.addGradeBasedOnPoints(93);
        register2.addGradeBasedOnPoints(91);
        register2.addGradeBasedOnPoints(92);
        
        System.out.println(register2.averageOfGrades());

        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
    }
}
