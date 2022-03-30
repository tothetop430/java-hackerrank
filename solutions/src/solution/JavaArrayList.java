// https://www.hackerrank.com/challenges/java-arraylist/problem

package solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {

    public static void main(String[] args) {
        int n, d, q, x, y;

        List<List<Integer>> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while(n-->0) {
            List<Integer> intList = new ArrayList<>();
            d = scanner.nextInt();
            while(d-->0) {
                int a = scanner.nextInt();
                intList.add(a);
            }
            list.add(intList);
        }
        q = scanner.nextInt();
        while(q-->0) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }

}
