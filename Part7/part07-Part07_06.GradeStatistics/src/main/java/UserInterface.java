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
   private GradeRegister register;
   private Scanner scanner;
   
   public UserInterface(Scanner scanner, GradeRegister register) {
       this.register = register;
       this.scanner = scanner;
   }
   
   public void start() {
       System.out.println("Enter point totals, -1 stops: ");
       while(true) {
           int gradePoint = Integer.valueOf(scanner.nextLine());
           
           if(gradePoint == -1) {
               register.printGrades();
               break;
           } else {
               register.addGrade(gradePoint);
           }
       }
   }
   
}

    

