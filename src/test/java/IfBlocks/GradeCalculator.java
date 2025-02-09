package IfBlocks;

import org.testng.annotations.Test;

public class GradeCalculator {

    @Test
    public void GradeCalculator(){
        calculateGrade(90);
        calculateGrade(99);
        calculateGrade(87);
        calculateGrade(77);
        calculateGrade(60);
        calculateGrade(55);

    }

    public void calculateGrade(Integer a){
        String grade;
        if (a>=90){
            grade="A";
            System.out.println("The grade is " + grade);
        } else if (a>=80 && a<=89){
            grade="B";
            System.out.println("The grade is " + grade);
        } else if (a>=70 && a<=79){
            grade="C";
            System.out.println("The grade is " + grade);
        } else if (a>=60 && a<=69){
            grade="D";
            System.out.println("The grade is " + grade);
        }
        else if (a<=60){
            grade="F";
            System.out.println("The grade is " + grade);
        }
    }
}
