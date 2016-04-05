package Java.Collections.javaSort;

import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        super();
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

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String name = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, name, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort((student1, student2) -> {
            if (student1.getCgpa() < student2.getCgpa()) {
                return 1;
            } else if (student1.getCgpa() > student2.getCgpa()) {
                return -1;
            } else {
                if (student1.getName().compareTo(student2.getName()) == 0) {
                    return student1.getId() - student2.getId();
                } else {
                    return student1.getName().compareTo(student2.getName());
                }
            }
        });

        for (Student st : studentList) {
            System.out.println(st.getName());
        }
    }
}