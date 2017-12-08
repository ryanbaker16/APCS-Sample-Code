// Jiaxi Davis Wang
// 11/7/2017
// Peirod 3
// Rock
// Play Rock Paper Scissors with computer
// 1.0

import java.util.Scanner;
import java.util.Random;

public class RockDAVISWANG
{
    /**
     *	Main Method:
     * @param args
     */
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
        //computer's play

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();


        //Get player's play -- note that this is stored as a string
        System.out.print("Enter your play (R, P, or S): ");
        personPlay = scan.nextLine();

        //Make player's play uppercase for ease of comparison
        personPlay = personPlay.toUpperCase();

        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);

        //Translate computer's randomly generated play to string
        switch (computerInt)
        {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
                break;
            default:
                computerPlay = "";
        }

        //Print computer's play
        System.out.println("Computer play is: " + computerPlay);

        //See who won.  Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay))
        {
            System.out.println("It's a tie!");
        } else if (personPlay.equals("R")) {
            //
            if (computerPlay.equals("S"))
            {
                System.out.println("Rock crushes scissors.  You win!!");
            } else if (computerPlay.equals("P")) {
                System.out.println("Paper covers rock.  Computer win!!");
            }

            //...  Fill in rest of code
        } else if (personPlay.equals("P")) {
            if (computerPlay.equals("S")) {
                System.out.println("Scissors cuts paper.  Computer win!!");
            } else if (computerPlay.equals("R")) {
                System.out.println("Paper covers rock.  You win!!");
            }
        } else if (personPlay.equals("S")) {
            if (computerPlay.equals("R")) {
                System.out.println("Rock crushes scissors.  Computer win!!");
            } else if (personPlay.equals("P")) {
                System.out.println("Scissors cuts paper.  You win!!");
            }
        }
    }
}








