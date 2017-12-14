import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StressfulPark {

    /* DO NOT MODIFY BELOW THIS LINE */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileInput = new Scanner(new File("StressfulParkIN.txt"));

        while(fileInput.hasNext()) {

            String inputStr = fileInput.nextLine().trim();
            String[] inputStrArr = inputStr.split(" ");
            int N = Integer.parseInt(inputStrArr[0]);
            int M = Integer.parseInt(inputStrArr[1]);

            int[][] parkGrid = new int[N][M];

            for(int i = 0; i < N; i++) {
                String[] nextRow = fileInput.nextLine().trim().split(" ");

                for(int j = 0; j < M; j++) {
                    parkGrid[i][j] = Integer.parseInt(nextRow[j]);
                }
            }

            System.out.println(shortestTimeToExit(parkGrid));

        }
        fileInput.close();

    }
	/* DO NOT MODIFY ABOVE THIS LINE*/

    public static int shortestTimeToExit(int[][] parkGrid) {
		/* YOUR CODE HERE */
		int n = parkGrid.length;
        int m = parkGrid[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0) {
                    if (j == 0) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = dp[i][j-1] + parkGrid[i][j];
                    }
                } else {
                    if (j == 0) {
                        dp[i][j] = dp[i-1][j] + parkGrid[i][j];
                    } else {
                        dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + parkGrid[i][j];
                    }
                }
            }
        }
        return dp[n-1][m-1];
    }

}
