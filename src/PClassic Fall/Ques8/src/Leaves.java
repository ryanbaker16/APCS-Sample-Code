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
		int tot = 0;
		for(int i : arr){
			if (i == 3) tot += 2;
			if (i == 5) tot += 4;
		}
		return tot;
	}
}
