// Jiaxi Davis Wang
// 10/4/2017
// Peirod 3
// IdealWeightDAVISWANG
// Calculate ideal weight
// 1.0

import java.util.Scanner;
public class IdealWeightDAVISWANG {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        boolean isMale = false, isValid = false;
        char gender;
        int feet, inch, totalInch, idealWeight;
        double idealWeightMin, idealWeightMax;
        while (!isValid) {
            System.out.print("Please enter your gender, m for male, f for female, then press enter: ");
            gender = scan.next().charAt(0);
            if (gender == 'm') {
                isMale = true;
                isValid = true;
            } else if (gender == 'f') {
                isMale = false;
                isValid = true;
            }
        }
        System.out.print("Please enter the feet part of your height, then press enter: ");
        feet = scan.nextInt();
        System.out.print("Please enter the inch part of your height, then press enter: ");
        inch = scan.nextInt();
        totalInch = feet * 12 + inch - 5 * 12;
        if (totalInch < 0) {
            if (isMale) {
                idealWeight = 106;
            } else {
                idealWeight = 100;
            }
        } else {
            if (isMale) {
                idealWeight = 106 + totalInch * 6;
            } else {
                idealWeight = 100 + totalInch * 5;
            }
        }
        idealWeightMin = 0.85 * idealWeight;
        idealWeightMax = 1.15 * idealWeight;
        System.out.print("The ideal weight for you ranges from " + idealWeightMin + " to " + idealWeightMax + ".");
    }
}
