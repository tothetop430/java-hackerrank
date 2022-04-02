// https://www.hackerrank.com/challenges/java-list/problem

package solution.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        int n, q, x, y;
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i=0; i<n; i++) {
            list.add(scanner.nextInt());
        }
        q = scanner.nextInt();
        while(q-->0) {
            String query = scanner.next();
            if (query.equals("Insert")) {
                x = scanner.nextInt();
                y = scanner.nextInt();
                list.add(x, y);
            }
            else {
                x = scanner.nextInt();
                list.remove(x);
            }
        }
        for (Integer i: list) {
            System.out.print(i + " ");
        }
    }

}
