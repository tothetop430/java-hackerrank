// https://www.hackerrank.com/challenges/java-bitset/problem

package solution;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {
        Map<Integer, BitSet> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        b1.clear();
        b2.clear();
        map.put(1, b1);
        map.put(2, b2);
        for (int i=0; i<m; i++) {
            String action = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (action.equals("AND")) {
                map.get(x).and(map.get(y));
            }
            else if (action.equals("OR")) {
                map.get(x).or(map.get(y));
            }
            else if (action.equals("XOR")) {
                map.get(x).xor(map.get(y));
            }
            else if (action.equals("FLIP")) {
                map.get(x).flip(y);
            }
            else {
                map.get(x).set(y);
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}
