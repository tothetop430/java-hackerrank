// https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

package solution;

import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a + (int) Math.pow(2, 0) * b;
            System.out.printf("%d ", res);
            for (int j=1; j<n; j++) {
                res += (int) Math.pow(2, j) * b;
                System.out.printf("%d ", res);
            }
            System.out.println();
        }
        in.close();
    }
}
