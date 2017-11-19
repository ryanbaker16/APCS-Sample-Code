//James Gottshall(invention64), Patrick Liao(LBYPatrick), Ryan Baker
//November 18th, 2017

import java.util.*;
import java.io.*;

class PrankPlanning {
	
	/* DO NOT MODIFY BELOW THIS LINE */
	public static void main(String[] args) throws FileNotFoundException {
			
		Scanner sc = new Scanner(new FileReader("PrankPlanningIN.txt"));
		while (sc.hasNext()) {
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				System.out.println(reverse(sc.next()));
			}
		}
	}
	/* DO NOT MODIFY ABOVE THIS LINE */

	final public static String reverse(String s) {
		/* YOUR CODE HERE */
		String output = new String();
		for(int i = s.length() -1; i >= 0; i--) output += s.charAt(i);
		return output;
	}

}