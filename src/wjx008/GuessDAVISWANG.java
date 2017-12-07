// Jiaxi Davis Wang
// 11/9/2017
// Peirod 3
// Factorials
// Find the factorials
// 1.0

import java.util.Scanner;
import java.util.Random;

public class GuessDAVISWANG {
    public static void main (String[] args) {
        int numToGuess;       //Number the user tries to guess
        int guess;            //The user's guess
        int numGuess = 1, high = 0, low = 0;

        Random generator = new Random();
        Scanner scan = new Scanner(System.in);

        //randomly generate the  number to guess
        numToGuess = generator.nextInt(10);
        numToGuess++;
        //print message asking user to enter a guess
        System.out.print("Please enter a guess: ");
        //read in guess with Scanner class
        guess = scan.nextInt();
        while(guess != numToGuess)  //keep going as long as the guess is wrong
        {
            //print message saying guess is wrong
            System.out.print("Guess is wrong. ");
            //get another guess from the user
            if(guess > numToGuess) {
                System.out.print("Your guess is too high. ");
                high++;
            } else {
                System.out.print("Your guess is too low. ");
                low++;
            }
            System.out.print("Please enter another guess: ");
            guess = scan.nextInt();
            numGuess++;
        }

        //print message saying guess is right
        System.out.println("Guess is right.");
        System.out.println("Total guess: " + numGuess);
        System.out.println("Number of too high: " + high);
        System.out.println("Number of too low: " + low);
    }
}
