// Jiaxi Davis Wang
// 10/12/2017
// Peirod 3
// BaseConvertDAVISWANG
// Convert numbers in different bases
// 1.0

import java.util.Scanner;

public class BaseConvertDAVISWANG
{
    /**
     * main method -
     * @param args
     */
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int base;        // the new base
        int baseTenNum;   // the number in base 10
        double maxNumber;   // the maximum number that will fit
        // in 4 digits in the new base

        int placeZero;      // digit in the 1's (base^0) place
        int placeOne;      // digit in the base^1 place
        int placeTwo;      // digit in the base^2 place
        int placeThree;      // digit in the base^3 place

        int firstResult, secondResult, thirdResult, forthResult;

        String baseBNum = new String (""); // the number in the new base

        // read in the base 10 number and the base
        System.out.println();
        System.out.println ("Base Conversion Program");
        System.out.println();
        System.out.print ("Please enter a base (2 - 9): ");
        base = scan.nextInt();

        // Compute the maximum base 10 number that will fit in 4 digits
        // in the new base and tell the user what range the number they
        // want to convert must be in
        maxNumber = Math.pow(base, 4) - 1;
        System.out.println("The maxium value of the number you can enter is " + maxNumber);

        System.out.print ("Please enter a base 10 number to convert: ");
        baseTenNum = scan.nextInt();


        // Do the conversion (see notes in lab)
        placeZero = baseTenNum % base;
        firstResult = baseTenNum / base;
        if (firstResult != 0) {
            placeOne = firstResult % base;
            secondResult = firstResult / base;
            if (secondResult != 0) {
                placeTwo = secondResult % base;
                thirdResult = secondResult / base;
                if (thirdResult != 0) {
                    placeThree = thirdResult % base;
                    forthResult = thirdResult / base;
                } else {
                    placeThree = 0;
                }
            } else {
                placeTwo = 0;
                placeThree = 0;
            }
        } else {
            placeOne = 0;
            placeTwo = 0;
            placeThree = 0;
        }
        // Print the result (see notes in lab)
        System.out.println("The result is " + placeThree + placeTwo + placeOne + placeZero);

    }
}

