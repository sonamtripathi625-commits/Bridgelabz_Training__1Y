package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
    public Student(int id, String name, double percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    int id;
    String name;
    double percentage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    public static void main(String[] args) {
         List<Student> l1= Arrays.asList
                 (new Student(104,"seema",98.9),
                 new Student(103,"rahul",89.9),
                 new Student(105,"rameesh",77.9));
                System.out.println(l1);
        Collections.sort(l1,(Student a,Student b)->a.id-b.id);
        System.out.println(l1);
    }
}
