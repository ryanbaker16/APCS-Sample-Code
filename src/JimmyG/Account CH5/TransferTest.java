package Account;

import java.util.Scanner;

public class TransferTest {
	public static void main(String args[]) {
		/*1. Add a method public void transfer(Account acct, double amount) to the Account class that allows the user to transfer funds from one bank account to another. If acctOne and acctTwo are Account objects, then the call acctOne.transfer(acctTwo,957.80) should transfer $957.80 from acctOne to acctTwo.

2. Write a class TransferTest with a main method that creates two bank account objects and enters a loop that does the following:

* Asks if the user would like to transfer from accountOne to accountTwo, transfer from accountTwo to accountOne, or quit.

* If a transfer is chosen, asks the amount of the transfer, carries out the operation, and prints the new balance for each account.

* Repeats until the user asks to quit, then prints a summary for each account.

*/
		Scanner scan = new Scanner(System.in);
		Account acct1 = new Account(500, "Andy", 10);
		Account acct2 = new Account(500, "Brady",20);
		int x = 0;
		double amount;
		while (true) {
			System.out.println("Transfer from: \n1: Andy to Brady\n2: Brady to Andy\nNegative to Quit");
			x = scan.nextInt();
			if (x<0)
				break;
			System.out.println("Amount to Transfer");
			amount = scan.nextDouble();
			switch (x) {
			case 1:
				acct1.transfer(acct2, amount);
				break;
			case 2:
				acct2.transfer(acct1, amount);
				break;
			default:
				System.out.println("Invalid Selection");
			}
		}
		acct1.printSummary();
		acct2.printSummary();
	}
}
