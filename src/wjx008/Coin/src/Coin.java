public class Coin
{
    public final int HEADS = 0;
    public final int TAILS = 1;

    private double value;
    private int face;

    /**
     *   Sets up the coin by flipping it initially.
     */
    public Coin ()
    {
        value = .05;
        flip();
    }

    /**
     *   Sets up the coin by flipping it initially.
     */
    public Coin (double coinValue)
    {
        value = coinValue;
        flip();
    }

    /**
     *   Flips the coin by randomly choosing a face.
     */
    public void flip()
    {
        face = (int) (Math.random() * 2);
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
    public boolean equals(Coin c)
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
    }
}