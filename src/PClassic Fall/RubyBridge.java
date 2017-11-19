//Tyler Liu (tylerliu), Gordon Zhao (gordongg), Leo Huang(SCLeo) and Davis Wang(wjx008)
//November 18th, 2017


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RubyBridge {
    public static void main(String[] args) throws IOException {
        // Before submitting, make sure the main method hasn't been changed!
        Scanner sc = new Scanner(new FileReader("RubyBridgeIN.txt"));
        while(sc.hasNext()) {
            int n = sc.nextInt();
            String charList = sc.next();
            char[] list = new char[n];
            for(int i = 0; i < n; i++) {
                list[i] = charList.charAt(i);
            }
            System.out.println(rubyBridge(n, list));
        }
        sc.close();
    }
    /* DO NOT MODIFY ABOVE THIS LINE */
    
    public static int rubyBridge(int n, char[] list) {
        /* YOUR CODE HERE */
        int pn = 0;
        int tn = 0;
        for (char c : list) {
            if (c == 'P') {
                pn++;
            } else {
                tn++;
            }
        }
        int longest = 0;
        for (int start = 0; start < n; start++) {
            if (longest > n - start) {
                break;
            }
            int p = pn;
            int t = tn;
            for (int i = 0; i < n - start; i++) {
                if (p == t) {
                    longest = Math.max(longest, n - i - start);
                    break;
                }
                if (list[n - i - 1] == 'P') {
                    p--;
                } else {
                    t--;
                }
            }
            if (list[start] == 'P') {
                pn--;
            } else {
                tn--;
            }
        }
        return longest;
    }
}
