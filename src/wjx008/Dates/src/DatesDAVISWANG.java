// Jiaxi Davis Wang
// 11/7/2017
// Peirod 3
// Dates
// Compare the dates
// 1.0

import java.util.Scanner;

public class DatesDAVISWANG {
    /**
     * Main Method:
     * @param args
     */
    public static void main(String[] args) {
        int month, day, year;   //date read in from user
        int daysInMonth;        //number of days in month
        boolean monthValid, yearValid, dayValid;  //true if input from user is valid
        boolean leapYear;  //true if user's year is a leap year
        Scanner scan = new Scanner(System.in);

        //Get integer month, day, and year from user
        System.out.print("Enter the month: ");
        month = scan.nextInt();
        System.out.print("Enter the day: ");
        day = scan.nextInt();
        System.out.print("Enter the year: ");
        year = scan.nextInt();

        //Check to see if month is valid
        monthValid = month >= 1 && month <= 12;

        //Check to see if year is valid
        yearValid = year >= 1000 && year <= 2050;

        //Determine whether it's a leap year
        leapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        //Determine number of days in month
        if (monthValid) {
            if (month == 2) {
                if (leapYear) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
            } else if (month == 4 || month == 6 || month == 9 || month ==11) {
                daysInMonth = 30;
            } else {
                daysInMonth = 31;
            }
        } else {
            daysInMonth = 0;
        }

        //User number of days in month to check to see if day is valid
        dayValid = day >= 1 && day <= daysInMonth;

        //Determine whether date is valid and print appropriate message
        if (dayValid = true && monthValid == true && yearValid == true) {
            System.out.println("Date is valid");
            if (leapYear) {
                System.out.println("The year you entered is a leap year.");
            } else {
                System.out.println("The year you entered is not a leap year.");
            }
        } else {
            System.out.println("Date is not valid");
        }
    }
}


