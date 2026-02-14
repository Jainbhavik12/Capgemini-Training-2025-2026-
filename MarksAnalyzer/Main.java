package MarksAnalyzer;

import java.util.*;
import java.util.stream.*;

class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class StudentUtility {
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Stream<Student> convertToStream() {
        return studentList.stream();
    }

    public double averageMarks(Stream<Student> stream1) {
        return stream1.mapToInt(Student::getMarks).average().orElse(0.0);
    }

    public Student findTopper(Stream<Student> stream1) {
        return stream1.max(Comparator.comparingInt(Student::getMarks)).orElse(null);
    }

    public List<Student> sortByMarks(Stream<Student> stream1) {
        return stream1.sorted(Comparator.comparingInt(Student::getMarks))
                      .collect(Collectors.toList());
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            
            list.add(new Student(id, name, marks));
        }

        StudentUtility utility = new StudentUtility();
        utility.setStudentList(list);

        double avg = utility.averageMarks(utility.convertToStream());
        System.out.printf("\nAverage Marks: %.2f\n", avg);

        Student topper = utility.findTopper(utility.convertToStream());
        System.out.println("\nTop Scorer:");
        System.out.println(topper.getName() + " - " + topper.getMarks());

        List<Student> sorted = utility.sortByMarks(utility.convertToStream());
        System.out.println("\nStudents Sorted by Marks:");
        sorted.forEach(s -> System.out.println(s.getName() + " - " + s.getMarks()));
    }
}
