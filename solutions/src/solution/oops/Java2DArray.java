// https://www.hackerrank.com/challenges/java-2d-array/problem

package solution.oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Java2DArray {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
        int mx = Integer.MIN_VALUE;
        for (int i=1; i<5; i++) {
            for (int j=1; j<5; j++) {
                int count = arr.get(i).get(j) + arr.get(i-1).get(j)
                        + arr.get(i-1).get(j-1) + arr.get(i-1).get(j+1)
                        + arr.get(i+1).get(j) + arr.get(i+1).get(j-1)
                        + arr.get(i+1).get(j+1);
                mx = Integer.max(mx, count);
            }
        }

        System.out.println(mx);
    }

}
