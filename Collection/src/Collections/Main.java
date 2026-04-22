package Collections;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> e1= new LinkedList<>();
        e1.add(new Employee(101,"ram",60000));
        e1.add(new Employee(107,"ramesh",790000));
        e1.add(new Employee(109,"sita",90000));
        System.out.println("List of EmployeeBy using 'add()="+e1);


        for(Employee p1:e1){
            System.out.println(p1);
        }

    }
}
