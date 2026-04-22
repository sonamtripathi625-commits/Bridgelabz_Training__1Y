package Queue;

import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {

        PriorityQueue<String> p1=new PriorityQueue<>();
        p1.add("riya");
        p1.add("ram");
        p1.add("shaam");
        p1.add("ramesh");
        p1.add("ankit");


        String s3=p1.element();
        System.out.println(p1);

        String s1=p1.peek();
        System.out.println(p1);

        String s2=p1.poll();
        System.out.println(p1);

        p1.offer("shaam");
        System.out.println(p1);


        boolean s4=p1.remove("ram");
        System.out.println(p1);

    }


}
