// Jiaxi Davis Wang
// 11/30/2017
// Peirod 3
// Name
// Create a class called Name
// 1.0

import java.util.Scanner;

public class TestNames {
    public static void main(String[] args) {

        Name n1, n2;
        String f1, f2, m1, m2, l1, l2;
        Scanner scan;

        scan = new Scanner(System.in);

        System.out.print("Please enter the first name for the first name: ");
        f1 = scan.next();
        System.out.print("Please enter the middle name for the first name: ");
        m1 = scan.next();
        System.out.print("Please enter the last name for the first name: ");
        l1 = scan.next();
        System.out.print("Please enter the first name for the second name: ");
        f2 = scan.next();
        System.out.print("Please enter the middle name for the second name: ");
        m2 = scan.next();
        System.out.print("Please enter the last name for the second name: ");
        l2 = scan.next();

        n1 = new Name(f1, m1, l1);
        n2 = new Name(f2, m2, l2);

        System.out.println("The first-middle-last name for the two names are: ");
        System.out.println(n1.firstMiddleLast());
        System.out.println(n2.firstMiddleLast());

        System.out.println("The last-first-middle name for the two names are: ");
        System.out.println(n1.lastFirstMiddle());
        System.out.println(n2.lastFirstMiddle());

        System.out.println("The initials for the two names are: ");
        System.out.println(n1.initials());
        System.out.println(n2.initials());

        System.out.println("The length for the two names are: ");
        System.out.println(n1.length());
        System.out.println(n2.length());

        System.out.println("The names are " + (n1.equals(n2) ? "" : "not ") + "the same.");
    }
}
