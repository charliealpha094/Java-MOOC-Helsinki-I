/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
import java.util.ArrayList;

public class GradeRegister {
    
    private ArrayList<Integer> points;
    
    public GradeRegister() {
        this.points = new ArrayList<>();
    }
    
    // Method to add points
    public void addGrade(int gradesToAdd) {
        if(gradesToAdd >= 0 && gradesToAdd <= 100) {
            this.points.add(gradesToAdd);
        }
    }
    
    public String gradeAverage() {
        double result = 0;
        int sum = 0;
        
        for(int point: this.points) {
            sum += point;
        }
        result = 1.0 * sum / this.points.size();
        
        return result + "";
    }
    
    public String gradeAvgPass() {
        double result = 0;
        int sum = 0;
        int passCount = 0;
        
        for(int point: this.points) {
            
            if(point > 49) {
                passCount++;
                sum += point;
            }
        }
        
        result = 1.0 * sum / passCount;
        if(sum == 0) {
            return "-";
        } else {
            return result + "";
        }
        
    }
    
    public String passPercentage() {
        double result = 0;
        int count = 0;
        
        for(int point: this.points) {
            
            if(point > 49) {
                count++;
            }
        }
        result = 100.0 * count / points.size();
        return result + "";
    }
    
    // Converts received points into grades
    public static int pointsToGrade(int points) {
        int grade = 0;
        
        if(points < 50) {
            grade = 0;
        } else if(points < 60) {
            grade = 1;
        } else if(points < 70) {
            grade = 2;
        } else if(points < 80) {
            grade = 3;
        } else if(points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        
        return grade;
    }
    
    
    
    public void printGrades() {
        System.out.println("Point average (all): " + this.gradeAverage());
        System.out.println("Point average (passing): " + this.gradeAvgPass());
        System.out.println("Pass percentage: " + this.passPercentage());
    }
}
