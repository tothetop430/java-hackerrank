// https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true

package solution;

import java.util.*;

public class StdInStdOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.format("%d\n%d\n%d", a, b, c);
    }
}
