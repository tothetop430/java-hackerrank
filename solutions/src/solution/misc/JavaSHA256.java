// https://www.hackerrank.com/challenges/sha-256/problem

package solution.misc;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] byteArray = md.digest(input.getBytes());
        BigInteger no = new BigInteger(1, byteArray);
        String hashtext = no.toString(16);
        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }
        System.out.println(hashtext);

    }

}
