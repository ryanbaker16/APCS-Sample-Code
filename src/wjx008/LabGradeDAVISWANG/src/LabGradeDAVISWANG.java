// Jiaxi Davis Wang
// 10/6/2017
// Peirod 3
// LabGradeDAVISWANG
// Calculate Grade
// 1.0


import java.util.Scanner;
public class LabGradeDAVISWANG
{
    /**
     *  main method - Read in grades for pre-lab, lab, and post-lab
     *                and compute a weighted average for the lab grade.
     *  @param args
     */
    public static void main (String[] args)
    {
        // Declare constants
        double inWeight;  // in-class weight is 60%
        double outWeight; // out-of-class weight is 40%

        // Declare variables
        double preLabPts, preLabMax;    //number of points earned & max points on the pre-lab assignment
        double labPts, labMax;       //number of points earned & max points on the lab
        double postLabPts, postLabMax;   //number of points earned & max points on the post-lab assignment

        double outClassAvg;  //average on the out of class (pre and post) work
        double inClassAvg;   //average on the in-class work
        double labGrade;  //final lab grade

        Scanner scan = new Scanner(System.in);

        // Get the input
        System.out.println("\nWelcome to the Lab Grade Calculator\n");
        System.out.print("Enter the number of points you earned on the pre-lab: ");
        //read pre-lab points
        preLabPts = scan.nextDouble();
        System.out.print("What was the maximum number of points you could have earned? ");
        //read preLabMax points
        preLabMax = scan.nextDouble();
        System.out.print("Enter the number of points you earned on the lab: ");
        //read labPts points
        labPts = scan.nextDouble();
        System.out.print("What was the maximum number of points for the lab? ");
        //read labMax points
        labMax = scan.nextDouble();
        System.out.print("Enter the number of points you earned on the post-lab: ");
        //read postLabPts points
        postLabPts = scan.nextDouble();
        System.out.print("What was the maximum number of points for the post-lab? ");
        //read postLabMax points
        postLabMax = scan.nextDouble();

        System.out.print("What is the weighted decimal of in-class work? ");
        inWeight = scan.nextDouble();

        // Calculate the average for the out of class work
        outClassAvg = (preLabPts + postLabPts) / (preLabMax + postLabMax) * 100;

        // Calculate the average for the in-class work
        inClassAvg = labPts / labMax * 100;

        // Calculate the weighted average taking 40% of the out-of-class average
        // plus 60% of the in-class
        labGrade = inClassAvg * inWeight + outClassAvg * (1 - inWeight);

        // Print the results
        System.out.println("\nYour average on out-of-class work is " + outClassAvg + "%");
        System.out.println("Your average on in-class work is " + inClassAvg + "%");
        System.out.println("Your lab grade is " + labGrade + "%");
        System.out.println();

    }
}

