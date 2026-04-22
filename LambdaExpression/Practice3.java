package LambdaExpression;

import java.util.*;

public class Practice3 {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,4,6,7,4,6,9,6,4,7,8,5,7,5,1,2,3,2,5,4,3);
        System.out.println(list);
        list.stream().sorted().toList().forEach(System.out::println);

        System.out.println("number for distinct the list=");
        list.stream().distinct().toList().forEach(System.out::println);


        System.out.println("list for even number=");
        list.stream().filter(x->x%2==0).forEach(System.out::println);
        System.out.println("list for odd number=");
        list.stream().filter(x->x%2!=0).forEach(System.out::println);
        System.out.println("list for map number=");
        list.stream().filter(x->x%2==0).map(n->n*n).forEach(System.out::println);







    }
}
