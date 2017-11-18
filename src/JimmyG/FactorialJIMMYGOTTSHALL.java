public class FactorialJIMMYGOTTSHALL {
public static void main(String args[]) {
	System.out.println("Input a number to be factorialed: ");
	int in = new java.util.Scanner(System.in).nextInt();
	System.out.println("Factorial of "+in+" is: "+factorial(in));
}
static int factorial(int n) {
	if (n==1) {return 1;
	} else {return n*factorial(n-1);}
}
}
