// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

package solution.oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/y);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }

}
