// Jiaxi Davis Wang
// 10/3/2017
// Peirod 3
// PaintDAVISWANG
// PaintDAVISWANG as instruction
// 1.0

import java.util.Scanner;
public class PaintDAVISWANG
{
    /**
     * main method -
     * @param args
     */
    public static void main(String[] args)
    {
        //declare a scanner class object
        Scanner scan =  new Scanner(System.in);

        final int COVERAGE = 350;  //paint covers 350 sq ft/gal

        //declare integers length, width, and height;
        int length, width, height, door, window;

        //declare double totalSqFt;
        double totalSqFt;

        //declare double paintNeeded;
        double paintNeeded;

        //Prompt for and read in the length of the room
        System.out.print("Please enter the length, then press enter: ");
        length = scan.nextInt();

        //Prompt for and read in the width of the room
        System.out.print("Please enter the width, then press enter: ");
        width = scan.nextInt();

        //Prompt for and read in the height of the room
        System.out.print("Please enter the height, then press enter: ");
        height = scan.nextInt();

        System.out.print("Please enter the number of door(s) in the room, then press enter: ");
        door = scan.nextInt();

        System.out.print("Please enter the number of window(s) in the room, then press enter: ");
        window = scan.nextInt();

        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        totalSqFt = 2 * ( height * width + length * height ) - door * 20 - window * 15;

        //Compute the amount of paint needed
        paintNeeded = totalSqFt / COVERAGE;

        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        System.out.print("\nThe room's properties are as following:\nlength:\t\t\t\t" + length + "\nwidth:\t\t\t\t"
                + width + "\nheight:\t\t\t\t" + height + "\nnumber of doors:\t" + door + "\nnumber of windows:\t"
                + window + "\nNumber of gallons of paint needed:\t" + paintNeeded);

    }
}
