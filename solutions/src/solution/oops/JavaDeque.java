// https://www.hackerrank.com/challenges/java-dequeue/problem

package solution.oops;

import java.util.*;

public class JavaDeque {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int mx = 0;
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        for (int i=0; i<m; i++) {
            int num = list.get(i);
            deque.addLast(num);
            int val = map.getOrDefault(num, 0)+1;
            map.put(num, val);
            if (val == 1) {
                mx = Integer.max(mx, ++count);
            }
        }

        for (int i=m; i<n; i++) {
            int num = list.get(i);
            int front = (int) deque.removeFirst();
            map.replace(front, map.get(front)-1);
            if (map.get(front) == 0) count--;
            deque.addLast(num);
            int val = map.getOrDefault(num, 0) + 1;
            map.put(num, val);
            if (val == 1) {
                mx = Integer.max(mx, ++count);
            }
        }

        System.out.println(mx);
    }

}
