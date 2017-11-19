//James Gottshall(invention64), Patrick Liao(LBYPatrick), Ryan Baker
//November 18th, 2017

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Perfect {
  /* DO NOT MODIFY BELOW THIS LINE*/
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("PerfectIN.txt"));
      while (br.ready()) {
        System.out.println(isPerfect(Integer.parseInt(br.readLine())));
      }
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  /* DO NOT MODIFY ABOVE THIS LINE*/

public static boolean isPerfect(int n) {
    // YOUR CODE HERE

    ArrayList<Integer> divisors = new ArrayList<Integer>();
    
    int sumOfDivisors = 0;

    //Collect Divisors
    for(int i = 1; i <= n; ++i) 
        if(n%i == 0) divisors.add(i);

    //Check the sum
    for (int rotator : divisors) sumOfDivisors += rotator;

    return sumOfDivisors == n;
  }
}
