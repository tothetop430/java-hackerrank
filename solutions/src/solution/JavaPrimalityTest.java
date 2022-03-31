// https://www.hackerrank.com/challenges/java-primality-test/problem

package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        BigInteger N = new BigInteger(n);

        System.out.println(N.isProbablePrime(3) ? "prime" : "not prime");
    }

}
