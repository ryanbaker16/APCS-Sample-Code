/** * ProcessTransactions.java * @author ppatel * @version 1/4/10 * A class to process deposits and withdrawals for two bank * accounts for a single day. */package Account;import java.util.Scanner;public class ProcessTransactions{    /**     * driver code to test account class.     * @param args     */    public static void main(String[] args)    {        Scanner scan = new Scanner(System.in);	Account acct[] = new Account[2];      //two test accounts	char keepGoing = 'y';         //more transactions?	char action;                  //deposit or withdraw	double amount;                //how much to deposit or withdraw	long acctNumber;              //which account to access	int days[][][] = new int[2][2][365];	int day;	//Create two accounts	acct[0] = new Account(1000.00, "Sue", 123);	acct[1] = new Account(1000.00, "Joe", 456);	System.out.println("The following accounts are available:\n");	acct[0].printSummary();	System.out.println();	acct[1].printSummary();	//while loop to run code	while ('y'== keepGoing || 'Y'== keepGoing  )	{		//get account number, what to do, and amount		p("Enter Day of Transaction");		day = scan.nextInt();		while (day>=365) {			day-=365;		}		System.out.print("\nEnter the number of the account you would like to access: ");		acctNumber = scan.nextLong();		System.out.print("Would you like to make a deposit (D) or withdrawal (W)? ");		action = scan.next().charAt(0);		System.out.print("Enter the amount: ");		amount = scan.nextDouble();				// add braces to the conditionals to improve readability.		//check user values and allow access to account		if (0 < amount) {		    if ( acct[0].getAcctNumber() == acctNumber ) {			if ('w'==action || 'W'== action ) {			    acct[0].withdraw(amount);			    days[0][0][day]++;			}			else if ('d' == action || 'D'== action ) {			    acct[0].deposit(amount);			    days[0][1][day]++;			}			else { 			    System.out.println("Sorry, invalid action.");			}		    }		    else if (acct[1].getAcctNumber() == acctNumber) {			if ('w'==action || 'W'==action) {			    acct[0].withdraw(amount);			    days[1][0][day]++;			}			else if ('d'==action || 'D'==action ) {			    acct[0].deposit(amount);			    days[1][1][day]++;			}			else {			    System.out.println("Sorry, invalid action.");			}		    }		    else			System.out.println("Sorry, invalid account number.");		} else {			System.out.println("Sorry, amount must be > 0.");		}		System.out.print("\nMore transactions? (y/n)");		keepGoing = scan.next().charAt(0);       }	//Print number of deposits	//Print number of withdrawals	//Print total amount of deposits	//Print total amount of withdrawals	int i = 0;	for (Account a : acct) {		p(a.getName());		p(a.getAcctNumber());		p("Withdraws: "+a.getWithdrawals());		p("Deposits:  "+a.getDeposits());		int j = 0;		for (int num: days[i][0]) {			if (num>1) {				p("On day "+j+" there was "+num+" withdrawals");			} else if (num==1) {				p("On day "+j+" there was "+num+" withdrawal");			}			j++;		}			j = 0;		for (int num: days[i][1]) {			if (num>1) {				p("On day "+j+" there was "+num+" deposits");			} else if (num==1) {				p("On day "+j+" there was "+num+" deposit");			}			j++;		}			i++;	}    }    public static <T> void p(T s)    {        System.out.println(s);    }}					