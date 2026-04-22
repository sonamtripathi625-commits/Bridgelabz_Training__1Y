package Set;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Student> student =new ArrayList<>();
        student.add(new Student (101,90.5,"ram"));
        student.add(new Student (101,90.9,"ramesh"));
        student.add(new Student (101,80.5,"sita"));
        student.add(new Student (101,86.5,"sham"));
        student.add(new Student (101,88.5,"gita"));

        System.out.println(student);

    }
}
