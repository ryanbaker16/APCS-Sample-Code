// Jiaxi Davis Wang
// 10/27/2017
// Peirod 3
// SalaryDAVISWANG
// Calculate Salary
// 1.0

import java.util.Scanner;
import java.text.NumberFormat;

public class SalaryDAVISWANG
{
    /**
     *	Main Method:
     * @param args
     */
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //Define your constant variables



        double currentSalary=0;   // employee's current  salary
        double raise=0;           // amount of the raise
        double newSalary=0;       // new salary for the employee
        String rating= new String();         // performance rating

        System.out.print ("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.next();

        // Compute the raise using if ...
        if(rating.equals("Excellent")) {
            raise = currentSalary * 0.06;
        } else if(rating.equals("Good")) {
            raise = currentSalary * 0.04;
        }

        newSalary = currentSalary + raise;

        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary:       " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary:      " + money.format(newSalary));
        System.out.println();
    }
}
