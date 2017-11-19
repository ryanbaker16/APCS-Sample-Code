//Tyler Liu (tylerliu), Gordon Zhao (gordongg), Leo Huang(SCLeo) and Davis Wang(wjx008)
//November 18th, 2017

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leaves {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner fileInput = new Scanner(new File("LeavesIN.txt"));
		 
		while(fileInput.hasNext()) {

			String[] nextLine = fileInput.nextLine().split(",");
			int[] diceRolls = new int[nextLine.length];
			for(int i = 0; i < nextLine.length; i++) {
				diceRolls[i] = Integer.parseInt(nextLine[i]);
			}
			
			System.out.println(calculateLeaves(diceRolls));
		}
		
	}
	
	public static int calculateLeaves(int[] arr) {
		int sum=0;
		for (int i:arr){
			if (i==3){sum+=2;}
			if (i==5){sum+=4;}
		}
		return sum;
	}
}
