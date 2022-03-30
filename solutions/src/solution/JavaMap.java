// https://www.hackerrank.com/challenges/phone-book/problem

package solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void main(String []argh)
    {
        Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            System.out.println(map.get(s) == null ? "Not found" : s + "=" + map.get(s));
        }
    }

}
