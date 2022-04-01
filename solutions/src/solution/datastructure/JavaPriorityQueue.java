// https://www.hackerrank.com/challenges/java-priority-queue/problem

package solution.datastructure;


import java.util.*;

public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", cgpa=" + cgpa +
//                '}';
//    }
}

class Priorities {
    private PriorityQueue<Student> queue;
    private Student student;

    public Priorities() {
        queue = new PriorityQueue<>(
                Comparator.comparing(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId)
        );
    }

    public List<Student> getStudents(List<String> events) {
        for (String event: events) {
            String[] sepEvent = event.split(" ");
            if (sepEvent[0].equals("ENTER")) {
                student = new Student(Integer.parseInt(sepEvent[3]),
                        sepEvent[1], Double.parseDouble(sepEvent[2]));
                queue.add(student);
//                System.out.println("ADD" + queue.toString());
            }
            else if (sepEvent[0].equals("SERVED")) {
                queue.remove();
//                System.out.println("REM" + queue.toString());
            }
        }
//        System.out.println(queue.toString());
        List<Student> list = new ArrayList<>();
        while(!queue.isEmpty()) {
            list.add(queue.poll());
        }
        return list;
    }
}