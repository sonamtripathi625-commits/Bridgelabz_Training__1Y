package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);


        boolean b=list.isEmpty();
        System.out.println(b);

        boolean c=list.contains(70);
        System.out.println(c);

        int f=list.getFirst();
        System.out.println(f);

        list.remove(0);
        System.out.println(list);




    }
}
