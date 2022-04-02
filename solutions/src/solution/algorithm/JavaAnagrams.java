// https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

package solution.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.equals(b)) return true;
        int[] ar = new int[26];
        for (int i=0; i<a.length(); i++) {
            ar[a.charAt(i) - 'a']++;
        }
        for (int i=0; i<b.length(); i++) {
            ar[b.charAt(i) - 'a']--;
            if (ar[b.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
