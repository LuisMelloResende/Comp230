/*
This is a average grade calculator.
Author: Luis Eduardo Mello de Lara Resende
Last Update: 02/09/2001
 */

public class GradeCalculatorArgs {
   public static void main(String[] args) {


       double PSA = Double.parseDouble(args[0]);
       double finalExam = Double.parseDouble(args[1]);
       double midterm = Double.parseDouble(args[2]);
       double classPrep = Double.parseDouble(args[3]);
       double lab = Double.parseDouble(args[4]);
       double attendence = Double.parseDouble(args[5]);

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
