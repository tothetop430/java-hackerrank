// https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

package solution.algorithm;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            String s = String.valueOf(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}
