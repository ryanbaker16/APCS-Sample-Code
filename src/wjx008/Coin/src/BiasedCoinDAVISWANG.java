// Jiaxi Davis Wang
// 11/17/2017
// Peirod 3
// BiasedCoin
// Run Biased Coin
// 1.0

public class BiasedCoinDAVISWANG {
    private double bias;
    public final int HEADS = 0;
    public final int TAILS = 1;

    private double value;
    private int face;

    /**
     *   Sets up the coin by flipping it initially.
     */
    public BiasedCoinDAVISWANG ()
    {
        bias = 0.5;
        value = .05;
        flip();
    }

    /**
     *   Sets up the coin by flipping it initially.
     */
    public BiasedCoinDAVISWANG (double coinValue, double currentBias)
    {
        bias = currentBias;
        value = coinValue;
        flip();
    }

    /**
     *   Flips the coin by randomly choosing a face.
     */
    public void flip()
    {
        face = Math.random() < bias ? 0 : 1;
    }

    /**
     *  Returns the current face of the coin as an integer.
     *  @return face of the coin as an int
     */
    public int getFace()
    {
        return face;
    }

    /**
     *  compares two coins and determines if they are the same
     *  @param c the other coin
     *  @return boolean value of true or false based on coin value
     */
    public boolean equals(BiasedCoinDAVISWANG c)
    {
        return (this.value == c.value);
    }

    /**
     *   Returns the current face of the coin as a string.
     *   @return faceName a String representation of the coin
     */
    public String toString()
    {
        String faceName = new String();

        //determine if face has a value 0 or 1
        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";

        return faceName;
}}
