// Jiaxi Davis Wang
// 11/13/2017
// Peirod 3
// Election
// Calculate election rate
// 1.0

import java.util.Scanner;

public class ElectionDAVISWANG
{
    /**
     *	main method-
     *  @param args
     */
    public static void main (String[] args)
    {
        int votesForPolly;  // number of votes for Polly in each precinct
        int votesForErnest; // number of votes for Ernest in each precinct
        int totalPolly = 0;     // running total of votes for Polly
        int totalErnest = 0;    // running total of votes for Ernest
        int pPolly = 0, pErnest = 0, pTie = 0;
        char response = 'Y';      // answer ('y' or 'n') to the "more precincts" question
        Scanner scan = new Scanner(System.in);

        System.out.println ();
        System.out.println ("Election Day Vote Counting Program");
        System.out.println ();

        // Initializations

        // Loop to "process" the votes in each precinct
        while(response == 'Y') {
            System.out.print("Please enter the vote for polly: ");
            votesForPolly = scan.nextInt();
            System.out.print("Please enter the vote for Ernest: ");
            votesForErnest = scan.nextInt();
            if(votesForErnest > votesForPolly) {
                pErnest++;
            } else if(votesForErnest < votesForPolly) {
                pPolly++;
            } else {
                pTie++;
            }
            totalPolly += votesForPolly;
            totalErnest += votesForErnest;
            System.out.println("Do you want to add another precinct?");
            response = scan.next().charAt(0);
            response = response == 'y' ? 'Y' : response;
        }
        int percentP = 100 * totalPolly / (totalPolly + totalErnest);
        int percentE = 100 * totalErnest / (totalPolly + totalErnest);

        // Print out the results
        System.out.println("\t\t\tPolly\tErnest\ttie");
        System.out.println("Votes\t\t" + totalPolly + "\t\t" + totalErnest);
        System.out.println("Percentage\t" + percentP + "\t\t" + percentE);
        System.out.println("Precincts\t" + pPolly + "\t\t" + pErnest + "\t\t" + pTie);
    }
}
