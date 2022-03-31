// https://www.hackerrank.com/challenges/java-sort/problem

package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, Collections.reverseOrder((s1, s2) -> {
            int score = Double.compare(s1.getCgpa(), s2.getCgpa());
            int name = s2.getFname().compareTo(s1.getFname());
            int id = Integer.compare(s2.getId(), s1.getId());
            if (score == 0 && name == 0) return id;
            else if (score == 0) return name;
            else return score;
        }));

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }

}

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
