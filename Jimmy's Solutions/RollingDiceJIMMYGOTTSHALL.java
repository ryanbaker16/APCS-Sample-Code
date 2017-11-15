/**
 *  RollingDice.java (Direction)
 * 	Code Description: Rolls the dice. LET'S ROLL!
 * 	@author Jimmy Gottshall
 *	@version 10/19/2017
 *   @contact jimmygottshall@gmail.com
 */

public class RollingDiceJIMMYGOTTSHALL {
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String args[]) {
		int sum=0;
		int die[] = multRoll(promptInt("Enter Number of Sides: "),promptInt("Enter Number of Die: "));
		System.out.println("Die are: ");
		for (int a:die) {
			System.out.println(a);
			sum+=a;
		}
		System.out.println("Sum is: "+sum);
		System.out.println("/'\\\"'/");
	}
	public static int roll(int n) {
		return (int)(Math.random()*n+1);
	}
	public static int[] multRoll(int n,int times) {
		int die[] = new int[times];
		for (int i=0;i<times;i++) {
			die[i] = roll(n);
		}
		return die;
	}
	public static String prompt(String phrase) {
		String out = "";
		System.out.println(phrase);
		out = scan.nextLine();
		return out;
	}
	public static int promptInt(String phrase) {
		int out = 0;
		System.out.println(phrase);
		out = scan.nextInt();
		return out;
	}
}
