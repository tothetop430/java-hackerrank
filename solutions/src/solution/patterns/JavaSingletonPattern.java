// https://www.hackerrank.com/challenges/java-singleton/problem

package solution.patterns;

public class JavaSingletonPattern {
    private static volatile JavaSingletonPattern instance;

    private JavaSingletonPattern() {}

    static JavaSingletonPattern getJavaSingletonPatterInstance() {
        if (instance == null) {
            synchronized (JavaSingletonPattern.class) {
                if (instance == null) {
                    instance = new JavaSingletonPattern();
                }
            }
        }
        return instance;
    }
}
