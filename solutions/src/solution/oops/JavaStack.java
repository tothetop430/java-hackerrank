// https://www.hackerrank.com/challenges/java-stack/problem

package solution.oops;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        char top;
        for (Character c: str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{' || c == '<') {
                stack.push(c);
                continue;
            }
            try {
                top = stack.peek();
            } catch (Exception e) {
                top = ' ';
            }
            if ((c == ')' || c == ']' || c == '}' || c == '>') && top == ' ') {
                return false;
            }
            if ((c == ')' && top == '(') ||
                    (c == ']' && top == '[') ||
                    (c == '}' && top == '{') ||
                    (c == '>' && top == '<')) {
                stack.pop();
            }
            else return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println(isBalanced(str));
        }
    }

}
