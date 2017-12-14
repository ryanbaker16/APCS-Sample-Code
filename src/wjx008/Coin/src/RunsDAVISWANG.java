// Jiaxi Davis Wang
// 11/17/2017
// Peirod 3
// Run
// Run the dice
// 1.0

public class RunsDAVISWANG {
    /**
     * main method
     * @param args
     */
    public static void main (String[] args)
    {
        final int FLIPS = 10; // number of coin flips

        int currentRun = 0; // length of the current run of HEADS
        int maxRun = 0;     // length of the maximum run so far

        // Create a coin object
        BiasedCoinDAVISWANG coin = new BiasedCoinDAVISWANG();


        // Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++)
        {
            // Flip the coin & print the result
            coin.flip();
            System.out.println("The result is " + coin.toString());

            // Update the run information
            if(coin.getFace() == 0) {
                currentRun++;
                if(currentRun > maxRun) {
                    maxRun = currentRun;
                }
            } else {
                currentRun = 0;
            }

        }

        // Print the results
        System.out.println("The max run of HEADS is " + maxRun);
    }
}