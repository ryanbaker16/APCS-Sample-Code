//James Gottshall(invention64), Patrick Liao(LBYPatrick), Ryan Baker
//November 18th, 2017

import java.util.*;
import java.io.*;

class ParkingSpots {
	
	/* DO NOT MODIFY BELOW THIS LINE */ 
    private static class Neighborhood {
	    int start;
	    int end;
	    Neighborhood() { start = 0; end = 0; }
	    Neighborhood(int s, int e) { start = s; end = e; }

	    public String toString() {
	    	return "[" + this.start + ", " + this.end + "]";
	    }
    }

    
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("ParkingSpotsIN.txt"));
		while (sc.hasNext()) {
			int N = sc.nextInt();
			List<Neighborhood> neighborhoods = new ArrayList<Neighborhood>();
			for (int i = 0; i < N; i++) {
				int s = sc.nextInt(), e = sc.nextInt();
				Neighborhood interval = new Neighborhood(s, e);
				neighborhoods.add(interval);
			}
			System.out.println(merge(neighborhoods));
		}
	}
	/* DO NOT MODIFY ABOVE THIS LINE*/
	public static boolean overlap(Neighborhood obj1, Neighborhood obj2){
				
		return ((obj1.end >= obj2.start && obj1.end <= obj2.end) || (obj2.end >= obj1.start && obj2.end <= obj1.end));
	}

	public static Neighborhood combine(Neighborhood obj1, Neighborhood obj2){
		return new Neighborhood(Math.min(obj1.start,obj2.start), Math.max(obj1.end,obj2.end));
	}

	public static List<Neighborhood> merge(List<Neighborhood> neighborhoods) {
    	/* YOUR CODE HERE */
		
		List<Neighborhood> output = new ArrayList<Neighborhood>();
		boolean isFirstObject = true;

		for(Neighborhood obj : neighborhoods) {
			if(isFirstObject) {
				isFirstObject = false;
				output.add(obj);
				continue;
			}

			boolean isOverlapping = false;

			int indexBuffer = 0;

			//Detect Overlapping
			for (Neighborhood temp : output) {
				if (overlap(obj,temp)) {
					isOverlapping = true;
					output.add(combine(obj,temp));
					output.remove(indexBuffer);
					break;
				}
				indexBuffer ++;
			}
			
			//Add parking spot if not overlapping
			if(!isOverlapping) {
				output.add(obj);
			}
		}

    	return output;   
    }
}