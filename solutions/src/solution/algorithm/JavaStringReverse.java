// https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true

package solution.algorithm;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(A.equals(new StringBuffer(A).reverse().toString()) ? "Yes" : "No");
    }

}
