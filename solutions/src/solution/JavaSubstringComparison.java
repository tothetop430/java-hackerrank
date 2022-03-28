// https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true

package solution;

import java.util.Scanner;

public class JavaSubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i=1, j=k+1; j<=s.length(); i++, j++) {
            smallest = s.substring(i, j).compareTo(smallest) < 0 ? s.substring(i, j) : smallest;
            largest = s.substring(i, j).compareTo(largest) > 0 ? s.substring(i, j) : largest;
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
