// Jiaxi Davis Wang
// 10/20/2017
// Peirod 3
// RollingDiceDAVISWANG
// Simulate Dices
// 1.0

import java.util.Random;

public class RollingDiceDAVISWANG {
    public static void main(String []args) {
        Random random = new Random();
        int firstDice, secondDice;
        firstDice = random.nextInt(6);
        secondDice = random.nextInt(6);
        firstDice += 1;
        secondDice += 1;
        int sum = firstDice + secondDice;
        System.out.println("The results are " + firstDice + " and " + secondDice + "\nThe total roll is " + sum);
    }
}
