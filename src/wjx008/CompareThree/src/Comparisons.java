// Jiaxi Davis Wang
// 12/7/2017
// Peirod 3
// CompareThree
// Comparable Interface
// 1.0

import java.util.Scanner;

public class Comparisons {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter three strings...");
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();
        System.out.println("The largest string is: " + CompareThreeDAVISWANG.largest(a, b, c));

        System.out.println("Please enter three integers...");
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();
        System.out.println("The largest integer is: " + CompareThreeDAVISWANG.largest(d, e, f));

    }
}
