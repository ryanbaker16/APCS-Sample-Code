import java.util.Scanner;
public class LazyDays {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("What temperature is it outside?");
	double temp = scan.nextDouble();
	String out="";
	if (temp>=80) {
		out="swimming";
	}else if(temp>=60) {
		out="tennis";
	}else if (temp>=40) {
		out="golf";
	}else {
		out="skiing";
	}
	System.out.println("You should go: "+out);
	}
}
//4 min, 32 secs
