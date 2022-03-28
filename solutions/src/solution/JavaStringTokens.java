// https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true

package solution;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {

    private static void getStringTokens(String str) {
        if (str.trim().equals("")) System.out.println(0);
        else {
            String[] strArray = str.trim().split("[ '.,!?@_]+");
            System.out.println(strArray.length);
            for (String s : strArray) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        getStringTokens(s);
        scan.close();
    }

}
