import java.util.Scanner;

public class TestNames {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("First Person");
		Name a = new Name(prompt("First Name:"),prompt("Middle Name:"),prompt("Last Name:"));
		System.out.println("Second Person");
		Name b = new Name(prompt("First Name:"),prompt("Middle Name:"),prompt("Last Name:"));
		System.out.println("Name\t\t\t"+"Last First\t\t"+"Initials\t"+"Length");
		System.out.println(a.firstMiddleLast()+"\t\t"+a.lastFirstMiddle()+"\t\t"+a.initials()+"\t\t"+a.length());
		System.out.println(b.firstMiddleLast()+"\t\t"+b.lastFirstMiddle()+"\t\t"+b.initials()+"\t\t"+b.length());
		System.out.println("Same name: "+a.equals(b));
	}
	 static String prompt(String str) {
		 System.out.println(str);
		 return scan.nextLine();
	 }
}
