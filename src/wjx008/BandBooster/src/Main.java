// Jiaxi Davis Wang
// 11/27/2017
// Peirod 3
// BandBooster
// Create a class of BandBooster
// 1.0

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String n1, n2, n3;
        BandBooster b1, b2, b3;
        int week, currentWeek = 0;

        System.out.print("Please enter the first name: ");
        n1 = scan.nextLine();
        System.out.print("Please enter the second name: ");
        n2 = scan.nextLine();
        System.out.print("Please enter the third name: ");
        n3 = scan.nextLine();

        b1 = new BandBooster(n1);
        b2 = new BandBooster(n2);
        b3 = new BandBooster(n3);

        System.out.print("Please enter the weeks: ");
        week = scan.nextInt();

        while(currentWeek < week) {
            currentWeek++;
            System.out.println("This is the " + currentWeek + " week.");
            System.out.print("Please enter the number of boxes sold by " + b1.getName() + " this week: ");
            b1.updateSales(scan.nextInt());
            System.out.print("Please enter the number of boxes sold by " + b2.getName() + " this week: ");
            b2.updateSales(scan.nextInt());
            System.out.print("Please enter the number of boxes sold by " + b3.getName() + " this week: ");
            b3.updateSales(scan.nextInt());
        }
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }
}
