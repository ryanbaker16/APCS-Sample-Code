
public class CreditCardJIMMYGOTTSHALL {
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String args[]) {
		double interest = 0;
		double minPayment = 0;
		double previousAmount = promptDouble("Previous amount on the account: ");
		double charges = promptDouble("Charges on the account: ");
		double totalOwed = previousAmount + charges;
		 if (previousAmount != 0.0) {
		        interest = (totalOwed*0.02);
		    }
		    if (totalOwed<50.0) {
		        minPayment = totalOwed;
		    } else if (totalOwed<=300.0) {
		        minPayment = 50;
		    } else {
		        minPayment = totalOwed * 0.2;
		    }
		    System.out.println("CS CARD International Statement"+
		            			"\n==============================="+
		            			"\nPrevious Balance:    $"+round(previousAmount,2)+
		            			"\nAdditional Charges:  $"+round(charges,2)+
		            			"\nInterest:            $"+round(interest,2)+
		            			"\n"+
		            			"\nNew Balance:         $"+round(totalOwed,2)+
		            			"\n"+
		            			"\nMinimum Payment:     $"+round(minPayment,2));
		}
	public static double promptDouble(String phrase) {
		double out = 0;
		System.out.println(phrase);
		out = scan.nextDouble();
		return out;
	}
	public static double round(double a,int places) {
		int b = (int)(a*Math.pow(10,places));
		a = (double)b/Math.pow(10, places);
		return a;
	}
}
