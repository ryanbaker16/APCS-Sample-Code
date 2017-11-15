import java.util.Scanner;

public class Rock {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Rock, Paper, Scissors?");
		String x = scan.nextLine().toUpperCase();
		int play = (int)Math.random()*3;
		String y = "";
		switch (play) {
		case 0:
			y="R";
			System.out.println("Comp. threw Rock");
			break;
		case 1:
			y="P";
			System.out.println("Comp. threw Paper");
			break;
		case 2:
			y="S";
			System.out.println("Comp. threw Scissors");
			break;
		}
		if (x.charAt(0)==y.charAt(0)) {
			System.out.println("Tie");
		} else {
			switch (x) {
			case "R":
				if (y=="S") {
					System.out.println("Win");
				} else {
					System.out.println("Loss");
				}
				break;
			case "P":
				if (y=="R") {
					System.out.println("Win");
				} else {
					System.out.println("Loss");
				}
				break;
			case "S":
				if (y=="P") {
					System.out.println("Win");
				} else {
					System.out.println("Loss");
				}
				break;
			}
		}
	}
}
//10 minutes