// https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

package solution;

import java.util.Scanner;

public class JavaEOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while(scanner.hasNext()) {
            System.out.println(i + " " + scanner.nextLine());
            i++;
        }
    }
}
