// https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true

package solution;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class JavaDateAndTime {

        /*
         * Complete the 'findDay' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER month
         *  2. INTEGER day
         *  3. INTEGER year
         */

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek.name());
        return "";
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        int day = scanner.nextInt();

        int year = scanner.nextInt();

        System.out.println(findDay(month, day, year));
    }
}

