// Jiaxi Davis Wang
// 11/27/2017
// Peirod 3
// BandBooster
// Create a class of BandBooster
// 1.0

public class BandBooster {
    private String name;
    private int boxesSold;

    public BandBooster(String tempName) {
        name = tempName;
        boxesSold = 0;
    }

    public String getName() {
        return name;
    }

    public void updateSales(int addtionalBoxes) {
        boxesSold += addtionalBoxes;
    }

    public String toString() {
        return name + ": " + boxesSold + " boxes";
    }
}
