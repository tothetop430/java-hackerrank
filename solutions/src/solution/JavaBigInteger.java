// https://www.hackerrank.com/challenges/java-biginteger/problem

package solution;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        scanner.close();
        BigInteger n1 = new BigInteger(s1);
        BigInteger n2 = new BigInteger(s2);
        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
    }

}
