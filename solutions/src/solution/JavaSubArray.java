// https://www.hackerrank.com/challenges/java-negative-subarray/problem

package solution;

import java.util.Scanner;

public class JavaSubArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i=0; i<n ;i++) {
            int s = 0;
            for (int j=i; j<n; j++) {
                s += arr[j];
                if (s < 0) count++;
            }
        }
        System.out.println(count);
    }

}
