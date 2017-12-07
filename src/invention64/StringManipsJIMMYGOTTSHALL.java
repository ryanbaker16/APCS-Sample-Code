/**
 *  StringManips.java (Direction)
 * 	Code Description: Test several methods for manipulating String objects
 * 	@author Jimmy Gottshall
 *	@version 10/19/2017
 *   @contact jimmygottshall@gmail.com
 */


public class StringManipsJIMMYGOTTSHALL
{
	/**
	 * main Method - manipulating string objects
	 *	@param args
	 */
	public static void main (String[] args)
	{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String phrase = new String ("This is a String test.");
		String firstHalf = new String();   // first half of the phrase String
		String secondHalf = new String();  // second half of the phrase String
		String switchedPhrase = new String(); // a new phrase with original halves switched
		String middleThree = new String();
		String city,state = "";
		
		int phraseLength;   // number of characters in the phrase String
		int middleIndex;    // index of the middle character in the String

		// compute the length and middle index of the phrase
		phraseLength = phrase.length();
		middleIndex = (int) Math.floor(phraseLength/2);

		// get the substring for each half of the phrase
		firstHalf = phrase.substring(0,middleIndex);
		secondHalf = phrase.substring(middleIndex,phraseLength);
		middleThree = phrase.substring(middleIndex-1,middleIndex+2);
		
		// concatenate the firstHalf at the end of the secondHalf
		switchedPhrase = secondHalf.concat(firstHalf).replace(' ', '*');
		System.out.println("Enter your city:");
		city = scan.nextLine().toLowerCase();
		System.out.println("Enter your State:");
		state = scan.nextLine().toUpperCase();
		// print information about the phrase
		System.out.println("\noriginal phrase: "+phrase+
				"\nLength of the phrase: "+phraseLength+" characters"+
				"\nIndex of the middle: "+middleIndex+
				"\nCharacter at the middle index: "+phrase.charAt(middleIndex)+
				"\nSwitched phrase: "+switchedPhrase+
				"\nMiddle three characters: "+middleThree+
				"\nUsing your city and state information in a non-malicious way: "+state+city+state);
		System.out.println("UPLOADING DATA TO MAINFRAME");
		for(int i=0;i<10;i++) {
			System.out.print('#');
			try {
			Thread.sleep(250);
			}catch (Exception e) {
				System.out.println("upload interupted "+e);
				break;
			}
		}
		System.out.print(" DATA UPLOADED\n THANK YOU FOR YOUR TIME!");
	}
}







