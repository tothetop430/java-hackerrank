// https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

package solution;

import java.util.Scanner;

public class StdInStdOut2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble(); scan.nextLine();
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
