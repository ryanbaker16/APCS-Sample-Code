// Jiaxi Davis Wang
// 10/19/2017
// Peirod 3
// StringManipsDAVISWANG
// Manipulate strings
// 1.0

import java.util.Scanner;

public class StringManipsDAVISWANG
{
    /**
     * main Method - manipulating string objects
     *	@param args
     */
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String phrase = new String ("This is a String test.");
        String middleThree = new String();
        String firstHalf = new String();   // first half of the phrase String
        String secondHalf = new String();  // second half of the phrase String
        String switchedPhrase = new String(); // a new phrase with original halves switched
        String city = new String();
        String state = new String();
        String cityState = new String();

        System.out.print("Enter the city you live in(then press enter): ");
        city = scan.nextLine();
        System.out.print("Enter the state you live in(then press enter): ");
        state = scan.nextLine();

        int phraseLength;   // number of characters in the phrase String
        int middleIndex;    // index of the middle character in the String

        // compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;

        // get the substring for each half of the phrase
        firstHalf = phrase.substring(0, middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        middleThree = phrase.substring(middleIndex - 1, middleIndex + 2);

        // concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = secondHalf.concat(firstHalf);
        switchedPhrase = switchedPhrase.replaceAll(" ", "*");

        // print information about the phrase
        System.out.println();
        System.out.println("Original phrase: " + phrase);
        System.out.println("length of the phrase: " + phraseLength + " characters");
        System.out.println("Index of the middle: " + middleIndex);
        System.out.println("Character at the middle index: " + phrase.charAt(middleIndex));
        System.out.println("Switched phrase: " + switchedPhrase);
        System.out.println();
        System.out.println("The middle three charaters of the phrase: " + middleThree);
        System.out.println(state.toUpperCase() + city.toLowerCase() + state.toUpperCase());
    }
}







