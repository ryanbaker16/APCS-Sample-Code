import java.util.Scanner;

public class main {
	static Scanner scan = new Scanner(System.in);
 public static void main(String[] args) {
	 BandBooster b[] = new BandBooster[3];
	 b[0] = new BandBooster(prompt("First name:"));
	 b[1] = new BandBooster(prompt("Second name:"));
	 b[2] = new BandBooster(prompt("Third name:"));
	 int weeks = Integer.valueOf(prompt("Weeks for the campaign:"));
	 for (int i=0;i<weeks;i++) {
		 System.out.println("Week "+i);
		 for (BandBooster a:b) {
			 a.updateSales(Integer.valueOf(prompt("Sales for "+a.getName())));
		 }
	 }
	 for (BandBooster a:b) {
		 System.out.println(a);
	 }
 }
 static String prompt(String str) {
	 System.out.println(str);
	 return scan.nextLine();
 }
}
