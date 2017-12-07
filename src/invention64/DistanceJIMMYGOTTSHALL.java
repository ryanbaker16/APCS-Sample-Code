/**
 *  Distance.java (Directions)
 *	Code Description: Computes the distance between two points
 * 	@author Jimmy Gottshall
 *	@version 10/19/2017
 *   @contact jimmygottshall@gmail.com
 */

import java.util.Scanner;


public class DistanceJIMMYGOTTSHALL
{
	/**
	 * main Method - calculates distance based on user integer value
	 * @param args
	 */
	public static void main (String[] args)
	{
		double x[]= {0,0},y[]= {0,0};
		double distance;       // distance between the points
		Scanner scan = new Scanner(System.in);	// scanner object used to read data 
		
		// Read in the two points 
		System.out.print ("Enter the coordinates of the first point " +
				   "(put a space between them): ");
		x[0] = scan.nextDouble(); 
		y[0] = scan.nextDouble();

		System.out.print ("Enter the coordinates of the second point: ");
		x[1] = scan.nextDouble();
		y[1] = scan.nextDouble();

		// Compute the distance
		distance = Math.sqrt(Math.pow((x[0]-x[1]), 2)+Math.pow((y[0]-y[1]), 2));
		// Print out the answer
		System.out.println("Distance between those points is: "+distance);
	}
}
