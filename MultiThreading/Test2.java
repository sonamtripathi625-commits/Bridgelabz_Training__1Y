package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
         list.add("sonam");
        list.add("soniya ");
        list.add("riya");
        list.add("tanya");
        System.out.println(list);

        String f=list.getFirst();
        System.out.println(f);

        list.remove(0);
        System.out.println(list);

    }
}