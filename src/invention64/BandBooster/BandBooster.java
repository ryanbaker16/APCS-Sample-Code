
public class BandBooster {
	String name;
	private int boxesSold;
	BandBooster(String name){
		this.name = name;
		this.boxesSold=0;
	}
	public String getName() {
		return name;
	}
	public void updateSales(int sales) {
		boxesSold+=sales;
	}
	public String toString() {
		return (name+": "+boxesSold+" boxes");
	}
	
}
