// Jiaxi Davis Wang
// 11/9/2017
// Peirod 3
// PowersOfTwo
// Calculate Powers of Two
// 1.0

import java.util.Scanner;

public class PowersOfTwoDAVISWANG
{
    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        int numPowersOfTwo;        //How many powers of 2 to compute
        int nextPowerOfTwo = 1;    //Current power of  2
        int exponent = 1;            //Exponent for current power of 2 -- this
        //also serves as a counter for the loop
        Scanner scan = new Scanner(System.in);

        System.out.println("How many powers of 2 would you like printed?");
        numPowersOfTwo = scan.nextInt();

        //print a message saying how many powers of 2 will be printed
        System.out.println("Here are the first " + numPowersOfTwo + " powers of 2:");
        //initialize exponent -- the first thing printed is 2 to the what?
        System.out.println("2^0\t=\t" + nextPowerOfTwo);
        //
        while (numPowersOfTwo != 0) {
            //find next power of 2 -- how do you get this from the last one?
            nextPowerOfTwo *= 2;
            //print out current power of 2
            System.out.println("2^" + exponent + "\t=\t" + nextPowerOfTwo);
            //increment exponent
            exponent++;
            numPowersOfTwo--;
        }
    }
}


