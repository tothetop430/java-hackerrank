// https://www.hackerrank.com/challenges/java-bigdecimal/problem

package solution;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        Arrays.sort(s, Collections.reverseOrder((a1, b1) -> {
            return new BigDecimal(a1).compareTo(new BigDecimal(b1));
        }));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
