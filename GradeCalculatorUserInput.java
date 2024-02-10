/*
This is a average grade calculator.
Author: Luis Eduardo Mello de Lara Resende
Last Update: 02/09/2001
 */

import java.util.Scanner;

public class GradeCalculatorUserInput {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter PSA grade");
        double PSA = inp.nextDouble();
        System.out.println("Enter final exam grade");
        double finalExam = inp.nextDouble();
        System.out.println("Enter midterm grade");
        double midterm = inp.nextDouble();
        System.out.println("Enter class prep grade");
        double classPrep = inp.nextDouble();
        System.out.println("Enter lab grade");
        double lab = inp.nextDouble();
        System.out.println("Enter attendence grade");
        double attendence = inp.nextDouble();

        double avgGrade = ((PSA * 0.2) + (finalExam * 0.3) + (midterm * 0.2) + (classPrep * 0.1) + (lab * 0.1) + (attendence * 0.1));

        if (avgGrade >= 90) {
            System.out.println("Your grade is A");
        }
        else if(avgGrade >= 80)
        {
            System.out.println("Your grade is B");
        }
        else if(avgGrade >= 70)
        {
            System.out.println("YOur grade is C");
        }
        else if(avgGrade >= 60)
        {
            System.out.println("Your grade is D");
        }
        else
        {
            System.out.println("Your grade is F");
        }
    }

}
