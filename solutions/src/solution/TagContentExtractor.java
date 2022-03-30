// https://www.hackerrank.com/challenges/tag-content-extractor/problem

package solution;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            Matcher m = Pattern.compile("<(.+)>([^<>]+)</\\1>").matcher(line);

            if (!m.find()) {
                System.out.println("None");
            }
            else {
                m.reset();
                while(m.find()) {
                    System.out.println(m.group(2));
                }
            }
            testCases--;
        }
    }

}
