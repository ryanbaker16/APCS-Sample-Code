// Jiaxi Davis Wang
// 11/9/2017
// Peirod 3
// Factorials
// Find the factorials
// 1.0

import java.util.Scanner;

public class FactorialsDAVISWANG {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        int n, result = 1;

        do {
            System.out.print("Please enter a non-negative integer: ");
            n = scan.nextInt();
        } while (n < 0);

        System.out.print("The facctorial of " + n);
        if (n == 0) {
            result = 0;
        } else {
            while(n != 0) {
                result *= n;
                n--;
            }
        }
        System.out.println(" is " + result);
    }
}
