// Jiaxi Davis Wang
// 11/2/2017
// Peirod 3
// CreditCardDavisWang
// Calculate Balances about credit card
// 1.0

import java.util.Scanner;
import java.text.NumberFormat;

public class CreditCardDavisWang {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat dollar = NumberFormat.getCurrencyInstance();
        System.out.print("Please enter your previous balance: ");
        double previousBalance = scan.nextDouble();
        System.out.print("Please enter your additional charges: ");
        double addtionalCharges = scan.nextDouble();
        double interest = 0;
        if(previousBalance != 0) {
            interest = (previousBalance + addtionalCharges) * 0.02;
        }
        double newBalance = previousBalance + addtionalCharges + interest;
        double minimumPayment;
        if(newBalance < 50) {
            minimumPayment = newBalance;
        } else if(newBalance >= 50 || newBalance <= 300) {
            minimumPayment = 50;
        } else {
            minimumPayment = newBalance * 0.2;
        }
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.println("Previous Balance:\t\t" + dollar.format(previousBalance));
        System.out.println("Additional Charges:\t\t" + dollar.format(addtionalCharges));
        System.out.println("Interest:\t\t\t\t" + dollar.format(interest));
        System.out.println("\nNew Balance:\t\t\t" + dollar.format(newBalance));
        System.out.println("\nMinimum Payment:\t\t" + dollar.format(minimumPayment));
    }
}
