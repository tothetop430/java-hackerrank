// https://www.hackerrank.com/challenges/java-generics/problem

package solution;

import java.lang.reflect.Method;

class Printer<T> {
    public void printArray(T[] array) {
        for (T v: array) {
            System.out.println(v);
        }
    }
}

public class JavaGenerics {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }

}
