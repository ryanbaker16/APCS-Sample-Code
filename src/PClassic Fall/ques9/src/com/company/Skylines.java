
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Skylines {
    // Before submitting, make sure the main method hasn't been changed!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("SkylinesIN.txt"));
        while (br.ready()) {
            int N = Integer.parseInt(br.readLine());
            List<Building> buildings = new ArrayList<Building>();
            for (int i = 0; i < N; i++) {
                String[] data = br.readLine().split(",");
                int l = Integer.parseInt(data[0]);
                int h = Integer.parseInt(data[1]);
                int r = Integer.parseInt(data[2]);
                buildings.add(new Building(l, h, r));
            }
            List<Strip> strips = getSkyline(buildings);
            List<String> stripStrings = strips.stream()
                    .map(strip -> "Strip(" + strip.left + ", " + strip.height + ")")
                    .collect(Collectors.toList());
            String output = String.join(", ", stripStrings);
            System.out.println("[" + output + "]");
        }
        br.close();
    }

    public static class Building {
        public int left, right, height;
        public Building(int left, int height, int right) {
            this.left = left;
            this.right = right;
            this.height = height;
        }
    };

    public static class Strip {
        public int left, height;
        public Strip(int left, int height) {
            this.left = left;
            this.height = height;
        }
    };

    // Fill out the body of this method
    public static List<Strip> getSkyline(List<Building> buildings) {
        List<Strip> skyline = new ArrayList<Strip>();
        buildings.sort(Comparator.comparingInt(a -> a.height));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (Building building : buildings) {
            Map.Entry<Integer, Integer> rightMostEntry = map.floorEntry(building.right);
            if ((rightMostEntry == null)) {
                map.put(building.left, building.height);
                map.put(building.right, 0);
            } else {
                int rightMostValue = rightMostEntry.getValue();
                Integer key = map.ceilingKey(building.left);
                while ((key != null) && key < building.right) {
                    map.remove(key);
                    key = map.ceilingKey(building.left);
                }
                map.put(building.right, rightMostValue);
                map.put(building.left, building.height);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            skyline.add(new Strip(entry.getKey(), entry.getValue()));
        }

        return skyline;
    }
}
