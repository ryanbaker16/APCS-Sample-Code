// Jiaxi Davis Wang
// 11/7/2017
// Peirod 3
// Grades
// Find pass or not
// 1.0

import java.util.Scanner;

public class GradesDAVISWANG
{
    /**
     * main method:
     * @param args
     */

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double grade;  // a student's grade
        double sumOfGrades; // a running total of the student grades
        int numStudents; // a count of the students
        int numPass;     // a count of the number who pass
        int numFail;     // a count of the number who fail

        System.out.println ("\nGrade Processing Program\n");

        // Initialize summing and counting variables
        sumOfGrades = 0;
        numStudents = 0;
        numPass = 0;
        numFail = 0;

        // Read in the first grade
        System.out.print ("Enter the first student's grade: ");
        grade = scan.nextDouble();

        //
        while (0 <= grade )
        {
            sumOfGrades += grade;
            numStudents++;

            //
            numFail += grade < 60 ? 1 : 0;
            numPass += grade >= 60 ? 1 : 0;

            // Read the next grade
            System.out.print ("Enter the next grade (a negative to quit): ");
            grade = scan.nextDouble();
        }

        //
        if (0 < numStudents)
        {
            System.out.println ("\nGrade Summary: ");
            System.out.println ("Class Average: " + sumOfGrades/numStudents);
            System.out.println ("Number of Passing Grades: " + numPass);
            System.out.println ("Number of Failing Grades: " + numFail);
        }
        else
            System.out.println ("No grades processed.");
    }
}
