// Jiaxi Davis Wang
// 11/6/2017
// Peirod 3
// LazyDaysDAVISWANG
// find the appropriate activity
// 1.0

import java.util.Scanner;

public class LazyDaysDAVISWANG {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the temperature: ");
        double temp = scan.nextDouble();
        if(temp <= 95 && temp >= 20) {
            if(temp >= 80) {
                System.out.print("swimming");
            }
            if(temp < 80 && temp >= 60) {
                System.out.print("tennis");
            }
            if(temp < 60 && temp >= 40) {
                System.out.print("golf");
            }
            if(temp < 40) {
                System.out.print("skiing");
            }
        } else {
            System.out.print("Visit our shops!");
        }
    }
}
