import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Tristrum on 11/14/17.
 */
public class TowerTycoon {
    static int[][][] dp;

    static List<String> tower(int numberOfLists, String[][] inhabitantList) {
        //YOUR CODE HERE
        List<String> name = new ArrayList<>();
        int numUsed = 0;
        Map<String, Integer> inde = new HashMap<>();
        dp = new int [100][100][100];
        //dp = new int[1000][1000][1000];

        for (String[] i :inhabitantList){
            for (String j : i){
                if (inde.get(j) == null){
                    inde.put(j, numUsed);
                    name.add(j);
                    numUsed++;
                }
            }
            for (int j = 0; j < i.length - 1; j ++){
                dp[inde.get(i[j])][inde.get(i[j+1])][0] = 1;
            }
        }

        //dp
        for (int temp = 1; temp < numUsed; temp ++)
            for (int i = 0; i < numUsed; i ++)
                for (int j = 0; j < numUsed; j ++)
                    dp[i][j][temp] = Math.max(dp[i][j][temp - 1], dp[i][temp][temp - 1] + dp[temp][j][temp - 1]);

        int ori = 0;
        for (int i = 0; i < numUsed; i ++){
            if (dp[ori][i][numUsed - 1] == 0) ori = i;
        }


        List<String> list = new LinkedList<>();
        for (int i = 0; i < numUsed; i ++){
            for (int j = 0; j < numUsed; j ++){
                if (dp[ori][j][numUsed - 1] == i) {
                    list.add(name.get(j));
                    break;
                }
            }
        }
        return list;
    }

    //DO NOT MODIFY BELOW THIS LINE
    public static void main(String[] args) throws IOException {
        HashMap<String, List<String>> vertexMap = new HashMap<>();
        Scanner sc = new Scanner(new FileReader("TowerTycoonIN.txt"));
        while(sc.hasNext()) {
            int numberOfLists = Integer.parseInt(sc.nextLine());
            String[][] inhabitantList = new String[numberOfLists][];
            for (int i = 0; i < numberOfLists; i++) {
                String line = sc.nextLine();
                String[] inhabitants = line.split(" ");
                inhabitantList[i] = inhabitants;
            }
            System.out.println(tower(numberOfLists, inhabitantList));
        }
        sc.close();

    }
}
